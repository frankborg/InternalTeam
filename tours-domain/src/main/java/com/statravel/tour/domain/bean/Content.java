package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Content bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Content implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -4850664821241587946L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String contentText;

    /**
     * 
     */
    public Content() {
        super();
    }

    /**
     * @param id
     *            content id
     * @param contentText
     *            content text
     */
    public Content(final Integer id, final String contentText) {
        this.id = id;
        this.contentText = contentText;
    }

    /**
     * @param contentText
     *            content text
     */
    public Content(final String contentText) {
        this.contentText = contentText;
    }

    /**
     * @return the content id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the content id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the content text
     */
    public final String getContentText() {
        return this.contentText;
    }

    /**
     * @param contentText
     *            the content text to set
     */
    public final void setContentText(final String contentText) {
        this.contentText = contentText;
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

        result = prime * result + ((contentText == null) ? 0 : contentText.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());

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

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Content other = (Content) obj;

        if (contentText == null) {

            if (other.contentText != null) {
                return false;
            }

        } else if (!contentText.equals(other.contentText)) {

            return false;
        }

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
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

        return "Content [id=" + id + ", contentText=" + contentText + "]";
    }

}