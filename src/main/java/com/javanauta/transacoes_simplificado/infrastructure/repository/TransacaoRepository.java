package com.javanauta.transacoes_simplificado.infrastructure.repository;

import com.javanauta.transacoes_simplificado.infrastructure.entity.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacoes, Long> {
}