package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "participantes")
@SequenceGenerator(name = "part_id", sequenceName = "participantes_id_seq")
public class Participante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "part_id")
    private Integer id;
    private String nome;
    @Column(columnDefinition = "VARCHAR(100)")
    private String email;
    @Column(columnDefinition = "VARCHAR(100)")
    private String nome_cracha;
    private String instituicao;
    @Column(columnDefinition = "VARCHAR(100)")
    private String cpf;
    @Embedded
    private Contato contato;
    @Embedded
    private Endereco endereco;
    @Column(columnDefinition = "VARCHAR(100)")
    private String tipo_usuario;
    @Column(columnDefinition = "VARCHAR(150)")
    private String profissao;

    public Participante() {
    }

    public Participante(String nome, String email, String nome_cracha, String instituicao, String cpf, Contato contato, Endereco endereco, String tipo_usuario, String profissao) {
        this.nome = nome;
        this.email = email;
        this.nome_cracha = nome_cracha;
        this.instituicao = instituicao;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
        this.tipo_usuario = tipo_usuario;
        this.profissao = profissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_cracha() {
        return nome_cracha;
    }

    public void setNome_cracha(String nome_cracha) {
        this.nome_cracha = nome_cracha;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
