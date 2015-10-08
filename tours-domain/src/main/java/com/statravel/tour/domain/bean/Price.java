package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Price bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Price implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -5751555143537255792L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Double tourPrice;
    private Double wasPrice;
    private Currency currency;
    private Content basedOn;

    /**
     * 
     */
    public Price() {
        super();
    }

    /**
     * @param tourPrice
     *            tour price
     */
    public Price(final Double tourPrice) {
        this.tourPrice = tourPrice;
    }

    /**
     * @param id
     *            id
     * @param tourPrice
     *            price
     */
    public Price(final Integer id, final Double tourPrice) {
        this.id = id;
        this.tourPrice = tourPrice;
    }
    
    
    /**
     * @param tourPrice
     *            price
     * @param currency
     *            currency
     *                        
     */
    public Price(final Double tourPrice, final Currency currency) {
        this.tourPrice = tourPrice;
        this.currency = currency;
    }
    
    /**
     * @param id
     *            id
     * @param tourPrice
     *            price
     * @param currency
     *            currency
     *                        
     */
    public Price(final Integer id, final Double tourPrice, final Currency currency) {
        this.id = id;
        this.tourPrice = tourPrice;
        this.currency = currency;
    }


    /**
     * @return the price id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the price id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the tour price
     */
    public final Double getTourPrice() {
        return tourPrice;
    }

    /**
     * @param tourPrice
     *            the price to set
     */
    public final void setTourPrice(final Double tourPrice) {
        this.tourPrice = tourPrice;
    }

    /**
     * @return the currency
     */
    public final Currency getCurrency() {
        return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public final void setCurrency(final Currency currency) {
        this.currency = currency;
    }
    
    
    /**
     * @return the basedOn
     */
    public final Content getBasedOn() {
        return basedOn;
    }

    /**
     * @param basedOn the basedOn to set
     */
    public final void setBasedOn(final Content basedOn) {
        this.basedOn = basedOn;
    }
    
    /**
     * 
     * @return was prices
     */
    public Double getWasPrice() {
        return wasPrice;
    }

    /**
     * 
     * @param wasPrice double
     */
    public void setWasPrice(final Double wasPrice) {
        this.wasPrice = wasPrice;
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

        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((tourPrice == null) ? 0 : tourPrice.hashCode());

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

        if (getClass() != obj.getClass()) {
            return false;
        }

        Price other = (Price) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }

        if (tourPrice == null) {

            if (other.tourPrice != null) {
                return false;
            }

        } else if (!tourPrice.equals(other.tourPrice)) {
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
        return "Price [id=" + id + ", tour price=" + tourPrice +  ", based On=" + basedOn + "]";
    }

}
