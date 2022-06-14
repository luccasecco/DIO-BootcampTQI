package one_digitalinnovation_gof.facade;

import subsistema1_crm.CrmService;
import subsistema2_cep.CepApi;

public class Facade {

  public void atualizarCiente(String nome, String cep) {
    String cidade = CepApi.getInstancia().recuperarCidade(cep);
    String estado = CepApi.getInstancia().recuperarEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);
  }
}
