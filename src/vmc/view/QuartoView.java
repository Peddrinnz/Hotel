package vmc.view;

import javax.swing.JOptionPane;

import vmc.controller.QuartoController;
import vmc.model.QuartoModel;

public class QuartoView {
    public void cadastroQuarto() {
        QuartoModel quarto = new QuartoModel();
        try {   
            quarto.setNum_Quarto(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto: ")));
            quarto.setTipo_Quarto(JOptionPane.showInputDialog("Digite o tipo do quarto: "));
            quarto.setPreco_Quarto(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do quarto: ")));
            quarto.setStatus_Quarto(JOptionPane.showInputDialog("Digite o status do quarto: "));
            JOptionPane.showMessageDialog(null, new QuartoController().cadastrarQuarto(quarto));
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o quarto");
        }
    }
}
