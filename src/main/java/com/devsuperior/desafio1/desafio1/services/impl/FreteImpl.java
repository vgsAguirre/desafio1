package com.devsuperior.desafio1.desafio1.services.impl;

import com.devsuperior.desafio1.desafio1.services.Frete;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FreteImpl implements Frete {
    @Override
    public BigDecimal aplicaFrete(BigDecimal valor) {

        BigDecimal valorFrete = new BigDecimal(20.00);

        if (valor.compareTo(new BigDecimal(200.00)) > 0) {
            valorFrete = BigDecimal.ZERO;
        } else if (valor.compareTo(new BigDecimal(100.00)) > 0) {
            valorFrete = new BigDecimal(12.00);
        }
        return valorFrete;
    }
}
