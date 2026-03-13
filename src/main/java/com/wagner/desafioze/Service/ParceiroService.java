package com.wagner.desafioze.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagner.desafioze.models.Parceiro;
import com.wagner.desafioze.repository.ParceiroRepository;

@Service
public class ParceiroService {

    @Autowired
    ParceiroRepository repository;

    public Parceiro criar(Parceiro parceiro) {
        return repository.save(parceiro);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Parceiro> findById(Long id) {
        return repository.findById(id);
    }

    public List<Parceiro> findAll() {
        return repository.findAll();
    }

}
