package com.dao;

import com.modelo.Sappentidad;

public interface SaapentidadDao {
	/**
	 * Save.
	 *
	 * @param sappentidad the sappentidad
	 */
	void save (Sappentidad sappentidad);
	
	/**
	 * Update.
	 *
	 * @param sappentidad the sappentidad
	 */
	void update (Sappentidad sappentidad);
	
	/**
	 * Delete.
	 *
	 * @param sappentidad the sappentidad
	 */
	void delete  (Sappentidad sappentidad);
	
	/**
	 * Find by entidad code.
	 *
	 * @param id the id
	 * @return the sappentidad
	 */
	Sappentidad findByEntidadCode (int id);
	


}
