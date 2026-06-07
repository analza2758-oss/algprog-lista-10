public class App {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(
                "Ana Luiza",
                20,
                "12345678900",
                "ana@email.com"
        );

        pessoa.falar();
        pessoa.comer();

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                "Prata",
                "ABC-1234"
        );

        carro.ligar();
        carro.acelerar();

        Animal animal = new Animal(
                "Rex",
                "Cachorro",
                5,
                12.5
        );

        animal.emitirSom();

        Aluno aluno = new Aluno(
                "Ana Luiza",
                "2025001",
                "Ciência da Computação",
                1
        );

        aluno.estudar();
    }
}
