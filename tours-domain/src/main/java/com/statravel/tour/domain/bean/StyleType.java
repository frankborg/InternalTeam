package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * StyleType bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class StyleType implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 756336660744364764L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Content title;
    private Content description;

    /**
     * 
     */
    public StyleType() {
        super();
    }

    /**
     * @param id
     *            style type id
     * @param title
     *            style type text
     * @param description
     *            style type description
     */
    public StyleType(final Integer id, final Content title, final Content description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    /**
     * @param title
     *            style type text
     * @param description
     *            style type description
     */
    public StyleType(final Content title, final Content description) {
        this.title = title;
        this.description = description;
    }

    /**
     * @return the style type id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the style type id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the the content object referring the style type title
     */
    public final Content getTitle() {
        return title;
    }

    /**
     * @param title
     *            the the content object referring the style type to set
     */
    public final void setTitle(final Content title) {
        this.title = title;
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
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());

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

        StyleType other = (StyleType) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }

        if (title == null) {

            if (other.title != null) {
                return false;
            }

        } else if (!title.equals(other.title)) {
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
        return "StyleType [id=" + id + ", title=" + title.getContentText() + "]";
    }

}
