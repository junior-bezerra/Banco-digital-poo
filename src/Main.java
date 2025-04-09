//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João Silva", "1345644-56");
        Cliente maria = new Cliente("Maria Souza", "1345644-56");

        ContaCorrente contaJoao = new ContaCorrente(joao, "12345-6", 1500);
        ContaPoupanca contaMaria = new ContaPoupanca(maria, "998861-6", 1000);

        System.out.println(contaJoao);
        System.out.println(contaMaria);

        contaJoao.depositar(500);
        contaJoao.sacar(300);
        contaMaria.aplicarRendimento();

        Transferencia.realizarTransferencia(contaJoao, contaMaria, 700);

        System.out.println("\nSaldos após operações:");
        System.out.println(contaJoao);
        System.out.println(contaMaria);


    }
}