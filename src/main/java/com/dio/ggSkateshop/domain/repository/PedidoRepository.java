package com.dio.ggSkateshop.domain.repository;

import com.dio.ggSkateshop.domain.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
