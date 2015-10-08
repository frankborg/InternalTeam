package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * City bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class City implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -3280040403888358619L;
    private static final int HASH_PRIME_NUMBER = 31;

    private String code;
    private Content name;
    private Double latitude;
    private Double longitude;
    private Country country;

    /**
     * 
     */
    public City() {
        super();
    }

    /**
     * @param code
     *            city code
     */
    public City(final String code) {
        this.code = code;
    }

    /**
     * @param code
     *            city code
     * @param name
     *            content object referring the city name
     * @param latitude
     *            city latitude
     * @param longitude
     *            city longitude
     * @param country
     *            country where the city belongs to
     */
    public City(final String code, final Content name, final Double latitude, final Double longitude, final Country country) {
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
    }

    /**
     * @return the city code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the city code to set
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    /**
     * @return the content object referring the city name
     */
    public final Content getName() {
        return name;
    }

    /**
     * @param name
     *            the content object referring the city name to set
     */
    public final void setName(final Content name) {
        this.name = name;
    }

    /**
     * @return the city latitude
     */
    public final Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     *            the city latitude to set
     */
    public final void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the city longitude
     */
    public final Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     *            the city longitude to set
     */
    public final void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the country where the city belongs to
     */
    public final Country getCountry() {
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public final void setCountry(final Country country) {
        this.country = country;
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

        City other = (City) obj;

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
        return "City [code=" + code + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + ", country=" + country.getName()
                + "]";
    }

}
