package com.dio.ggSkateshop.domain.repository;

import com.dio.ggSkateshop.domain.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
