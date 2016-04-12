package com.javacodegeeks.mockitotutorial2.custormer.dao;

import com.javacodegeeks.mockitotutorial2.custormer.entity.Customer;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomerDAO {

    @PersistenceContext
    EntityManager em;

    public CustomerDAO(EntityManager em) {
        this.em = em;
    }

    public Optional<Customer> findById(long id) throws Exception {
        return Optional.ofNullable(em.find(Customer.class, id));
    }

}
