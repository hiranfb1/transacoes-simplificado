package com.javanauta.transacoes_simplificado.infrastructure.repository;

import com.javanauta.transacoes_simplificado.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}