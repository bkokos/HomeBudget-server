package com.homebudget.wallet.income.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homebudget.wallet.income.dto.IncomeDTO;
import com.homebudget.wallet.income.entity.Income;
import com.homebudget.wallet.income.service.IncomeRepository;
import com.homebudget.wallet.income.service.IncomeService;

@RestController
@RequestMapping("/income")
public class IncomeController {
	
	Logger log = LoggerFactory.getLogger(IncomeController.class);
	
	@Autowired
	IncomeRepository incomeRepository;

	@Autowired
	IncomeService incomeService;

	@GetMapping("/get-all")
	public List<Income> getAllIncomes() {
		return incomeRepository.findAll();
	}

	@PostMapping("/add")
	public Boolean addIncome(@RequestBody IncomeDTO incomeDTO) {
		Income income = new Income();
		income.setValue(incomeDTO.getValue());
		income.setDesc(incomeDTO.getDesc());
		income.setUserName(incomeDTO.getUserName());
		income.setWalletId(incomeDTO.getWalletId());
		
		log.info(incomeDTO.getDesc());

		return incomeService.addIncome(income);
	}
}
