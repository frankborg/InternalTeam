package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Locale bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Locale implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -3551198494982546601L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String code;

    /**
     * 
     */
    public Locale() {
        super();
    }

    /**
     * @param id
     *            locale id
     * @param code
     *            locale code
     */
    public Locale(final Integer id, final String code) {
        this.id = id;
        this.code = code;
    }

    /**
     * @param code
     *            locale code
     */
    public Locale(final String code) {
        this.code = code;
    }

    /**
     * @return the locale id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the locale id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the code to set
     */
    public final void setCode(final String code) {
        this.code = code;
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

        if (!(obj instanceof Locale)) {
            return false;
        }

        Locale other = (Locale) obj;

        if (code == null) {

            if (other.code != null) {
                return false;
            }

        } else if (!code.equals(other.code)) {
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
        return "Locale [id=" + id + ", code=" + code + "]";
    }

}
