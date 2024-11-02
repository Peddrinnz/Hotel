package vmc.model;

import java.util.Date;

public class ReservaModel {
    private ClienteModel cliente = new ClienteModel();
    private Date data_entrada = new Date();
    private Date data_saida = new Date();
    private QuartoModel quarto = new QuartoModel();

    public ClienteModel getCliente() {
        return cliente;
    }
    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    public Date getData_entrada() {
        return data_entrada;
    }
    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }
    public QuartoModel getQuarto() {
        return quarto;
    }
    public void setQuarto(QuartoModel quarto) {
        this.quarto = quarto;
    }
    public Date getData_saida() {
        return data_saida;
    }
    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    
}
