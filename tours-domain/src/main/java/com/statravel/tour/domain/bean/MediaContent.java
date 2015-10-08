package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Media bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class MediaContent implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -1266342488255662743L;

    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String url;
    private String previewUrl;
    private MediaType mediaType;

    /**
     * 
     */
    public MediaContent() {
        super();
    }

    /**
     * @param id
     *            media content id
     * @param url
     *            URL
     * @param previewUrl
     *            preview URL
     * @param mediaType
     *            media type
     */
    public MediaContent(final Integer id, final String url, final String previewUrl, final MediaType mediaType) {
        this.id = id;
        this.url = url;
        this.previewUrl = previewUrl;
        this.mediaType = mediaType;
    }

    /**
     * @param url
     *            URL
     * @param previewUrl
     *            preview URL
     * @param mediaType
     *            media type
     */
    public MediaContent(final String url, final String previewUrl, final MediaType mediaType) {
        this.url = url;
        this.previewUrl = previewUrl;
        this.mediaType = mediaType;
    }

    /**
     * @return the media content id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the media content id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the URL
     */
    public final String getUrl() {
        return url;
    }

    /**
     * @param url
     *            the URL to set
     */
    public final void setUrl(final String url) {
        this.url = url;
    }

    /**
     * @return the preview URL
     */
    public final String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * @param previewUrl
     *            the preview URL to set
     */
    public final void setPreviewUrl(final String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * @return the media type
     */
    public final MediaType getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType
     *            the media type to set
     */
    public final void setMediaType(final MediaType mediaType) {
        this.mediaType = mediaType;
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

        result = prime * result + ((mediaType == null) ? 0 : mediaType.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());

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

        if (!(obj instanceof MediaContent)) {
            return false;
        }

        MediaContent other = (MediaContent) obj;

        if (mediaType == null) {

            if (other.mediaType != null) {
                return false;
            }

        } else if (!mediaType.equals(other.mediaType)) {

            return false;
        }

        if (url == null) {

            if (other.url != null) {
                return false;
            }

        } else if (!url.equals(other.url)) {

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
        return "MediaContent [id=" + id + ", url=" + url + ", mediaType=" + mediaType + "]";
    }

}
