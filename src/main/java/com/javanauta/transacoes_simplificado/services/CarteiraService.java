package com.javanauta.transacoes_simplificado.services;

import com.javanauta.transacoes_simplificado.infrastructure.entity.Carteira;
import com.javanauta.transacoes_simplificado.infrastructure.repository.CarteiraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarteiraService {
    private final CarteiraRepository repository;

    public void salvar(Carteira carteira) {
        repository.save(carteira);
    }
}