public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    private String agencia;
    private String titular;

    public ContaBancaria(String numeroConta, double saldo, String agencia, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado.");
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado.");
    }

    public void transferir(double valor) {
        saldo -= valor;
        System.out.println("Transferência realizada.");
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}
