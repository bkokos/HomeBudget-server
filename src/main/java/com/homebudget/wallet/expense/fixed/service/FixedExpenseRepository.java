package com.homebudget.wallet.expense.fixed.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homebudget.wallet.expense.fixed.entity.FixedExpense;

public interface FixedExpenseRepository extends JpaRepository<FixedExpense, Long> {}
