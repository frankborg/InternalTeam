package com.statravel.tour.domain.bean;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;

/**
 * Departure bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Departure implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 5875247004355922741L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Date startDate;
    private Price price;
    private String deepLink;
    
    private String shortMonth;
    private String longMonth;
    private Integer year;
 
    /**
     * 
     */
    public Departure() {
        super();
    }

    /**
     * @param startDate
     *            departure date
     * @param price
     *            price
     * 
     */
    public Departure(final Date startDate, final Price price) {
        this.startDate = startDate;
        this.price = price;
    }

    /**
     * @param id
     *            departure id
     * @param startDate
     *            departure date
     * @param price
     *            price
     */
    public Departure(final Integer id, final Date startDate, final Price price) {
        this(startDate,price);
        this.id = id;
    }
    
    
    /**
     * @param id
     *            departure id
     * @param startDate
     *            departure date
     * @param price
     *            price
     */
    public Departure(final Date startDate, final Price price, final String deepLink, final java.util.Locale  locale) {
          this(startDate,price);
          this.deepLink = deepLink;
          DateTime dateTimeInstance = new DateTime(startDate);
          this.shortMonth = dateTimeInstance.monthOfYear().getAsShortText(locale);
          this.longMonth = dateTimeInstance.monthOfYear().getAsText(locale);
          this.year = dateTimeInstance.getYear();
    }

    /**
     * @return the start date
     */
    public final Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *            the start date to set
     */
    public final void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the price
     */
    public final Price getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public final void setPrice(final Price price) {
        this.price = price;
    }

    /**
     * @return the departure id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the departure id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }
    
    
    /**
     * @return the deepLink
     */
    public final String getDeepLink() {
        return deepLink;
    }

    /**
     * @param deepLink the deepLink to set
     */
    public final void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }
    

    /**
     * @return the shortMonth
     */
    public final String getShortMonth() {
        return shortMonth;
    }
    
    
    /**
     * @return the shortMonth
     */
    public final String getLongMonth() {
        return longMonth;
    }


    /**
     * @return the year
     */
    public final Integer getYear() {
        return year;
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
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((deepLink == null) ? 0 : deepLink.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());

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

        Departure other = (Departure) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }
        if (price == null) {
            if (other.price != null) {
                return false;
            }

        } else if (!price.equals(other.price)) {
            return false;
        }

        if (startDate == null) {

            if (other.startDate != null) {
                return false;
            }

        } else if (!startDate.equals(other.startDate)) {
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
        return "Departure [id=" + id + ", startDate=" + startDate + ", price=" + price.getTourPrice() + ", deepLink=" + deepLink + "]";
    }

}
