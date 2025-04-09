public class ContaPoupanca {
    private double taxaRendimento = 0.02;

    public ContaPoupanca(Cliente cliente, String numeroConta, double saldoInicial) {
        super();
    }

    public void aplicarRendimento(double saldo) {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento aplicado! Novo saldo R$" + saldo);
    }

    public void aplicarRendimento() {
    }

    public void depositar(double valor) {
    }
}
