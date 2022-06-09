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

    @Column(name="CLIENTE_SOBRENOME",nullable = false)
    private String sobrenome;

    @Column(name="CLIENTE_EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name="CLIENTE_CPF",nullable = false,unique = true)
    private String cpf;

    @Column(name="CLIENTE_DATAN",nullable = false)
    private String dataN;

    @Column(name="CLIENTE_SEXO",nullable = false)
    private String sexo;

    @Column(name="CLIENTE_ESTADO",nullable = false)
    private String estado;

    public Cliente(){}

    public Cliente(String nome,String sobrenome,String email,String cpf,String dataN,String estado,String sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
        this.dataN = dataN;
        this.sexo = sexo;
        this.estado = estado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataN() {
        return dataN;
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

    public String getSexo() {
        return sexo;
    }

    public String getSobrenome() {
        return sobrenome;
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
