package com.devsuperior.desafio1.desafio1.services;

import com.devsuperior.desafio1.desafio1.dto.RequestDto;

import java.math.BigDecimal;

public interface Desconto {

    BigDecimal aplicaDesconto(RequestDto request);

}
