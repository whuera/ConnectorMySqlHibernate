package com.model.bo;

import com.modelo.Sappentidad;

// TODO: Auto-generated Javadoc
/**
 * The Interface ISappentidadBo.
 */
public interface ISappentidadBo {
	
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
