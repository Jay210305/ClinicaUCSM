package com.mycompany.clinicaapp;
        
import com.mycompany.models.cita;
import com.mycompany.models.eodonto;
import com.mycompany.models.paciente;
 import java.sql.*;
 import java.util.Scanner;
 
 public class ClinicaApp {

    private static Connection connection;
    
     public static void main(String[] args) {
        conectarBaseDeDatos();
    }
     
     public static void conectarBaseDeDatos() {
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/clinicadb", "postgres", "root");
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void registrarPaciente(paciente paciente) {
        conectarBaseDeDatos();
        String sql = "{ CALL sp_registrar_paciente(?, ?, ?, ?, ?)}";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, paciente.getDocid());
            cstmt.setString(2, paciente.getName());
            cstmt.setString(3, paciente.getApaterno());
            cstmt.setString(4, paciente.getAmaterno());
            cstmt.setString(5, paciente.getEmail());
            cstmt.execute();
            System.out.println("Paciente registrado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar paciente: " + e.getMessage());
        }
    }
    
    public static void registrarCita(cita cita) {
        String sql = "{CALL sp_registrar_cita(?, ?, ?, ?, ?, ?, ?, ?)}";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, cita.getNcita());
            cstmt.setInt(2, cita.getDocid());
            cstmt.setInt(3, cita.getCode());
            cstmt.setInt(4, cita.getDay());
            cstmt.setInt(5, cita.getMonth());
            cstmt.setInt(6, cita.getYear());
            cstmt.setInt(7, cita.getTurno());
            cstmt.setString(8, cita.getMotivo());
            cstmt.execute();
            System.out.println("Cita registrada exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar cita: " + e.getMessage());
        }
    }

    public static void mostrarPacientesYCantidadCitas(int docid) {
        String sql = "SELECT * FROM sp_mostrar_citas_paciente(?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, docid);
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("Citas del paciente con DNI " + docid + ":");
                while (rs.next()) {
                    int ncita = rs.getInt("ncita");
                    int dia = rs.getInt("dia");
                    int mes = rs.getInt("mes");
                    int anio = rs.getInt("anio");
                    String motivo = rs.getString("motivo");
                    System.out.println("Cita #" + ncita + ": " + dia + "/" + mes + "/" + anio + " - Motivo: " + motivo);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar citas del paciente: " + e.getMessage());
        }
    }
 
    public static void contarCitasOdontologo(Scanner scanner) {
        System.out.print("Ingrese el código del odontólogo: ");
        int code = scanner.nextInt();
        scanner.nextLine();

        String query = "SELECT fn_contar_citas_odontologo(?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, code);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int nrocitas = rs.getInt(1);
                    System.out.println("Número de citas del odontólogo con código " + code + ": " + nrocitas);
                } else {
                    System.out.println("No se encontraron citas para el odontólogo con código " + code);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al contar citas del odontólogo: " + e.getMessage());
        }
    }

 
    public static void mostrarCitasRegistradas() {
        String sql = "CALL contar_citas_registradas()";
        
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 
    public static void mostrarCitasOdontologo(Scanner scanner) {
        System.out.print("Ingrese el código del odontólogo (code): ");
        int code = scanner.nextInt();
        
        String sql = "CALL mostrar_citas_odontologo(?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, code);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 
     public static void mostrarCitasTurnoEspecifico() {
        String sql = "CALL sp_mostrar_citas_por_turno(?, ?, ?, ?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, 1); 
            cstmt.setInt(2, 5);
            cstmt.setInt(3, 10);
            cstmt.setInt(4, 2023);
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Cita: " + rs.getInt("ncita") + 
                        ", Día: " + rs.getInt("day") +
                        ", Mes: " + rs.getInt("month") +
                        ", Año: " + rs.getInt("year") +
                        ", Motivo: " + rs.getString("motivo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

     }
 
     public static void mostrarEmpleadoPorteria() {
        String sql = "CALL sp_mostrar_empleado_porteria(?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, 4);
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("ID Lista: " + rs.getInt("id_lista") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Apellido: " + rs.getString("apaterno"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
 
     public static void mostrarCitasPosteriores() {
        String sql = "CALL sp_mostrar_citas_posteriores(?, ?, ?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, 19);
            cstmt.setInt(2, 10);
            cstmt.setInt(3, 2023);
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Cita: " + rs.getInt("ncita") + 
                        ", Día: " + rs.getInt("day") +
                        ", Mes: " + rs.getInt("month") +
                        ", Año: " + rs.getInt("year") +
                        ", Motivo: " + rs.getString("motivo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
 
     public static void mostrarPacienteYEstudiante() {
        String sql = "CALL sp_mostrar_pacientes_y_odontologos()";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Paciente: " + rs.getString("paciente") + 
                        ", Odontólogo: " + rs.getString("odontologo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
 }
 