package com.modelo;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Sappentidad.
 */
public class Sappentidad {
	
	
	private Long idsaapentidad;
	
	private String sappciudadania;
	
	private Date sappfechanacimiento;
	
	private String sappentidadestatus;
	
	public String getSappentidadestatus() {
		return sappentidadestatus;
	}

	public void setSappentidadestatus(String sappentidadestatus) {
		this.sappentidadestatus = sappentidadestatus;
	}

	public Date getSappfechanacimiento() {
		return sappfechanacimiento;
	}

	public void setSappfechanacimiento(Date sappfechanacimiento) {
		this.sappfechanacimiento = sappfechanacimiento;
	}

	public String getSappciudadania() {
		return sappciudadania;
	}

	public void setSappciudadania(String sappciudadania) {
		this.sappciudadania = sappciudadania;
	}

	/** The sappnombres. */
	private String sappnombres;
	
	public Long getIdsaapentidad() {
		return idsaapentidad;
	}

	public void setIdsaapentidad(Long idsaapentidad) {
		this.idsaapentidad = idsaapentidad;
	}

	/** The saapapellidos. */
	private String saapapellidos;
	
	/** The sapptipodocumento. */
	private String sapptipodocumento;
	
	/** The sappnumerodocumento. */
	private String sappnumerodocumento;
	
	/**
	 * Gets the sappnombres.
	 *
	 * @return the sappnombres
	 */
	public String getSappnombres() {
		return sappnombres;
	}
	
	/**
	 * Sets the sappnombres.
	 *
	 * @param sappnombres the new sappnombres
	 */
	public void setSappnombres(String sappnombres) {
		this.sappnombres = sappnombres;
	}
	
	/**
	 * Gets the saapapellidos.
	 *
	 * @return the saapapellidos
	 */
	public String getSaapapellidos() {
		return saapapellidos;
	}
	
	/**
	 * Sets the saapapellidos.
	 *
	 * @param saapapellidos the new saapapellidos
	 */
	public void setSaapapellidos(String saapapellidos) {
		this.saapapellidos = saapapellidos;
	}
	
	/**
	 * Gets the sapptipodocumento.
	 *
	 * @return the sapptipodocumento
	 */
	public String getSapptipodocumento() {
		return sapptipodocumento;
	}
	
	/**
	 * Sets the sapptipodocumento.
	 *
	 * @param sapptipodocumento the new sapptipodocumento
	 */
	public void setSapptipodocumento(String sapptipodocumento) {
		this.sapptipodocumento = sapptipodocumento;
	}
	
	/**
	 * Gets the sappnumerodocumento.
	 *
	 * @return the sappnumerodocumento
	 */
	public String getSappnumerodocumento() {
		return sappnumerodocumento;
	}
	
	/**
	 * Sets the sappnumerodocumento.
	 *
	 * @param sappnumerodocumento the new sappnumerodocumento
	 */
	public void setSappnumerodocumento(String sappnumerodocumento) {
		this.sappnumerodocumento = sappnumerodocumento;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sappentidad [sappnombres=" + sappnombres + ", saapapellidos=" + saapapellidos + ", sapptipodocumento="
				+ sapptipodocumento + ", sappnumerodocumento=" + sappnumerodocumento + "]";
	}

	
}
