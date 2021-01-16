package com.fr3nzy.financial_crisis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FedFundsRepository extends JpaRepository<FedFunds, Long> {

    List<FedFunds> findAll();

}
