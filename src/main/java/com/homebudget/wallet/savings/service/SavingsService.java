package com.homebudget.wallet.savings.service;

import java.util.List;

import com.homebudget.wallet.savings.entity.Savings;

public interface SavingsService {

	List<Savings> getAllSavingsBy(Long walletID);

}
