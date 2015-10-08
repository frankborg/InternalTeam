package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Comfort bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Comfort implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 9007897190231306910L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Content text;

    /**
     * 
     */
    public Comfort() {
        super();
    }
    
    
    
    /**
     * @param text
     *            content object referring the comfort text
     */
    public Comfort(final String text) {
        this.text = new Content(text);
    }

    /**
     * @param id
     *            comfort id
     * @param text
     *            content object referring the comfort text
     */
    public Comfort(final Integer id, final Content text) {
        this.id = id;
        this.text = text;
    }

    /**
     * @param id
     *            comfort id
     * @param text
     *            content object referring the comfort text
     */
    public Comfort(final Integer id, final String text) {
        this.id = id;
        this.text = new Content(text);
    }

    /**
     * @return the comfort id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the comfort id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the content object referring the comfort text
     */
    public final Content getText() {
        return text;
    }

    /**
     * @param text
     *            the content object referring the comfort text to set
     */
    public final void setText(final Content text) {
        this.text = text;
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

        result = prime * result + ((text == null) ? 0 : text.hashCode());

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

        Comfort other = (Comfort) obj;

        if (text == null) {

            if (other.text != null) {
                return false;
            }

        } else if (!text.equals(other.text)) {
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
        return "Comfort [id=" + id + ", text=" + text.getContentText() + "]";
    }

}
