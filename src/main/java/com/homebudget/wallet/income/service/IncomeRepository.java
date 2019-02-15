package com.homebudget.wallet.income.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homebudget.wallet.income.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Long>{
	
}