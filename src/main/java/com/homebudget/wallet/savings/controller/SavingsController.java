package com.homebudget.wallet.savings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homebudget.wallet.savings.entity.Savings;
import com.homebudget.wallet.savings.service.SavingsService;

@RestController("/savings")
public class SavingsController {
	
	@Autowired
	SavingsService savingsService;

	@GetMapping("/get-all-savings")
	public List<Savings> getAllSavings(Long walletID) {
		return savingsService.getAllSavingsBy(walletID);
	}

}
