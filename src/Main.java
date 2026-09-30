import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArchivoUtil.inicializarArchivos();

        ArrayList<Doctor> doctores = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Cita> citas = new ArrayList<>();

        Administrador administrador =
                new Administrador("admin", "1234");

        System.out.println("=== SISTEMA DE CITAS MÉDICAS ===");
        System.out.println("Control de acceso");

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        if (administrador.iniciarSesion(usuario, contrasena)) {

            System.out.println("\nAcceso concedido.");
            System.out.println("Bienvenido al Sistema de Citas Médicas.");

            // Datos de prueba para consultar información
            Doctor doctor =
                    new Doctor("D001", "Juan Pérez", "Cardiología");

            Paciente paciente =
                    new Paciente("P001", "María López");

            Cita cita =
                    new Cita("C001", "15/10/2026", "10:30",
                            "Consulta general", doctor, paciente);

            doctores.add(doctor);
            pacientes.add(paciente);
            citas.add(cita);

            System.out.println("\n=== INFORMACIÓN REGISTRADA ===");

            System.out.println("\nDOCTORES:");
            for (Doctor d : doctores) {
                System.out.println(d);
            }

            System.out.println("\nPACIENTES:");
            for (Paciente p : pacientes) {
                System.out.println(p);
            }

            System.out.println("\nCITAS:");
            for (Cita c : citas) {
                System.out.println(c);
            }System.out.println("\n=== GUARDANDO INFORMACIÓN ===");

            ArchivoUtil.guardarDoctores(doctores);
            ArchivoUtil.guardarPacientes(pacientes);
            ArchivoUtil.guardarCitas(citas);

        } else {

            System.out.println("\nAcceso denegado.");
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}