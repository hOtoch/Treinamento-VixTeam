package com.example.hugo.repositories;

import com.example.hugo.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Long> {

    List<Cliente> findByNome(String nome);
    Cliente findByCpf(String cpf);
    Cliente findByEmail(String email);
}
