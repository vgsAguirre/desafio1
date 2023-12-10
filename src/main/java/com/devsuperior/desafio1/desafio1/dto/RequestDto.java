package com.devsuperior.desafio1.desafio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private Integer codigo;
    private BigDecimal valorBasico;
    private BigDecimal percentagemDesconto;

}
