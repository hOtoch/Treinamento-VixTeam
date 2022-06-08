package com.example.hugo.services;

import com.example.hugo.Model.Cliente;
import com.example.hugo.repositories.ClienteRepositorio;
import com.example.hugo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> getAllCliente(){
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getClienteByNome(String nome){
        return clienteRepositorio.findByNome(nome);
    }
}
