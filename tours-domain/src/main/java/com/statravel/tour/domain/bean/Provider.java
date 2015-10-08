package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Provider bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Provider implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 8801033868761769164L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String name;
    private String prefix;

    /**
     * 
     */
    public Provider() {
        super();

    }

    /**
     * @param id
     *            provider id
     * @param name
     *            provider name
     * @param prefix
     *            provider prefix
     */
    public Provider(final Integer id, final String name, final String prefix) {
        this.id = id;
        this.name = name;
        this.prefix = prefix;
    }

    /**
     * @param name
     *            provider name
     * @param prefix
     *            provider prefix
     */
    public Provider(final String name, final String prefix) {
        this.name = name;
        this.prefix = prefix;
    }

    /**
     * @return the provider id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the provider id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the provider name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name
     *            the provider name to set
     */
    public final void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the provider prefix
     */
    public final String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix
     *            the provider prefix to set
     */
    public final void setPrefix(final String prefix) {
        this.prefix = prefix;
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

        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());

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

        Provider other = (Provider) obj;

        if (name == null) {

            if (other.name != null) {
                return false;
            }

        } else if (!name.equals(other.name)) {
            return false;
        }

        if (prefix == null) {

            if (other.prefix != null) {
                return false;
            }

        } else if (!prefix.equals(other.prefix)) {
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
        return "Provider [id=" + id + ", name=" + name + ", prefix=" + prefix + "]";
    }

}
