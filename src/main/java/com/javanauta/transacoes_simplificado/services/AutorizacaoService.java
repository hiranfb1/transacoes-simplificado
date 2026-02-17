package com.javanauta.transacoes_simplificado.services;

import com.javanauta.transacoes_simplificado.infrastructure.client.AutorizacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AutorizacaoService {
    private final AutorizacaoClient client;

    public boolean validarTransferencia() {
        if (Objects.equals(client.validarAutorizacao().data().authorization(), "true")) {
            return true;
        } else {
            return false;
        }
    }
}