package com.example.exercise.repository;

import com.example.exercise.model.Product;
import com.mysql.cj.Session;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.security.auth.login.Configuration;
import java.util.List;
@Repository
public class ProductRepository implements IProductRepository{
    @PersistenceContext
    private  static EntityManager entityManager;
    private static SessionFactory sessionFactory;

    @Override
    public List<Product> showList() {
        String query= "select s from Product s";
        TypedQuery<Product> productTypedQuery=entityManager.createQuery(query,Product.class);
        return productTypedQuery.getResultList();
    }

    @Override
    public void create(Product product) {
        if (product.getId() != 0) {
            entityManager.merge(product);
        } else {
            entityManager.persist(product);
        }
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        Product product= findById(id);
        if (product!=null){
            entityManager.remove(product);
        }
    }

    @Override
    public Product findById(int id) {
        String query= "select s from Product s where s.id=:id";
        TypedQuery<Product> productTypedQuery= entityManager.createQuery(query,Product.class);
        productTypedQuery.setParameter("id",id);
        return productTypedQuery.getSingleResult();
    }

    @Override
    public List<Product> searchByName(String nameProduct) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product as p where p.name like :name", Product.class);
        query.setParameter("name", "%" + nameProduct + "%");
        return query.getResultList();
    }
}
