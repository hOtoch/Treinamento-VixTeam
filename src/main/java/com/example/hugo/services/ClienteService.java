package com.example.hugo.services;

import com.example.hugo.Model.Cliente;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ClienteService{
        List<Cliente> getAllCliente();
        List<Cliente> getClienteByNome(String nome);
        Cliente getClienteByCpf(String cpf);
        Cliente getClienteByEmail(String email);
        void adicionaCliente(Cliente cliente);
        void removeCliente(Cliente cliente);
        int updateEmailByCPF(String cpf,String email);

}
