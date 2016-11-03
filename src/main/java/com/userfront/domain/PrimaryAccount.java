package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {
	private Long id;
	private int accountNumber;
	private BigDecimal accountBalance;
	
	private List<PrimaryTransaction> primaryTransactionList;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the accountBalance
	 */
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @return the primaryTransactionList
	 */
	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @param primaryTransactionList the primaryTransactionList to set
	 */
	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}
	
	

}
