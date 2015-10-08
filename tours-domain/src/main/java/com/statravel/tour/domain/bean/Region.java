package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Region bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Region implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -2745128078981510875L;
    private static final int HASH_PRIME_NUMBER = 31;

    private String code;
    private Content name;

    /**
     * 
     */
    public Region() {
        super();
    }

    /**
     * @param code
     *            region code
     */
    public Region(final String code) {
        this.code = code;
    }

    /**
     * @return the region code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the region code to set
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    /**
     * @return the region name
     */
    public final Content getName() {
        return name;
    }

    /**
     * @param name
     *            the region name to set
     */
    public final void setName(final Content name) {
        this.name = name;
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

        Region other = (Region) obj;

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
        return "Region [code=" + code + ", name=" + name + "]";
    }

}
