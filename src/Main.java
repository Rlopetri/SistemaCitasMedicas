import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cita> citas = new ArrayList<>();

        // Datos de prueba
        Doctor doctor = new Doctor("D001", "Juan Pérez", "Cardiología");
        Paciente paciente = new Paciente("P001", "María López");

        System.out.println("=== SISTEMA DE CITAS MÉDICAS ===");
        System.out.println("Creación de cita");

        System.out.print("Ingresa el ID de la cita: ");
        String id = scanner.nextLine();

        System.out.print("Ingresa la fecha de la cita: ");
        String fecha = scanner.nextLine();

        System.out.print("Ingresa la hora de la cita: ");
        String hora = scanner.nextLine();

        System.out.print("Ingresa el motivo de la cita: ");
        String motivo = scanner.nextLine();

        Cita cita = new Cita(id, fecha, hora, motivo, doctor, paciente);
        citas.add(cita);

        System.out.println("\nCita creada correctamente.");
        System.out.println("Datos de la cita:");
        System.out.println("ID: " + cita.getId());
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Motivo: " + cita.getMotivo());
        System.out.println("Doctor: " + cita.getDoctor().getNombre());
        System.out.println("Paciente: " + cita.getPaciente().getNombre());

        scanner.close();
    }
}