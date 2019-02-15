package com.homebudget.wallet.savings.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.homebudget.wallet.savings.entity.Savings;

@Service
public class SavingsServiceImpl implements SavingsService {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Savings> getAllSavingsBy(Long walletId) {
		List<Savings> savingsList = em
				.createQuery("select s from Savings s where s.walletId = :walletId", Savings.class)
				.setParameter("walletId", walletId)
				.getResultList();
		return savingsList;
	}

}
