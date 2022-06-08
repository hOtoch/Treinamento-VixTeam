package com.example.hugo.services;

import com.example.hugo.Model.Cliente;

import java.util.List;

public interface ClienteService{
        List<Cliente> getAllCliente();
        List <Cliente> getClienteByNome(String nome);
}
