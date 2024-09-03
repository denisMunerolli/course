package com.aplicacao_curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacao_curso.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
