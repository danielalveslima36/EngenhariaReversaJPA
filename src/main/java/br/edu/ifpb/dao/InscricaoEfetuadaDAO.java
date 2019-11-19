package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Artigo;
import br.edu.ifpb.domain.InscricaoEfetuada;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class InscricaoEfetuadaDAO {
    @PersistenceContext(unitName = "dac")
    EntityManager entityManager;

    public void salvar(InscricaoEfetuada inscricaoEfetuada){
        entityManager.persist(inscricaoEfetuada);
    }

    public void excluir(InscricaoEfetuada inscricaoEfetuada){
        entityManager.remove(inscricaoEfetuada);
    }

    public void atualizar(InscricaoEfetuada inscricaoEfetuada){
        entityManager.merge(inscricaoEfetuada);
    }

    public InscricaoEfetuada buscar(InscricaoEfetuada inscricaoEfetuada){
        return entityManager.find(InscricaoEfetuada.class, inscricaoEfetuada);
    }

    public List<InscricaoEfetuada> buscarTodos(){
        return entityManager.createQuery("SELECT ia FROM InscricaoEfetuada ia", InscricaoEfetuada.class).getResultList();
    }
}
