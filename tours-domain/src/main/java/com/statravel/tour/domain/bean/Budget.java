package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Budget bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Budget implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -7606320682793795773L;

    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String type;
    private Integer fromPrice;
    private Integer toPrice;
    private String currencyCode;

    /**
     * 
     */
    public Budget() {
        super();
    }

    /**
     * @param type
     *            budget type
     * @param fromPrice
     *            from price
     * @param toPrice
     *            to price
     * @param currencyCode
     *            currency code
     */
    public Budget(final String type, final Integer fromPrice, final Integer toPrice, final String currencyCode) {

        this.type = type;
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
        this.currencyCode = currencyCode;
    }

    /**
     * @param fromPrice
     *            from price
     * @param toPrice
     *            to price
     * @param currencyCode
     *            currency code
     */
    public Budget(final Integer fromPrice, final Integer toPrice, final String currencyCode) {

        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
        this.currencyCode = currencyCode;
    }

    /**
     * @param id
     *            budget id
     * @param type
     *            budget type
     * @param fromPrice
     *            from price
     * @param toPrice
     *            to price
     */
    public Budget(final Integer id, final String type, final Integer fromPrice, final Integer toPrice) {

        this.id = id;
        this.type = type;
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
    }

    /**
     * @return the budget id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the budget id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the budget type
     */
    public final String getType() {
        return type;
    }

    /**
     * @param type
     *            the budget type to set
     */
    public final void setType(final String type) {
        this.type = type;
    }

    /**
     * @return the budget from price
     */
    public final Integer getFromPrice() {
        return fromPrice;
    }

    /**
     * @param fromPrice
     *            the budget from price to set
     */
    public final void setFromPrice(final Integer fromPrice) {
        this.fromPrice = fromPrice;
    }

    /**
     * @return the budget to price
     */
    public final Integer getToPrice() {
        return toPrice;
    }

    /**
     * @param toPrice
     *            the budget to price to set
     */
    public final void setToPrice(final Integer toPrice) {
        this.toPrice = toPrice;
    }

    /**
     * @return the currency code
     */
    public final String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode
     *            the currency code to set
     */
    public final void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {

        final int prime = HASH_PRIME_NUMBER;
        int result = 1;

        result = prime * result + ((toPrice == null) ? 0 : toPrice.hashCode());
        result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
        result = prime * result + ((fromPrice == null) ? 0 : fromPrice.hashCode());

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

        if (!(obj instanceof Budget)) {

            return false;
        }

        Budget other = (Budget) obj;

        if (toPrice == null) {

            if (other.toPrice != null) {

                return false;
            }

        } else if (!toPrice.equals(other.toPrice)) {

            return false;
        }

        if (currencyCode == null) {

            if (other.currencyCode != null) {
                return false;
            }

        } else if (!currencyCode.equals(other.currencyCode)) {

            return false;
        }

        if (fromPrice == null) {

            if (other.fromPrice != null) {

                return false;
            }

        } else if (!fromPrice.equals(other.fromPrice)) {

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
        return "Budget [id=" + id + ", type=" + type + ", fromPrice=" + fromPrice + ", ToPrice=" + toPrice + ", currencyCode=" + currencyCode + "]";
    }

}
