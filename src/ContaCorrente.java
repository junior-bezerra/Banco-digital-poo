public class ContaCorrente extends Conta {
    private  double taxaSaque = 5.0;
    public ContaCorrente(Cliente cliente, String numeroConta, double saldoInicial) {
        super(cliente, numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + taxaSaque;
        return super.sacar(valorComTaxa);
    }
}
