package com.devsuperior.desafio1.desafio1.controller;

import com.devsuperior.desafio1.desafio1.dto.RequestDto;
import com.devsuperior.desafio1.desafio1.dto.ResponseDto;
import com.devsuperior.desafio1.desafio1.services.impl.PedidoImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/public/v1/valorPedido")
@Tag(name = "ValorPedido", description = "API para o valor do pedido")
public class Controller {

    private final PedidoImpl pedido;

    @GetMapping("/pedido")
    @Operation(summary = "Calcula Pedido", description = "Endpoint para calcular o valor do pedido.")
    @ApiResponse(responseCode = "200", description = "Retorna os dados do pedido.")
    public ResponseEntity<ResponseDto> valorPedido(RequestDto request) {
        ResponseDto response = pedido.montaPedido(request);
        return ResponseEntity.ok(response);
    }
}
