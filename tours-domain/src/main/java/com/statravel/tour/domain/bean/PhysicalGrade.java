package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * PhysicalGrade bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class PhysicalGrade implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 5880218141190117908L;

    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Content description;

    /**
     * 
     */
    public PhysicalGrade() {
        super();
    }

    /**
     * @param id
     *            physical grade id
     * @param description
     *            content object referring the physical grade description
     */
    public PhysicalGrade(final Integer id, final Content description) {
        this.id = id;
        this.description = description;
    }

    /**
     * @param id
     *            physical grade id
     * @param description
     *            content object referring the physical grade description
     */
    public PhysicalGrade(final Integer id, final String description) {
        this.id = id;
        this.description = new Content(description);
    }

    /**
     * @return the physical grade id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the physical grade id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the content object referring the physical grade description
     */
    public final Content getDescription() {
        return description;
    }

    /**
     * @param description
     *            the content object referring the physical grade description to
     *            set
     */
    public final void setDescription(final Content description) {
        this.description = description;
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

        PhysicalGrade other = (PhysicalGrade) obj;

        if (description == null) {

            if (other.description != null) {
                return false;
            }

        } else if (!description.equals(other.description)) {
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
        return "Comfort [id=" + id + ", text=" + description.getContentText() + "]";
    }

}
