package vmc.repository;

import java.util.ArrayList;
import java.util.List;

import vmc.model.QuartoModel;

public class QuartoRepository {
    List<QuartoModel> quartos = new ArrayList<>();

    public String salvarQuarto(QuartoModel quarto) {
        if (quarto != null) {
            quartos.add(quarto);
            return "Quarto salvo com sucesso";
        } else {
            return "Erro ao salvar o quarto";
        }
    }
}
