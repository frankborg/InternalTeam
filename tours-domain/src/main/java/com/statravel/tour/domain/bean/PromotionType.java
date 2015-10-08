package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * PromotionType bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class PromotionType implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -6612870166847257975L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String label;

    /**
     * 
     */
    public PromotionType() {
        super();
    }

    /**
     * @param id
     *            promotion type id
     * @param label
     *            promotion type label
     */
    public PromotionType(final Integer id, final String label) {
        this.id = id;
        this.label = label;
    }

    /**
     * @param label
     *            promotion type label
     */
    public PromotionType(final String label) {
        this.label = label;
    }

    /**
     * @return the promotion type id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the promotion type id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the promotion type label
     */
    public final String getLabel() {
        return label;
    }

    /**
     * @param label
     *            the promotion type label to set
     */
    public final void setLabel(final String label) {
        this.label = label;
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
        result = prime * result + ((label == null) ? 0 : label.hashCode());

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

        PromotionType other = (PromotionType) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }

        if (label == null) {

            if (other.label != null) {
                return false;
            }
        } else if (!label.equals(other.label)) {
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
        return "PromotionType [id=" + id + ", label=" + label + "]";
    }

}
