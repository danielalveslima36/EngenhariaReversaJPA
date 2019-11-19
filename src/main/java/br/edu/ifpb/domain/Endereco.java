package br.edu.ifpb.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Endereco implements Serializable {
    @Column(columnDefinition = "VARCHAR(100)")
    private String estado;
    @Column(columnDefinition = "VARCHAR(255)")
    private String cidade;
    @Column(columnDefinition = "VARCHAR(255)")
    private String bairro;
    @Column(columnDefinition = "VARCHAR(255)")
    private String logradouro;
    @Column(columnDefinition = "VARCHAR(100)")
    private String numero;
    @Column(columnDefinition = "VARCHAR(12)")
    private String cep;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String logradouro, String numero, String cep) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
