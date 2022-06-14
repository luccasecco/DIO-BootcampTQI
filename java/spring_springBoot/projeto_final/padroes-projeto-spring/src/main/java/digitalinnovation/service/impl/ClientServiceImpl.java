package digitalinnovation.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digitalinnovation.model.Address;
import digitalinnovation.model.AddressRepository;
import digitalinnovation.model.Client;
import digitalinnovation.model.ClientRepository;
import digitalinnovation.service.ClientService;
import digitalinnovation.service.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientRepository clientRepository;
  @Autowired
  private AddressRepository addressRepository;
  @Autowired
  private ViaCepService viaCepService;

  @Override
  public Iterable<Client> buscarTodos() {
    return clientRepository.findAll();
  }

  @Override
  public Client buscarPorId(Long id) {
    Optional<Client> client = clientRepository.findById(id);
    return client.get();
  }

  @Override
  public void inserir(Client client) {
    salvarClienteComCep(client);
  }

  @Override
  public void atualizar(Long id, Client client) {
    Optional<Client> clientBd = clientRepository.findById(id);
    if (clientBd.isPresent()) {
      salvarClienteComCep(client);
    }
  }

  @Override
  public void deletar(Long id) {
    clientRepository.deleteById(id);
  }

  private void salvarClienteComCep(Client client) {
    String cep = client.getAddress().getCep();
    Address address = addressRepository.findById(cep).orElseGet(() -> {
      Address newAddress = viaCepService.consultarCep(cep);
      addressRepository.save(newAddress);
      return newAddress;
    });
    client.setAddress(address);
    clientRepository.save(client);
  }
}
