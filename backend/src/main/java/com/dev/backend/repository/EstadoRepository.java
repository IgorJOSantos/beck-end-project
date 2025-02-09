package com.dev.backend.repository;

import com.dev.backend.entity.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Regiao, Long> {
}
