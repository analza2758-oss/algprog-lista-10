public class Animal {

    private String nome;
    private String especie;
    private int idade;
    private double peso;

    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo um som.");
    }
}