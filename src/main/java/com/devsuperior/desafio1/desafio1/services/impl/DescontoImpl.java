package com.devsuperior.desafio1.desafio1.services.impl;

import com.devsuperior.desafio1.desafio1.dto.RequestDto;
import com.devsuperior.desafio1.desafio1.services.Desconto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class DescontoImpl implements Desconto {
    @Override
    public BigDecimal aplicaDesconto(RequestDto request) {

        BigDecimal desconto = BigDecimal.ZERO;

        if(!(request.getPercentagemDesconto().compareTo(new BigDecimal(100.00))> 0)){
            desconto = request.getValorBasico()
                    .multiply(request.getPercentagemDesconto()
                            .divide(new BigDecimal(100)));
        }
        
        return desconto.setScale(2, RoundingMode.DOWN);

    }
}
