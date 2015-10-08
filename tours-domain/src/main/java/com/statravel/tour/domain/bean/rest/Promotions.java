package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Promotions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promotions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promo" type="{}TourPromotion" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promotions", propOrder = {
        "promo"
})
public class Promotions implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -331506587243227428L;


    @XmlElement(required = true)
    protected List<TourPromotion> promo;

    /**
     * Gets the value of the promo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourPromotion }
     * 
     * 
     */
    public List<TourPromotion> getPromo() {
        if (promo == null) {
            promo = new ArrayList<TourPromotion>();
        }
        return this.promo;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((promo == null) ? 0 : promo.hashCode());
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
        Promotions other = (Promotions) obj;
        if (promo == null) {
            if (other.promo != null)
                return false;
        } else if (!promo.equals(other.promo))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Promotions [promo=" + promo + "]";
    }

}
