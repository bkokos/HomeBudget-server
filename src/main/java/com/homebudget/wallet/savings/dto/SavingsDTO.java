package com.homebudget.wallet.savings.dto;

import java.math.BigDecimal;

public class SavingsDTO {
	private BigDecimal value;
	private String userName;
	private Long walletId;
	private String description;
	
	public SavingsDTO() {
			}

	public SavingsDTO(BigDecimal value, String userName, Long walletId, String description) {
		super();
		this.value = value;
		this.userName = userName;
		this.walletId = walletId;
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getWalletId() {
		return walletId;
	}

	public void setWalletId(Long walletId) {
		this.walletId = walletId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
