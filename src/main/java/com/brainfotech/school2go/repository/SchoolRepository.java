package com.brainfotech.school2go.repository;

import com.brainfotech.school2go.entity.School;
import org.springframework.stereotype.Repository;

/**
 * Created by thameema on 5/2/14.
 */

@Repository
public interface SchoolRepository extends AbstractJpaRepository<School, Long> {

}
