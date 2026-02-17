package com.javanauta.transacoes_simplificado.controller;

import com.javanauta.transacoes_simplificado.services.TransacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
@RequiredArgsConstructor
public class TransacaoController {
    private final TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<Void> realizarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
        transacaoService.transferirValores(transacaoDTO);
        return ResponseEntity.accepted().build();
    }
}