
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Erion");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(100, cp);

        cc.imprimirSaldo();
        cp.imprimirSaldo();
    }
}
