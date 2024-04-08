public class Libro {
    String titulo;
    String autor;
    String ISBN;
    String editorial;
    int anoPublicado;
    double precio;

    public Libro(String titulo, String autor, String ISBN, String editorial, int anoPublicado, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.anoPublicado = anoPublicado;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}


