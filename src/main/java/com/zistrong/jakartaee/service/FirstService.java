package com.zistrong.jakartaee.service;


import com.zistrong.jakartaee.entitiy.Production;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.io.Serializable;
import java.util.List;

@Stateless
public class FirstService implements Serializable {


    @PersistenceContext(unitName = "jee")
    EntityManager entityManager;

    public String now() {

        Object date =  entityManager.createNativeQuery("select now()").getSingleResult();

        return String.valueOf(date);
    }

    public void save(Production production) {
        entityManager.persist(production);
    }

    public List<Production> getProductions() {
        List<Production> productions =  entityManager.createQuery("select a from Production a", Production.class).getResultList();
        return productions;
    }

}
