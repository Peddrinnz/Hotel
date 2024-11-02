package vmc.repository;

import vmc.model.ClienteModel;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    List<ClienteModel> clientes = new ArrayList<>();

    public String salvar(ClienteModel cliente) {
        if (cliente != null) {
            clientes.add(cliente);
            return "Cliente salvo com sucesso.";
        } else {
            return "Erro ao salvar o cliente.";
        }
    }
}
