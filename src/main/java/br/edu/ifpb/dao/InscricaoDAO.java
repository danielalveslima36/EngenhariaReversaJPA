package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Inscricao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class InscricaoDAO {
    @PersistenceContext(unitName = "dac")
    EntityManager entityManager;

    public void salvar(Inscricao inscricao){
        entityManager.persist(inscricao);
    }

    public void excluir(Inscricao inscricao){
        entityManager.remove(inscricao);
    }

    public void atualizar(Inscricao inscricao){
        entityManager.merge(inscricao);
    }

    public Inscricao buscar(Inscricao inscricao){
        return entityManager.find(Inscricao.class, inscricao);
    }

    public List<Inscricao> buscarTodos(){
        return entityManager.createQuery("SELECT i FROM Inscricao i", Inscricao.class).getResultList();
    }
}
