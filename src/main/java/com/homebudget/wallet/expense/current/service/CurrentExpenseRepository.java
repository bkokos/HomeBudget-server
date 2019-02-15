package com.homebudget.wallet.expense.current.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homebudget.wallet.expense.current.entity.Expense;

public interface CurrentExpenseRepository extends JpaRepository<Expense, Long> {}