
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirAgenciaEConta();
    }
}
