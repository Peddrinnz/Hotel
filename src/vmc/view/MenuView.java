package vmc.view;

import javax.swing.*;

public class MenuView {

    int op = 0;
    String menu = "Menu Principal\n" +
    "1 - Cadastrar Cliente e quartos" + 
    "\n2 - Consultar quartos disponiveis" +
    "\n3 - Fazer Reserva" +
    "\n4 - Cancelar Reserva" +
    "\n0 - Sair";

    public void menuPrincipal(){
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (op) {
                case 1:
                    new ClienteView().cadastroCliente();
                    new QuartoView().cadastroQuarto();
                    break;
                case 2:
                    break;    
                case 3:
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }while(op != 0);
    }
}
