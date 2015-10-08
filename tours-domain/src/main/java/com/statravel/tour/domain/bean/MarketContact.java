package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * 
 * @author STA development team
 *
 */
public class MarketContact implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 5165098907587994725L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Market market;
    private String contactType;
    private String contact;

    /**
     * 
     */
    public MarketContact() {
        super();
    }

    /**
     * @param id
     *            Integer
     * @param contactType
     *            String
     * @param contact
     *            String
     */
    public MarketContact(final Integer id, final String contactType, final String contact) {
        super();
        this.id = id;
        this.contactType = contactType;
        this.contact = contact;
    }

    /**
     * @return the id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the market
     */
    public final Market getMarket() {
        return market;
    }

    /**
     * @param market
     *            the market to set
     */
    public final void setMarket(final Market market) {
        this.market = market;
    }

    /**
     * @return the contactType
     */
    public final String getContactType() {
        return contactType;
    }

    /**
     * @param contactType
     *            the contactType to set
     */
    public final void setContactType(final String contactType) {
        this.contactType = contactType;
    }

    /**
     * @return the contact
     */
    public final String getContact() {
        return contact;
    }

    /**
     * @param contact
     *            the contact to set
     */
    public final void setContact(final String contact) {
        this.contact = contact;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public final String toString() {
        return "MarketContact [id=" + id + ", market=" + market + ", contactType=" + contactType + ", contact=" + contact + "]";
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
        result = prime * result + ((contact == null) ? 0 : contact.hashCode());
        result = prime * result + ((contactType == null) ? 0 : contactType.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((market == null) ? 0 : market.hashCode());
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
        if (!(obj instanceof MarketContact)) {
            return false;
        }
        MarketContact other = (MarketContact) obj;
        if (contact == null) {
            if (other.contact != null) {
                return false;
            }
        } else if (!contact.equals(other.contact)) {
            return false;
        }
        if (contactType == null) {
            if (other.contactType != null) {
                return false;
            }
        } else if (!contactType.equals(other.contactType)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (market == null) {
            if (other.market != null) {
                return false;
            }
        } else if (!market.equals(other.market)) {
            return false;
        }
        return true;
    }

}
