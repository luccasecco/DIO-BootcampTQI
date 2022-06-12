package BancoDigital;

import java.util.List;
import java.util.Date;

public class Banco {

  private String nome;
  private String cnpj;
  private Date dataCriacao;
  private String codigo;
  private List<Conta> contas;

  public Banco() {
    this.nome = "DIO_Java";
    this.cnpj = "0000000000000";
    this.dataCriacao = new Date();
    this.codigo = "0001";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

}
