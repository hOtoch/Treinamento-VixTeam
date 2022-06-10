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
    public void adicionaCliente(Cliente cliente){
        clienteRepositorio.save(cliente);
    }
    @Override
    public void removeCliente(Cliente cliente){
        clienteRepositorio.delete(cliente);
    }

    @Override
    public Cliente getClienteByCpf(String cpf){
      return clienteRepositorio.findByCpf(cpf);
    }

    @Override
    public Cliente getClienteByEmail(String email){
        return clienteRepositorio.findByEmail(email);
    }

    @Override
    public int updateEmailByCPF(String cpf,String email){
        return (clienteRepositorio.updateEmailByCPF(email,cpf));
    }

}
