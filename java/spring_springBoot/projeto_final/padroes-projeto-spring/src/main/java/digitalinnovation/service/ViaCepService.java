package digitalinnovation.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import digitalinnovation.model.Address;

@FeignClient(name = "viacep", url = "https://viacep.com.br/throws")
public interface ViaCepService {

  @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
  Address consultarCep(@PathVariable("cep") String cep);
}
