package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ItineraryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itineraryTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itineraryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItem", propOrder = {
        "itineraryTitle",
        "itineraryDescription"
})
public class ItineraryItem implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 3358616552384577125L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected String itineraryTitle;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected String itineraryDescription;

    /**
     * Gets the value of the itineraryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getItineraryTitle() {
        return itineraryTitle;
    }

    /**
     * Sets the value of the itineraryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setItineraryTitle(String value) {
        this.itineraryTitle = value;
    }

    /**
     * Gets the value of the itineraryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getItineraryDescription() {
        return itineraryDescription;
    }

    /**
     * Sets the value of the itineraryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setItineraryDescription(String value) {
        this.itineraryDescription = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = HASH_PRIME_NUMBER;
        int result = 1;
        result = prime
                * result
                + ((itineraryDescription == null) ? 0 : itineraryDescription
                        .hashCode());
        result = prime * result
                + ((itineraryTitle == null) ? 0 : itineraryTitle.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItineraryItem other = (ItineraryItem) obj;
        if (itineraryDescription == null) {
            if (other.itineraryDescription != null)
                return false;
        } else if (!itineraryDescription.equals(other.itineraryDescription))
            return false;
        if (itineraryTitle == null) {
            if (other.itineraryTitle != null)
                return false;
        } else if (!itineraryTitle.equals(other.itineraryTitle))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ItineraryItem [itineraryTitle=" + itineraryTitle
                + ", itineraryDescription=" + itineraryDescription + "]";
    }


}
