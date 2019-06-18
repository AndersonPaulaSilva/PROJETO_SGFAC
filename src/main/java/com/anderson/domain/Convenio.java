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

// - F

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CONVENIOS")
public class Convenio extends AbstractEntity<Long> {

    @Getter
    @Setter
    private String empresaConvenio;
    @Getter
    @Setter
    private String cnpj;
    @Getter
    @Setter
    private int telefone;
}
