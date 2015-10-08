package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Media bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Media implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -1266342488255662743L;

    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private boolean map;
    private MediaContent mediaContent;
    private boolean override;

    /**
     * 
     */
    public Media() {
        super();
    }

    /**
     * @param id
     *            media id
     * @param map
     *            true if the media is a map, false otherwise
     */
    public Media(final Integer id, final boolean map) {
        this.id = id;
        this.map = map;
    }

    /**
     * @param id
     *            media id
     */
    public Media(final Integer id) {
        this.id = id;
    }

    /**
     * @param map
     *            true if the media is a map, false otherwise
     * 
     */
    public Media(final boolean map) {
        this.map = map;
    }

    /**
     * @return id media id
     * 
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the media id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @param map
     *            the map to set
     */
    public final void setMap(final boolean map) {
        this.map = map;
    }

    /**
     * @return map true if the media is a map, false otherwise
     */
    public final boolean isMap() {
        return map;
    }

    /**
     * @return the media content
     */
    public final MediaContent getMediaContent() {
        return mediaContent;
    }

    /**
     * @param mediaContent
     *            the media content to set
     */
    public final void setMediaContent(final MediaContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    /**
     * @return the override
     */
    public final boolean isOverride() {
        return override;
    }

    /**
     * @param override
     *            the override to set
     */
    public final void setOverride(final boolean override) {
        this.override = override;
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

        if (!(obj instanceof Media)) {
            return false;
        }

        Media other = (Media) obj;

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
        return "Media [id=" + id + ", map=" + map + ", mediaContent=" + mediaContent + "]";
    }

}
