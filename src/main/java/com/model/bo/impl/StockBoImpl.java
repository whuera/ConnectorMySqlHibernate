package com.model.bo.impl;

import com.model.bo.StockBo;
import com.dao.StockDao;
import com.modelo.Stock;

// TODO: Auto-generated Javadoc
/**
 * The Class StockBoImpl.
 */
public class StockBoImpl implements StockBo{
	
	/** The stock dao. */
	StockDao stockDao;
	
	/**
	 * Sets the stock dao.
	 *
	 * @param stockDao the new stock dao
	 */
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	/* (non-Javadoc)
	 * @see com.model.bo.StockBo#save(com.modelo.Stock)
	 */
	public void save(Stock stock){
		stockDao.save(stock);
	}
	
	/* (non-Javadoc)
	 * @see com.model.bo.StockBo#update(com.modelo.Stock)
	 */
	public void update(Stock stock){
		stockDao.update(stock);
	}
	
	/* (non-Javadoc)
	 * @see com.model.bo.StockBo#delete(com.modelo.Stock)
	 */
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
	
	/* (non-Javadoc)
	 * @see com.model.bo.StockBo#findByStockCode(java.lang.String)
	 */
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}
