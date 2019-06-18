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

// - H

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AGENDA")
public class Agenda extends AbstractEntity<Long> {

    @Getter
    @Setter
    private Date data;
    @Getter
    @Setter
    private String hora;
    @Getter
    @Setter
    private String retorno;
    @Getter
    @Setter
    private String encerrado;
    @Getter
    @Setter
    private String motivoEncerramento;
}
