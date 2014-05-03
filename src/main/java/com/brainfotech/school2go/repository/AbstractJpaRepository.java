package com.brainfotech.school2go.repository;

import com.brainfotech.school2go.entity.AbstractIdEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by thameema on 5/2/14.
 */
@Repository
public  class AbstractJpaRepository<T extends AbstractIdEntity, ID extends Serializable> implements PagingAndSortingRepository<T, ID> {

    protected static final Logger logger = LoggerFactory.getLogger(AbstractJpaRepository.class);


    private Class<T> entityClass;
    @PersistenceContext EntityManager em;

    private final Class<T> getEntityClass() {
        if (this.entityClass == null) {
            ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
            this.entityClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];

        }
        return this.entityClass;
    }


    @Override
    public Iterable<T> findAll(Sort orders) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends T> S save(S s) {
        return null;
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> ses) {
        return null;
    }

    @Override
    public T findOne(ID id) {
        return null;
    }

    @Override
    public boolean exists(ID id) {
        return false;
    }

    @Override
    public Iterable<T> findAll() {
        return null;
    }

    @Override
    public Iterable<T> findAll(Iterable<ID> ids) {
        return null;
    }

    @Override
    public long count() {

        final CriteriaBuilder builder=em.getCriteriaBuilder();
        final CriteriaQuery<Long> countCriteria=builder.createQuery(Long.class);
        Root<T> root = countCriteria.from(getEntityClass());
        countCriteria.select(builder.count(root));
        return em.createQuery(countCriteria).getSingleResult();

    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void delete(Iterable<? extends T> ts) {

    }

    @Override
    public void deleteAll() {

    }
}
