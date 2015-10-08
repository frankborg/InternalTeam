package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Media bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class MediaType implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 8935299637713965521L;

    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String fileType;

    /**
     * 
     */
    public MediaType() {
        super();
    }

    /**
     * @param id
     *            media type id
     * @param fileType
     *            file type
     */
    public MediaType(final Integer id, final String fileType) {
        this.id = id;
        this.fileType = fileType;
    }

    /**
     * @param id
     *            media type id
     */
    public MediaType(final Integer id) {
        this.id = id;
    }

    /**
     * @param fileType
     *            file type
     * 
     */
    public MediaType(final String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return id media type id
     * 
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the media type id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @param fileType
     *            file type
     */
    public final void setFileType(final String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return file type
     */
    public final String getfileType() {
        return fileType;
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
        result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());

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

        if (!(obj instanceof MediaType)) {
            return false;
        }

        MediaType other = (MediaType) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {

            return false;
        }

        if (fileType == null) {

            if (other.fileType != null) {
                return false;
            }

        } else if (!fileType.equals(other.fileType)) {
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
        return "Media [id=" + id + ", fileType=" + fileType + "]";
    }

}
