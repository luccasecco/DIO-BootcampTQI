package BancoDigital;

public interface IConta {

  void sacar(double valor);

  void depositar(double valor);

  void transferir(double valor, IConta contaDestino);

  void imprimirExtrato();

  // void solicitarCartao(Conta conta) throws ParseException;

  // void exibirDadosBancarios(Conta conta);

}
