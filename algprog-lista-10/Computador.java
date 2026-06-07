public class Computador {

    private String processador;
    private int memoriaRam;
    private int armazenamento;
    private String sistema;

    public Computador(String processador, int memoriaRam, int armazenamento, String sistema) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }

    public void ligar() {
        System.out.println("Computador ligado.");
    }

    public void desligar() {
        System.out.println("Computador desligado.");
    }

    public void executarPrograma() {
        System.out.println("Programa executado.");
    }

    public void conectarInternet() {
        System.out.println("Conectado à internet.");
    }
}
