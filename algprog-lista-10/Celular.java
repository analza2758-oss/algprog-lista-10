public class Celular {

    private String marca;
    private String modelo;
    private int memoria;
    private String sistema;

    public Celular(String marca, String modelo, int memoria, String sistema) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.sistema = sistema;
    }

    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void enviarMensagem() {
        System.out.println("Mensagem enviada.");
    }

    public void tirarFoto() {
        System.out.println("Foto tirada.");
    }

    public void fazerLigacao() {
        System.out.println("Realizando ligação.");
    }
}
