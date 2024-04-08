import java.util.HashMap;

public class Libreria {
    private HashMap<String, Libro> inventario = new HashMap<>();

    public void agregarlibro(Libro libro){
        inventario.put(libro.getTitulo(),libro);
        System.out.println("el libro fue agregado");
    }
    public Libro buscarlibrotitulo(String titulo){
        return inventario.get(titulo);
    }
    public void buscarlibroautor(String autor){
        boolean encontrado = false;
        for (Libro libro : inventario.values()){
            if (libro.getAutor().equalsIgnoreCase(autor)){
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor especificado.");
        }
    }
    public void mostrarInventario() {
        System.out.println("Inventario de la Libreria:");
        for (Libro libro : inventario.values()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }


}
