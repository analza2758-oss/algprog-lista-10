public class Televisao {

    private String marca;
    private int tamanho;
    private String resolucao;
    private String modelo;

    public Televisao(String marca, int tamanho, String resolucao, String modelo) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("TV ligada.");
    }

    public void desligar() {
        System.out.println("TV desligada.");
    }

    public void trocarCanal() {
        System.out.println("Canal alterado.");
    }

    public void aumentarVolume() {
        System.out.println("Volume aumentado.");
    }
}