package com.homebudget.wallet.expense.fixed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homebudget.wallet.expense.current.dto.ExpenseDTO;
import com.homebudget.wallet.expense.fixed.entity.FixedExpense;
import com.homebudget.wallet.expense.fixed.service.FixedExpenseRepository;

@RestController
@RequestMapping("/fixed-expense")
public class FixedExpenseController {

	@Autowired
	private FixedExpenseRepository fixedExpenseRepository;

	@GetMapping("/get-all")
	public List<FixedExpense> getAllExpenses() {
		return fixedExpenseRepository.findAll();
	}

	@PostMapping("/add")
	public Boolean addExpense(@RequestBody ExpenseDTO expenseDTO) {
		FixedExpense expense = new FixedExpense();
		expense.setValue(expenseDTO.getValue());
		expense.setDesc(expenseDTO.getDesc());
		expense.setWalletId(expenseDTO.getWalletId());
		expense.setUserName(expenseDTO.getUserName());

		try {
			fixedExpenseRepository.save(expense);
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}

	}
}
