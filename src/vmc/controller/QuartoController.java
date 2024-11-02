package vmc.controller;

import vmc.model.QuartoModel;
import vmc.repository.QuartoRepository;

public class QuartoController {
    private QuartoRepository repository = new QuartoRepository();

    public String cadastrarQuarto(QuartoModel quarto) {
        return repository.salvarQuarto(quarto);
    }
}
