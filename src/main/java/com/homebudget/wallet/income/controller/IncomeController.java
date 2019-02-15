package com.homebudget.wallet.income.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homebudget.wallet.income.entity.Income;
import com.homebudget.wallet.income.service.IncomeService;

@RestController("/income")
public class IncomeController {

	@Autowired
	IncomeService incomeService;

	@GetMapping("/get-all")
	public List<Income> getAllIncomes(Long walletId) {
		return incomeService.getIncomesBy(walletId);
	}
}
