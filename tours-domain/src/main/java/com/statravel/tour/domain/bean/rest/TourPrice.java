package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startingFrom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="showPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
//@XmlType(name = "TourPrice", propOrder = {
//        "startingFrom",
//        "showPrice"
//})
@XmlType(name = "TourPrice", propOrder = {
        "startingFrom"

})
public class TourPrice implements Serializable{

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 8588796640653197193L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    protected double startingFrom;
    //    @XmlElement(required = false)
    //    protected double showPrice;

    /**
     * Gets the value of the startingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link double }
     * 
     */
    public double getStartingFrom() {
        return startingFrom;
    }

    /**
     * Sets the value of the startingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link double }
     * 
     */
    public void setStartingFrom(double value) {
        this.startingFrom = value;
    }



    /**
     * Gets the value of the showPrice property.
     * 
     * @return
     *     possible object is
     *     {@link double }
     * 
     */
    //    public double getShowPrice() {
    //        return showPrice;
    //    }
    //
    //    /**
    //     * Sets the value of the showPrice property.
    //     *
    //     * @param value
    //     *     allowed object is
    //     *     {@link double }
    //     *
    //     */
    //    public void setShowPrice(double value) {
    //        this.showPrice = value;
    //    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(startingFrom);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        TourPrice other = (TourPrice) obj;
        if (Double.doubleToLongBits(startingFrom) != Double
                .doubleToLongBits(other.startingFrom))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TourPrice [startingFrom=" + startingFrom + "]";
    }





}
