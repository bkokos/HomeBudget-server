package com.homebudget.wallet.expense.current.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homebudget.wallet.expense.current.dto.ExpenseDTO;
import com.homebudget.wallet.expense.current.entity.Expense;
import com.homebudget.wallet.expense.current.service.CurrentExpenseService;

@RestController
@RequestMapping("/current-expense")
public class CurrentExpenseController {

	@Autowired
	private CurrentExpenseService currentExpenseService;

	@PostMapping("/add")
	public Boolean addExpense(@RequestBody ExpenseDTO expenseDTO) {
		Expense expense = new Expense();
		expense.setValue(expenseDTO.getValue());
		expense.setDesc(expenseDTO.getDesc());
		expense.setWalletId(expenseDTO.getWalletId());
		expense.setUserName(expenseDTO.getUserName());

		return currentExpenseService.addExpense(expense);
	}

	@GetMapping("/get-all")
	public List<Expense> getAllExpenses() {
		return currentExpenseService.getAllCurrentExpenses();
	}
}
