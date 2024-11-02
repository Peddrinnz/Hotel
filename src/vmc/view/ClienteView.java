package vmc.view;

import javax.swing.JOptionPane;

import vmc.controller.ClienteController;
import vmc.model.ClienteModel;

public class ClienteView {
    ClienteModel cliente = new ClienteModel();
    ClienteController controller = new ClienteController();
    
    public void cadastroCliente() {

        try {
            cliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
            cliente.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu CPF: ")));
            cliente.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone: ")));
            cliente.setEmail(JOptionPane.showInputDialog("Digite seu email: "));
            JOptionPane.showMessageDialog(null, controller.cadastrarCliente(cliente));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente");
        }
    }       
}
