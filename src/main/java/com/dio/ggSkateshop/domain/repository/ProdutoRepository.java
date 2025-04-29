package com.dio.ggSkateshop.domain.repository;

import com.dio.ggSkateshop.domain.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNameContainingIgnoreCase(String nome);
    List<Produto> findByCategoriaId(Long categoriaId);

}
