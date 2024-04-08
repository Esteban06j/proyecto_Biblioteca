import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int opcion = 0;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1) Agregar Nuevo Libro:");
            System.out.println("2) Buscar Libro Por Titulo :");
            System.out.println("3) Buscar Libro Por Autor :");
            System.out.println("4) Mostrar Inventario :");
            System.out.println("5) Realizar Prestamo :");
            System.out.println("6) Devolver Libro Prestado :");
            System.out.println("7) Salir :");
            System.out.println( "Seleccione una Opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese los datos del nuevo libro:");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Editorial: ");
                    String editorial = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anioPublicacion = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    Libro nuevoLibro = new Libro(titulo, autor, isbn, editorial, anioPublicacion, precio);
                    libreria.agregarlibro(nuevoLibro);
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroEncontrado = libreria.buscarlibrotitulo(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println("Título: " + libroEncontrado.getTitulo());
                        System.out.println("Autor: " + libroEncontrado.getAutor());
                        // Mostrar más detalles del libro si es necesario
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el autor del libro a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    libreria.buscarlibroautor(autorBuscar);
                    break;

                case 4:
                    libreria.mostrarInventario();
                    break;
                case 5:
                    // me falta Implementar la lógica para realizar préstamo
                    System.out.println("Función no implementada.");
                    break;
                case 6:
                    // me falta Implementa la lógica para devolver libro prestado
                    System.out.println("Función no implementada.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }

        }while (opcion != 7);
        scanner.close();
    }
}