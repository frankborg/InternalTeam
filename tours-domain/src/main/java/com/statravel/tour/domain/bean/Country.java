package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Country bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Country implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 8653822467906290708L;
    private static final int HASH_PRIME_NUMBER = 31;

    private String code;
    private Content name;
    private Double latitude;
    private Double longitude;
    private String continentCode;

    /**
     * 
     */
    public Country() {
        super();
    }

    /**
     * @param code
     *            country code
     */
    public Country(final String code) {
        this.code = code;
    }

    /**
     * @param code
     *            country code
     * @param name
     *            content object referring the country name
     * @param latitude
     *            country latitude
     * @param longitude
     *            country longitude
     * @param continentCode
     *            continent code where the country belongs to
     */
    public Country(final String code, final Content name, final Double latitude, final Double longitude, final String continentCode) {
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.continentCode = continentCode;
    }

    /**
     * @return the country code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the country code to set
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    /**
     * @return the content object referring the country name
     */
    public final Content getName() {
        return name;
    }

    /**
     * @param name
     *            the content object referring the country name to set
     */
    public final void setName(final Content name) {
        this.name = name;
    }

    /**
     * @return the latitude
     */
    public final Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     *            the country latitude to set
     */
    public final void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the country longitude
     */
    public final Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     *            the country longitude to set
     */
    public final void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the continent code where the country belongs to
     */
    public final String getContinentCode() {
        return continentCode;
    }

    /**
     * @param continentCode
     *            the continent code to set
     */
    public final void setContinentCode(final String continentCode) {
        this.continentCode = continentCode;
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

        result = prime * result + ((code == null) ? 0 : code.hashCode());

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

        Country other = (Country) obj;

        if (code == null) {

            if (other.code != null) {
                return false;
            }

        } else if (!code.equals(other.code)) {
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
        return "Country [code=" + code + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + ", continentCode="
                + continentCode + "]";
    }

}
