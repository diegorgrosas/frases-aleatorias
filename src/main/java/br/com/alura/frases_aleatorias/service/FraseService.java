package br.com.alura.frases_aleatorias.service;

import br.com.alura.frases_aleatorias.dto.FraseDTO;
import br.com.alura.frases_aleatorias.model.Frase;
import br.com.alura.frases_aleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
