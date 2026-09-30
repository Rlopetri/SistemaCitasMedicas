import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        } else {
            System.out.println("\nAcceso denegado.");
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}
