package com.anderson.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Anderson on 17/06/2019.
 */

// - B

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {

    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private int rg;
    @Getter
    @Setter
    private String orgaoEmissor;
    @Getter
    @Setter
    private int cpf;
    @Getter
    @Setter
    private String endereco;
    @Getter
    @Setter
    private int numero;
    @Getter
    @Setter
    private String complemento;
    @Getter
    @Setter
    private String bairro;
    @Getter
    @Setter
    private String cidade;
    @Getter
    @Setter
    private String estado;
    @Getter
    @Setter
    private int telefone;
    @Getter
    @Setter
    private int celular;
    @Getter
    @Setter
    private int numeroCtps;
    @Getter
    @Setter
    private int numeroPis;
    @Getter
    @Setter
    private Date dataNascimento;
}
