package com.dio.ggSkateshop.DTOs;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class PedidoDTO {

    @NotNull(message = "ID do usuário é obrigatorio")
    private Long usuarioId;

    @NotEmpty(message = "Lista de produtos não pode estar vazia")
    private List<Long> produtoIds;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<Long> getProdutoIds() {
        return produtoIds;
    }

    public void setProdutoIds(List<Long> produtoIds) {
        this.produtoIds = produtoIds;
    }
}
