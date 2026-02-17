package com.javanauta.transacoes_simplificado.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "carteira")
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal saldo;

    @JoinColumn(name = "usuario_id")
    @OneToOne
    private Usuario usuario;
}