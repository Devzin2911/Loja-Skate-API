package com.dio.ggSkateshop.domain.repository;

import com.dio.ggSkateshop.domain.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {



}
