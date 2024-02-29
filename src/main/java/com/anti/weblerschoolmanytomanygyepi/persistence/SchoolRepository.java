package com.anti.weblerschoolmanytomanygyepi.persistence;

import com.anti.weblerschoolmanytomanygyepi.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends   JpaRepository<School, Long> {
    School findSchoolByNameIgnoreCase(String name);
}
