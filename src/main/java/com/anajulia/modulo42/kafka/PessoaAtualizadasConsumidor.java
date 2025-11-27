package com.anajulia.modulo42.kafka;

import com.anajulia.modulo42.entidades.Pessoa;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PessoaAtualizadasConsumidor {
    @Bean
    public Consumer<Pessoa> pessoaConsumidor() {
        return pessoa -> {
            System.out.println("Pessoa: " + pessoa.toString());
        };
    }
}
