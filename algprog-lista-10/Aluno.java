public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }

    public void assistirAula() {
        System.out.println(nome + " está assistindo aula.");
    }

    public void fazerProva() {
        System.out.println(nome + " está fazendo prova.");
    }

    public void entregarAtividade() {
        System.out.println(nome + " entregou uma atividade.");
    }
}
