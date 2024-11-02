package vmc.controller;

import vmc.model.ClienteModel;
import vmc.repository.ClienteRepository;

public class ClienteController {
    private ClienteRepository repository = new ClienteRepository();

    public String cadastrarCliente(ClienteModel cliente) {
        return repository.salvar(cliente);
    }
}
