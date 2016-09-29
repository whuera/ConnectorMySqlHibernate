package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.SaapentidadDao;
import com.modelo.Sappentidad;

public class SappentidadDaoImpl extends HibernateDaoSupport implements SaapentidadDao {

	public void save(Sappentidad sappentidad) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(sappentidad);

	}

	public void update(Sappentidad sappentidad) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(sappentidad);

	}

	public void delete(Sappentidad sappentidad) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(sappentidad);

	}

	public Sappentidad findByEntidadCode(int id) {
		List list = getHibernateTemplate().find("from sappentidad where idsaapentidad=?",id);
		return (Sappentidad) list.get(0);
	}

}
