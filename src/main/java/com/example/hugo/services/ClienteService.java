package com.example.hugo.services;

import com.example.hugo.Model.Cliente;


public interface ClienteService{
        Cliente getClienteByCpf(String cpf);
        Cliente getClienteByEmail(String email);
        void adicionaCliente(Cliente cliente);
        void removeCliente(Cliente cliente);
        int updateEmailByCPF(String cpf,String email);

}
