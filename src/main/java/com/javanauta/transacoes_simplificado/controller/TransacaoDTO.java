package com.javanauta.transacoes_simplificado.controller;

import java.math.BigDecimal;

public record TransacaoDTO(BigDecimal value, Long payer, Long payee) {
}