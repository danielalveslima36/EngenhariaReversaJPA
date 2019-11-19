package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "artigos")
@SequenceGenerator(name = "art_seq", sequenceName = "artigos_id_seq")
public class Artigo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "art_seq")
    private Integer id;
    private String titulo;
    private String orientador;
    private String coautores;
    private String modalidades;
    @Column(columnDefinition = "VARCHAR(20)")
    private String data_submisso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_participante", columnDefinition = "bigint")
    private Participante participante;
    @Column(columnDefinition = "VARCHAR(150)")
    private String url_download;

    public Artigo() {
    }

    public Artigo(String titulo, String orientador, String coautores, String modalidades, String data_submisso, Participante participante, String url_download) {
        this.titulo = titulo;
        this.orientador = orientador;
        this.coautores = coautores;
        this.modalidades = modalidades;
        this.data_submisso = data_submisso;
        this.participante = participante;
        this.url_download = url_download;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCoautores() {
        return coautores;
    }

    public void setCoautores(String coautores) {
        this.coautores = coautores;
    }

    public String getModalidades() {
        return modalidades;
    }

    public void setModalidades(String modalidades) {
        this.modalidades = modalidades;
    }

    public String getData_submisso() {
        return data_submisso;
    }

    public void setData_submisso(String data_submisso) {
        this.data_submisso = data_submisso;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public String getUrl_download() {
        return url_download;
    }

    public void setUrl_download(String url_download) {
        this.url_download = url_download;
    }
}

