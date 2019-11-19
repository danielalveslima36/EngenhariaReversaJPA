package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Participante;
import sun.nio.ch.PollArrayWrapper;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ParticipanteDAO {
    @PersistenceContext(unitName = "dac")
    EntityManager em;

    public void salvar(Participante participante){
        em.persist(participante);
    }

    public void excluir(Participante participante){
        em.remove(participante);
    }

    public void atualizar(Participante participante){
        em.merge(participante);
    }

    public Participante buscar(Participante participante){
        return em.find(Participante.class, participante);
    }

    public List<Participante> buscarTodas() {
        return em.createQuery("SELECT p FROM Participante p", Participante.class).getResultList();
    }
}
