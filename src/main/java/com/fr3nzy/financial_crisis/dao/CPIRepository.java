package com.fr3nzy.financial_crisis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CPIRepository extends JpaRepository<CPI, Long> {

    List<CPI> findAll();

}
