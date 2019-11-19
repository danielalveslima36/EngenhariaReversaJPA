package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Artigo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ArtigoDAO {

    @PersistenceContext(unitName = "dac")
    EntityManager entityManager;

    public void salvar(Artigo artigo){
        entityManager.persist(artigo);
    }

    public void excluir(Artigo artigo){
        entityManager.remove(artigo);
    }

    public void atualizar(Artigo artigo){
        entityManager.merge(artigo);
    }

    public Artigo buscar(Artigo artigo){
        return entityManager.find(Artigo.class, artigo);
    }

    public List<Artigo> buscarTodos(){
        return entityManager.createQuery("SELECT a FROM Artigo a", Artigo.class).getResultList();
    }
}
