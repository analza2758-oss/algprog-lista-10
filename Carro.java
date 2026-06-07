public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void buzinar() {
        System.out.println("Biiii!");
    }

    public void ligar() {
        System.out.println("O carro foi ligado.");
    }
}