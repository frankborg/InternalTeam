package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * ActivityType bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Activity implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 970347170189635138L;

    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Content text;

    /**
     * 
     */
    public Activity() {
        super();
    }

    /**
     * @param id
     *            activity type id
     * @param text
     *            content object referring the activity type text
     */
    public Activity(final Integer id, final Content text) {
        this.id = id;
        this.text = text;
    }

    /**
     * @param text
     *            content object referring the activity type text
     */
    public Activity(final Content text) {
        this.text = text;
    }

    /**
     * @param text
     *            activity type text
     */
    public Activity(final String text) {
        this.text = new Content(text);
    }

    /**
     * @return the activity type id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the activity type id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the content object referring the activity type text
     */
    public final Content getText() {
        return text;
    }

    /**
     * @param text
     *            the content object referring the activity type to set
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

        result = prime * result + ((id == null) ? 0 : id.hashCode());
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

        Activity other = (Activity) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }

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
        return "ActivityType [id=" + id + ", text=" + text.getContentText() + "]";
    }

}
