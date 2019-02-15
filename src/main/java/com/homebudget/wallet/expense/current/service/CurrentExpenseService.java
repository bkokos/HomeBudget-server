package com.homebudget.wallet.expense.current.service;

import java.util.List;

import com.homebudget.wallet.expense.current.entity.Expense;

public interface CurrentExpenseService {
	
	Boolean addExpense(Expense expense);
	List<Expense> getAllCurrentExpenses();

}
