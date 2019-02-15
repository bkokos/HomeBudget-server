package com.homebudget.wallet.income.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.homebudget.wallet.income.entity.Income;

@Service
public class IncomeServiceImpl implements IncomeService {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Income> getIncomesBy(Long walletId) {
		List<Income> incomesList = entityManager
				.createQuery("select i from Income i where i.walletId = :walletId", Income.class)
				.setParameter("walletId", walletId)
				.getResultList();
		return incomesList;
	}

}
