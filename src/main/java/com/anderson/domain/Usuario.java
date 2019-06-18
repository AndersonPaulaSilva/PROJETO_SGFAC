package com.anderson.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Anderson on 17/06/2019.
 */

// - C

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USUARIOS")
public class Usuario extends AbstractEntity<Long> {

    @Getter
    @Setter
    private String identificacaoUsuario;
    @Getter
    @Setter
    private String senha;
    @Getter
    @Setter
    private String cadastroFuncionario;
    @Getter
    @Setter
    private String cadastroUsuario;
    @Getter
    @Setter
    private String cadastroPaciente;
    @Getter
    @Setter
    private String cadastroMedico;
    @Getter
    @Setter
    private String convenio;
    @Getter
    @Setter
    private String agendamentoConsulta;
    @Getter
    @Setter
    private String cancelamentoConsulta;
    @Getter
    @Setter
    private String moduloAdminstrativo;
    @Getter
    @Setter
    private String moduloAgendamento;
    @Getter
    @Setter
    private String moduloAtendimento;
}
