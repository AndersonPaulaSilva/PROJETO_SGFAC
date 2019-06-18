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

// - D

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESPECIALIDADES")
public class Especialidade extends AbstractEntity<Long> {

    @Getter
    @Setter
    private String descricaoEspecialidade;
}
