package com.devsuperior.desafio1.desafio1.services.impl;

import com.devsuperior.desafio1.desafio1.dto.RequestDto;
import com.devsuperior.desafio1.desafio1.dto.ResponseDto;
import com.devsuperior.desafio1.desafio1.services.Desconto;
import com.devsuperior.desafio1.desafio1.services.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoImpl implements Pedido {

    @Autowired
    private FreteImpl freteImpl;
    @Autowired
    private Desconto desconto;

    @Override
    public ResponseDto montaPedido(RequestDto request) {
        ResponseDto response = new ResponseDto();

        BigDecimal valorFinal;

        valorFinal = request.getValorBasico();
        valorFinal  = valorFinal.add(freteImpl.aplicaFrete(request.getValorBasico()));
        valorFinal  = valorFinal.subtract(desconto.aplicaDesconto(request));

        response.setCodigo(request.getCodigo());
        response.setValorTotal(String.valueOf(valorFinal));
        return response;
    }
}
