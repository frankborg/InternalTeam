package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * @author STA development team
 *
 */
public class ContikiWhitelabel implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -6044413632761231962L;

    private Integer id;
    private Market market;
    private String json;
    private String xml;
    private String token;

    /**
     * 
     */
    public ContikiWhitelabel() {
        super();
    }

    /**
     * @param json
     *            JSON
     * @param token
     *            contiki token
     */
    public ContikiWhitelabel(final String json, final String token) {
        if(json != null){
            this.json = json.replaceAll("\"", "&quot;");
        }
        this.token = token;
    }

    /**
     * @return the id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the market
     */
    public final Market getMarket() {
        return market;
    }

    /**
     * @param market
     *            the market to set
     */
    public final void setMarket(final Market market) {
        this.market = market;
    }

    /**
     * @return the json
     */
    public final String getJson() {
        return json;
    }

    /**
     * @param json
     *            the json to set
     */
    public final void setJson(final String json) {

        this.json = json.replaceAll("\"", "&quot;");
    }

    /**
     * @return the xml
     */
    public final String getXml() {
        return xml;
    }

    /**
     * @param xml
     *            the xml to set
     */
    public final void setXml(final String xml) {
        this.xml = xml;
    }

    /**
     * @return the token
     */
    public final String getToken() {
        return token;
    }

    /**
     * @param token
     *            the token to set
     */
    public final void setToken(final String token) {
        this.token = token;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public final int hashCode() {

        final int prime = 31;
        int result = 1;

        result = prime * result + ((json == null) ? 0 : json.hashCode());
        result = prime * result + ((token == null) ? 0 : token.hashCode());

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

        if (!(obj instanceof ContikiWhitelabel)) {
            return false;
        }

        ContikiWhitelabel other = (ContikiWhitelabel) obj;

        if (json == null) {

            if (other.json != null) {
                return false;
            }

        } else if (!json.equals(other.json)) {

            return false;
        }

        if (token == null) {

            if (other.token != null) {
                return false;
            }

        } else if (!token.equals(other.token)) {

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
        return "ContikiWhitelabel [id=" + id + ", json=" + json + ", xml=" + xml + ", token=" + token + "]";
    }

}
