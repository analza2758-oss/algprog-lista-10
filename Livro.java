public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private String genero;

    public Livro(String titulo, String autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public void abrir() {
        System.out.println("Livro aberto.");
    }

    public void fechar() {
        System.out.println("Livro fechado.");
    }

    public void folhear() {
        System.out.println("Folheando livro.");
    }

    public void ler() {
        System.out.println("Lendo livro.");
    }
}
