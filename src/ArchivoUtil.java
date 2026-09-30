import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    public static void guardarDoctores(ArrayList<Doctor> doctores) {

        try (FileWriter archivo = new FileWriter("doctores.csv")) {

            for (Doctor doctor : doctores) {
                archivo.write(doctor.toString() + "\n");
            }

            System.out.println("Doctores guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los doctores.");
        }
    }

    public static void guardarPacientes(ArrayList<Paciente> pacientes) {

        try (FileWriter archivo = new FileWriter("pacientes.csv")) {

            for (Paciente paciente : pacientes) {
                archivo.write(paciente.toString() + "\n");
            }

            System.out.println("Pacientes guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los pacientes.");
        }
    }

    public static void guardarCitas(ArrayList<Cita> citas) {

        try (FileWriter archivo = new FileWriter("citas.csv")) {

            for (Cita cita : citas) {
                archivo.write(cita.toString() + "\n");
            }

            System.out.println("Citas guardadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar las citas.");
        }
    }
}