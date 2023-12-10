package com.devsuperior.desafio1.desafio1.services;

import com.devsuperior.desafio1.desafio1.dto.RequestDto;
import com.devsuperior.desafio1.desafio1.dto.ResponseDto;

public interface Pedido {

    ResponseDto montaPedido(RequestDto request);

}
