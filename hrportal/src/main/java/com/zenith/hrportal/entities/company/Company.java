package com.zenith.hrportal.entities.company;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


/**
 * The type Company.
 */
@Entity
@Table(name = "GL_COMPANIES")
public class Company implements Serializable {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "CODE")
	private String code;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "SYSTEM_BEGIN_DT")
	private Date systemBeginDT;

	@Column(name = "NO_PERIOD")
	private Long noPeriod;

	@Column(name = "ADDRESS1")
	private String address1;

	@Column(name = "ADDRESS2")
	private String address2;

	@Column(name = "ADDRESS3")
	private String address3;

	@Column(name = "FIN_YEAR_DT")
	private Date finYearDT;


    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return code;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets system begin dt.
     *
     * @return the system begin dt
     */
    public Date getSystemBeginDT() {
		return systemBeginDT;
	}

    /**
     * Sets system begin dt.
     *
     * @param systemBeginDT the system begin dt
     */
    public void setSystemBeginDT(Date systemBeginDT) {
		this.systemBeginDT = systemBeginDT;
	}

    /**
     * Gets no period.
     *
     * @return the no period
     */
    public Long getNoPeriod() {
		return noPeriod;
	}

    /**
     * Sets no period.
     *
     * @param noPeriod the no period
     */
    public void setNoPeriod(Long noPeriod) {
		this.noPeriod = noPeriod;
	}

    /**
     * Gets address 1.
     *
     * @return the address 1
     */
    public String getAddress1() {
		return address1;
	}

    /**
     * Sets address 1.
     *
     * @param address1 the address 1
     */
    public void setAddress1(String address1) {
		this.address1 = address1;
	}

    /**
     * Gets address 2.
     *
     * @return the address 2
     */
    public String getAddress2() {
		return address2;
	}

    /**
     * Sets address 2.
     *
     * @param address2 the address 2
     */
    public void setAddress2(String address2) {
		this.address2 = address2;
	}

    /**
     * Gets address 3.
     *
     * @return the address 3
     */
    public String getAddress3() {
		return address3;
	}

    /**
     * Sets address 3.
     *
     * @param address3 the address 3
     */
    public void setAddress3(String address3) {
		this.address3 = address3;
	}

    /**
     * Gets fin year dt.
     *
     * @return the fin year dt
     */
    public Date getFinYearDT() {
		return finYearDT;
	}

    /**
     * Sets fin year dt.
     *
     * @param finYearDT the fin year dt
     */
    public void setFinYearDT(Date finYearDT) {
		this.finYearDT = finYearDT;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
}
