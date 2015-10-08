package com.statravel.tour.domain.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Market bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Market implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -4536808922968597390L;
    private static final int HASH_PRIME_NUMBER = 31;

    private String code;
    private String name;
    private String countryCode;
    private String currencyCode;
    private String languageCode;
    private String url;
    private String callCentrePhoneNumber;
    private String cancellationPolicyUrl;
    private String divisionCode;
    private List<MarketContact> marketContact;

    /**
     * 
     */
    public Market() {
        super();
    }

    /**
     * @param code
     *            market code
     */
    public Market(final String code) {
        this.code = code;
    }

    /**
     * @param code
     *            market code
     * @param name
     *            market name
     * @param countryCode
     *            country code
     * @param currencyCode
     *            currency code
     * @param languageCode
     *            language code
     * @param url
     *            URL
     * @param divisionCode
     *            division code
     */
    public Market(final String code, final String name, final String countryCode, final String currencyCode, final String languageCode,
            final String url, final String divisionCode) {
        this.code = code;
        this.name = name;
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.languageCode = languageCode;
        this.url = url;
        this.divisionCode = divisionCode;
    }

    /**
     * @return the market code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the market code to set
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    /**
     * @return the market name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name
     *            the market name to set
     */
    public final void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the country code
     */
    public final String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     *            the country code to set
     */
    public final void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the currency code
     */
    public final String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode
     *            the currency code to set
     */
    public final void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the language code
     */
    public final String getLanguageCode() {
        return languageCode;
    }

    /**
     * @param languageCode
     *            the language code to set
     */
    public final void setLanguageCode(final String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * @return the url for the market
     */
    public final String getUrl() {
        return url;
    }

    /**
     * @param url
     *            the market url to set
     */
    public final void setUrl(final String url) {
        this.url = url;
    }

    /**
     * @return the call centre phone number
     */
    public final String getCallCentrePhoneNumber() {
        return callCentrePhoneNumber;
    }

    /**
     * @param callCentrePhoneNumber
     *            the call centre phone number to set
     */
    public final void setCallCentrePhoneNumber(final String callCentrePhoneNumber) {
        this.callCentrePhoneNumber = callCentrePhoneNumber;
    }

    /**
     * @return the cancellation policy url
     */
    public final String getCancellationPolicyUrl() {
        return cancellationPolicyUrl;
    }

    /**
     * @param cancellationPolicyUrl
     *            the cancellation policy url to set
     */
    public final void setCancellationPolicyUrl(final String cancellationPolicyUrl) {
        this.cancellationPolicyUrl = cancellationPolicyUrl;
    }

    /**
     * @return the division code
     */
    public final String getDivisionCode() {
        return divisionCode;
    }

    /**
     * @param divisionCode
     *            the division code to set
     */
    public final void setDivisionCode(final String divisionCode) {
        this.divisionCode = divisionCode;
    }

    /**
     * @return the marketContact
     */
    public final List<MarketContact> getMarketContact() {
        return marketContact;
    }

    /**
     * @param marketContact
     *            the marketContact to set
     */
    public final void setMarketContact(final List<MarketContact> marketContact) {
        this.marketContact = marketContact;
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

        Market other = (Market) obj;

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
        return "Market [code=" + code + ", name=" + name + ", countryCode=" + countryCode + ", currencyCode=" + currencyCode + ", languageCode="
                + languageCode + ", url=" + url + ", callCentrePhoneNumber=" + callCentrePhoneNumber + ", cancellationPolicyUrl="
                + cancellationPolicyUrl + ", divisionCode=" + divisionCode + "]";
    }

}
