package BancoDigital;

import java.util.Date;

public abstract class Conta implements IConta {

  private static int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;
  private Date dataCriacao;
  private boolean ativa;
  private boolean possuiCredito;
  private CartaoCredito cartaoCredito;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
    this.ativa = Boolean.TRUE;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public int getNumero() {
    return this.numero;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public CartaoCredito getCartaoCredito() {
    return cartaoCredito;
  }

  public void setCartaoCredito(CartaoCredito cartaoCredito) {
    this.cartaoCredito = cartaoCredito;
  }

  public boolean isPossuiCredito() {
    return possuiCredito;
  }

  public void setPossuiCredito(boolean possuiCredito) {
    this.possuiCredito = possuiCredito;
  }

  protected void informacoesConta() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Conta: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void transferir(double valor, IConta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }
}
