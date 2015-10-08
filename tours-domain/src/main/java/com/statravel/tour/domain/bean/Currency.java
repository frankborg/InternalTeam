package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * City bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Currency implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -3280040403888358619L;
    private static final int HASH_PRIME_NUMBER = 31;

    private String code;
    private String symbol;
    private String name;

    /**
     * 
     */
    public Currency() {
        super();
    }
    
   
    /**
     * @param code
     *           currency code
     */
    public Currency(final String code) {
        this.code = code;
    }
    
    
    /**
     * @param code
     *            currency code
     * @param symbol
     *            currency symbol
     */
    public Currency(final String code, final String symbol) {
        this.code = code;
        this.symbol = symbol;
    }


    /**
     * @param code
     *            currency code
     * @param symbol
     *            currency symbol
     * @param name
     *            currency name
     */
    public Currency(final String code, final String symbol, final String name) {
        this.code = code;
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * @return the currency code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the currency code to set
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    /**
     * @return the currency symbol
     */
    public final String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol
     *            the currency symbol to set
     */
    public final void setSymbol(final String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the currency name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name
     *            the currency name to set
     */
    public final void setName(final String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public final int hashCode() {

        final int prime = HASH_PRIME_NUMBER;
        int result = 1;

        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public final boolean equals(final Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Currency)) {
            return false;
        }

        Currency other = (Currency) obj;

        if (code == null) {

            if (other.code != null) {
                return false;
            }

        } else if (!code.equals(other.code)) {

            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public final String toString() {
        return "Currency [code=" + code + ", symbol=" + symbol + ", name=" + name + "]";
    }

}
