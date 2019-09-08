package com.homebudget.wallet.income.service;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homebudget.wallet.income.entity.Income;

@Service
public class IncomeServiceImpl implements IncomeService {

	private static final Logger logger = LoggerFactory.getLogger(IncomeServiceImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private IncomeRepository incomeRepository;

	@Override
	public List<Income> getIncomesBy(Long walletId) {
		List<Income> incomesList = entityManager
				.createQuery("select i from Income i where i.walletId = :walletId", Income.class)
				.setParameter("walletId", walletId).getResultList();
		return incomesList;
	}

	@Override
	public Boolean addIncome(Income income) {
		try {
			incomeRepository.save(income);
			return TRUE;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return FALSE;
		}
	}

}
