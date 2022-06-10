package com.example.hugo.Model;
import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="CLIENTE_ID",nullable = false,unique = true)
    private long id;

    @Column(name="CLIENTE_NOME",nullable = false)
    private String nome;

    @Column(name="CLIENTE_EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name="CLIENTE_CPF",nullable = false,unique = true)
    private String cpf;

    @Column(name="CLIENTE_ESTADO",nullable = false)
    private String estado;

    public Cliente(){}

    public Cliente(String nome,String email,String cpf,String estado){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.estado = estado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +"\nEmail: " + this.email + "\nCPF: " + this.cpf + "\nEstado: " + this.estado ;
    }

}
