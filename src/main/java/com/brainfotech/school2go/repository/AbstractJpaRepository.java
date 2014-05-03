package com.brainfotech.school2go.repository;

import com.brainfotech.school2go.entity.AbstractIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by thameema on 5/2/14.
 */
@Repository
public interface AbstractJpaRepository<T extends AbstractIdEntity, ID extends Serializable> extends JpaRepository<T,ID> {

}
