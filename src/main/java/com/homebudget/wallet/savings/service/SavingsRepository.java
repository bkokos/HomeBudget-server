package com.homebudget.wallet.savings.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homebudget.wallet.savings.entity.Savings;

public interface SavingsRepository extends JpaRepository<Savings, Long>{

}
