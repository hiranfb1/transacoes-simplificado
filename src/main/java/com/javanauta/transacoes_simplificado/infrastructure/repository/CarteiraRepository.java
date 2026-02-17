package com.javanauta.transacoes_simplificado.infrastructure.repository;

import com.javanauta.transacoes_simplificado.infrastructure.entity.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}