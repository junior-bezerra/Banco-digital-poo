public class Conta {
    protected Cliente cliente;
    protected  String numeroConta;
    protected double saldo;

    public Conta(Cliente cliente, String numeroConta, double saldoinicial) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoinicial;
    }
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public  boolean sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;

        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return cliente + " conta: " + numeroConta + " Saldo R$:" + saldo;
    }
}

