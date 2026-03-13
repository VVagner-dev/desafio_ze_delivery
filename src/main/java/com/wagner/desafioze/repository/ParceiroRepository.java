package com.wagner.desafioze.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wagner.desafioze.models.Parceiro;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Long> {

}
