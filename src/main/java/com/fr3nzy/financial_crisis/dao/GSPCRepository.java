package com.fr3nzy.financial_crisis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GSPCRepository extends JpaRepository<GSPC, Long> {
    @Query(value = "SELECT * FROM GSPC e ORDER BY e.date LIMIT :limit", nativeQuery=true)
    List<GSPC> getEntitiesByLimit(@Param("limit") int limit);

    List<GSPC> findAll();

}
