package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Include bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Include implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -3813529816908515775L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Content title;
    private Content description;
    private Integer order;

    /**
     * 
     */
    public Include() {
        super();
    }

    /**
     * @param id
     *            included id
     * @param title
     *            content object referring the included title
     * @param description
     *            content object referring the include description
     * @param order
     *            include display order
     */
    public Include(final Integer id, final Content title, final Content description, final Integer order) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.order = order;
    }

    /**
     * @return the included id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the included id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the content object referring the included title
     */
    public final Content getTitle() {
        return title;
    }

    /**
     * @param title
     *            the content object referring the included title to set
     */
    public final void setTitle(final Content title) {
        this.title = title;
    }

    /**
     * @return the content object referring the included description
     */
    public final Content getDescription() {
        return description;
    }

    /**
     * @param description
     *            the content object referring the included description to set
     */
    public final void setDescription(final Content description) {
        this.description = description;
    }

    /**
     * @return the included display order
     */
    public final Integer getOrder() {
        return order;
    }

    /**
     * @param order
     *            the included display order to set
     */
    public final void setOrder(final Integer order) {
        this.order = order;
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

        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());

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

        Include other = (Include) obj;

        if (description == null) {

            if (other.description != null) {
                return false;
            }

        } else if (!description.equals(other.description)) {
            return false;
        }

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
        return "Include [id=" + id + ", title=" + title.getContentText() + ", description=" + description.getContentText() + ", order=" + order + "]";
    }

}
