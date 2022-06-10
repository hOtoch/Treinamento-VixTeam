package com.example.hugo.repositories;

import com.example.hugo.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Long> {

    List<Cliente> findByNome(String nome);
    Cliente findByCpf(String cpf);
    Cliente findByEmail(String email);

    @Transactional
    @Modifying
    @Query("update Cliente cliente set cliente.email= :email where cliente.cpf = :cpf")
    int updateEmailByCPF(String email,String cpf);
}
