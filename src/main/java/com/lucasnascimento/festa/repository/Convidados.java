package com.lucasnascimento.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasnascimento.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
