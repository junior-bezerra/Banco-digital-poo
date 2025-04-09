public class Transferencia {
    public static boolean realizarTransferencia(Conta origem, ContaPoupanca destino, double valor) {
        if (origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Tramsferência de R$" + valor + " realizado com sucesso!");
            return true;
        }
        System.out.println("Transferência falhou!");
        return false;
    }
}
