package com.exercicio.departamentos.repository;

import com.exercicio.departamentos.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}