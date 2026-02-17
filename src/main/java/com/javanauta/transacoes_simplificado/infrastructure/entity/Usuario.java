package com.javanauta.transacoes_simplificado.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "usuario")
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String cpfCnpj;
    private String senha;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Carteira carteira;

    private TipoUsuario tipoUsuario;
}