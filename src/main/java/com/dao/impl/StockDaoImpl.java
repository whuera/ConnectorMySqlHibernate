package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.StockDao;
import com.modelo.Stock;

// TODO: Auto-generated Javadoc
/**
 * The Class StockDaoImpl.
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao{
	
	/* (non-Javadoc)
	 * @see com.dao.StockDao#save(com.modelo.Stock)
	 */
	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}
	
	/* (non-Javadoc)
	 * @see com.dao.StockDao#update(com.modelo.Stock)
	 */
	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}
	
	/* (non-Javadoc)
	 * @see com.dao.StockDao#delete(com.modelo.Stock)
	 */
	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}
	
	/* (non-Javadoc)
	 * @see com.dao.StockDao#findByStockCode(java.lang.String)
	 */
	public Stock findByStockCode(String stockCode){
		List list = getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		return (Stock)list.get(0);
	}

}
