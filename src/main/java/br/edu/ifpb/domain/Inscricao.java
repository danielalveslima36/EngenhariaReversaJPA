package br.edu.ifpb.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "incricoes")
@SequenceGenerator(name = "ins_seq", sequenceName = "inscricoes_id_seq")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ins_seq")
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_inscricao;
    @Column(columnDefinition = "VARCHAR(100)")
    private String status_inscricao;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_participante", columnDefinition = "bigint")
    private Participante participante;
    private String id_transacao;
    private Double preco;
    @Column(columnDefinition = "VARCHAR(50)")
    private String tipoEvento;
    @Column(columnDefinition = "VARCHAR(50)")
    private String tipoDeParticipacao;

    public Inscricao() {
    }

    public Inscricao(Date data_inscricao, String status_inscricao, Participante participante, String id_transacao, Double preco, String tipoEvento, String tipoDeParticipacao) {
        this.data_inscricao = data_inscricao;
        this.status_inscricao = status_inscricao;
        this.participante = participante;
        this.id_transacao = id_transacao;
        this.preco = preco;
        this.tipoEvento = tipoEvento;
        this.tipoDeParticipacao = tipoDeParticipacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData_inscricao() {
        return data_inscricao;
    }

    public void setData_inscricao(Date data_inscricao) {
        this.data_inscricao = data_inscricao;
    }

    public String getStatus_inscricao() {
        return status_inscricao;
    }

    public void setStatus_inscricao(String status_inscricao) {
        this.status_inscricao = status_inscricao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public String getId_transacao() {
        return id_transacao;
    }

    public void setId_transacao(String id_transacao) {
        this.id_transacao = id_transacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoDeParticipacao() {
        return tipoDeParticipacao;
    }

    public void setTipoDeParticipacao(String tipoDeParticipacao) {
        this.tipoDeParticipacao = tipoDeParticipacao;
    }
}
