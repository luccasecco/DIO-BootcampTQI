package BancoDigital;

public class App {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.setNome("Cliente");

    IConta contaCorrente = new ContaCorrente(cliente1);
    contaCorrente.depositar(200);

    IConta contaPoupanca = new ContaPoupanca(cliente1);
    contaCorrente.transferir(100, contaPoupanca);

    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();
  }
}
