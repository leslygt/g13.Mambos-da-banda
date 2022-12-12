package com.mambosdabanda.mambos_da_banda.repository;

import com.mambosdabanda.mambos_da_banda.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produto, Integer> {}
