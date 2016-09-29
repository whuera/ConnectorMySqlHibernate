package com.model.bo.impl;

import com.dao.SaapentidadDao;
import com.model.bo.ISappentidadBo;
import com.modelo.Sappentidad;

public class SappentidadBoImpl implements ISappentidadBo{
	SaapentidadDao sappentidadDao;

	public void setSappentidadDao(SaapentidadDao sappentidadDao) {
		this.sappentidadDao = sappentidadDao;
	}

	public void save(Sappentidad sappentidad) {
		// TODO Auto-generated method stub
		sappentidadDao.save(sappentidad);
		
	}

	public void update(Sappentidad sappentidad) {
		// TODO Auto-generated method stub
		sappentidadDao.update(sappentidad);
	}

	public void delete(Sappentidad sappentidad) {
		// TODO Auto-generated method stub
		sappentidadDao.delete(sappentidad);
	}

	public Sappentidad findByEntidadCode(int id) {
		// TODO Auto-generated method stub		
		return sappentidadDao.findByEntidadCode(id);
	}

}
