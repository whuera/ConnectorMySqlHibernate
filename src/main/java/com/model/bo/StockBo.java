package com.model.bo;

import com.modelo.Stock;

// TODO: Auto-generated Javadoc
/**
 * The Interface StockBo.
 */
public interface StockBo {
	
	/**
	 * Save.
	 *
	 * @param stock the stock
	 */
	void save(Stock stock);
	
	/**
	 * Update.
	 *
	 * @param stock the stock
	 */
	void update(Stock stock);
	
	/**
	 * Delete.
	 *
	 * @param stock the stock
	 */
	void delete(Stock stock);
	
	/**
	 * Find by stock code.
	 *
	 * @param stockCode the stock code
	 * @return the stock
	 */
	Stock findByStockCode(String stockCode);

}
