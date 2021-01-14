package com.zenith.hrportal.entities.trade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Trade.
 */
@Entity
@Table(name = "PP_TRADES")
public class Trade implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TradeIdentity traddeIdentity;
	
	@Column(name = "DESCRIPTION")
	private String description;

    /**
     * Gets tradde identity.
     *
     * @return the tradde identity
     */
    public TradeIdentity getTraddeIdentity() {
		return traddeIdentity;
	}

    /**
     * Sets tradde identity.
     *
     * @param traddeIdentity the tradde identity
     */
    public void setTraddeIdentity(TradeIdentity traddeIdentity) {
		this.traddeIdentity = traddeIdentity;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

	
}
