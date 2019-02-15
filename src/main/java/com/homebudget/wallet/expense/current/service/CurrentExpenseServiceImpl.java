package com.homebudget.wallet.expense.current.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homebudget.wallet.expense.current.entity.Expense;

@Service
@Transactional
public class CurrentExpenseServiceImpl implements CurrentExpenseService {

	private static final Logger logger = LoggerFactory.getLogger(CurrentExpenseServiceImpl.class);

	@Autowired
	CurrentExpenseRepository currentExpenseRepository;

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Expense> getAllCurrentExpenses() {
		return currentExpenseRepository.findAll();
	}

	@Override
	public Boolean addExpense(Expense expense) {
		try {
			currentExpenseRepository.save(expense);
			return Boolean.TRUE;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return Boolean.FALSE;
		}

	}

}
