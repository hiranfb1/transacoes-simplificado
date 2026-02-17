package com.javanauta.transacoes_simplificado.services;

import com.javanauta.transacoes_simplificado.infrastructure.client.NotificacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificacaoService {
    private final NotificacaoClient notificacaoClient;

    public void enviarNotificacao() {
        notificacaoClient.enviarNotificacao();
    }
}