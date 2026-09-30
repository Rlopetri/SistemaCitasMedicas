import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    private static final String CARPETA_DB = "db";

    public static void inicializarArchivos() {

        File carpeta = new File(CARPETA_DB);

        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        crearArchivoSiNoExiste("doctores.csv");
        crearArchivoSiNoExiste("pacientes.csv");
        crearArchivoSiNoExiste("citas.csv");
    }

    private static void crearArchivoSiNoExiste(String nombreArchivo) {

        File archivo = new File(CARPETA_DB, nombreArchivo);

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println(
                        "Archivo creado: " + archivo.getPath()
                );
            } catch (IOException e) {
                System.out.println(
                        "Error al crear el archivo: " + nombreArchivo
                );
            }
        }
    }

    public static void guardarDoctores(ArrayList<Doctor> doctores) {

        try (FileWriter archivo =
                     new FileWriter(CARPETA_DB + "/doctores.csv")) {

            for (Doctor doctor : doctores) {
                archivo.write(doctor.toString() + "\n");
            }

            System.out.println("Doctores guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los doctores.");
        }
    }

    public static void guardarPacientes(ArrayList<Paciente> pacientes) {

        try (FileWriter archivo =
                     new FileWriter(CARPETA_DB + "/pacientes.csv")) {

            for (Paciente paciente : pacientes) {
                archivo.write(paciente.toString() + "\n");
            }

            System.out.println("Pacientes guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los pacientes.");
        }
    }

    public static void guardarCitas(ArrayList<Cita> citas) {

        try (FileWriter archivo =
                     new FileWriter(CARPETA_DB + "/citas.csv")) {

            for (Cita cita : citas) {
                archivo.write(cita.toString() + "\n");
            }

            System.out.println("Citas guardadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar las citas.");
        }
    }
}