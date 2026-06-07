public class Bicicleta {

    private String marca;
    private String cor;
    private int tamanho;
    private int marchas;

    public Bicicleta(String marca, String cor, int tamanho, int marchas) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marchas = marchas;
    }

    public void pedalar() {
        System.out.println("Pedalando.");
    }

    public void frear() {
        System.out.println("Freando.");
    }

    public void virar() {
        System.out.println("Virando.");
    }

    public void trocarMarcha() {
        System.out.println("Marcha alterada.");
    }
}