package com.javanauta.transacoes_simplificado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//(Quem tem um domínio melhor sobre outros tipos de arquitetura, não tem problema fazer uma hexagonal ou uma clean architecture, mas uma arquitetura de camadas funciona sempre).
@SpringBootApplication
@EnableFeignClients
public class TransacoesSimplificadoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransacoesSimplificadoApplication.class, args);
    }
}