package com.homebudget.wallet.income.service;

import java.util.List;

import com.homebudget.wallet.income.entity.Income;

public interface IncomeService {

	List<Income> getIncomesBy(Long walletId);

	Boolean addIncome(Income income);

}
