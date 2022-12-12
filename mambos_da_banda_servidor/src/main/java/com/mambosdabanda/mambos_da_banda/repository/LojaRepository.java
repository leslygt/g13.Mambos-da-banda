package com.mambosdabanda.mambos_da_banda.repository;

import com.mambosdabanda.mambos_da_banda.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LojaRepository extends JpaRepository<Loja, Integer> {
    @Query(
            value = "select * from loja l where l.gest_id_loja = ?1 limit 1",
            nativeQuery = true
    )
    Optional<Loja> findByIdGestLoja(int idGestLoja);
}
