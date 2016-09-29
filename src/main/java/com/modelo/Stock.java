package com.modelo;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Stock.
 */
public class Stock implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The stock id. */
	private Long stockId;
	
	/** The stock code. */
	private String stockCode;
	
	/** The stock name. */
	private String stockName;

	/**
	 * Instantiates a new stock.
	 */
	public Stock() {
	}

	/**
	 * Instantiates a new stock.
	 *
	 * @param stockCode the stock code
	 * @param stockName the stock name
	 */
	public Stock(String stockCode, String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	/**
	 * Gets the stock id.
	 *
	 * @return the stock id
	 */
	public Long getStockId() {
		return this.stockId;
	}

	/**
	 * Sets the stock id.
	 *
	 * @param stockId the new stock id
	 */
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	/**
	 * Gets the stock code.
	 *
	 * @return the stock code
	 */
	public String getStockCode() {
		return this.stockCode;
	}

	/**
	 * Sets the stock code.
	 *
	 * @param stockCode the new stock code
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	/**
	 * Gets the stock name.
	 *
	 * @return the stock name
	 */
	public String getStockName() {
		return this.stockName;
	}

	/**
	 * Sets the stock name.
	 *
	 * @param stockName the new stock name
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stock [stockCode=" + stockCode + ", stockId=" + stockId
				+ ", stockName=" + stockName + "]";
	}

	
}
