package com.statravel.tour.domain.bean.rest;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itineraryItem" type="{}ItineraryItem" maxOccurs="unbounded"/>
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
@XmlType(name = "Itinerary", propOrder = {
        "itineraryItem"
})
public class Itinerary implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -5420553871393637247L;
    private static final int HASH_PRIME_NUMBER = 31;


    @XmlElement(required = true)
    protected List<ItineraryItem> itineraryItem;

    /**
     * Gets the value of the itineraryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryItem }
     * 
     * 
     */
    public List<ItineraryItem> getItineraryItem() {
        if (itineraryItem == null) {
            itineraryItem = new ArrayList<ItineraryItem>();
        }
        return this.itineraryItem;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = HASH_PRIME_NUMBER;
        int result = 1;
        result = prime * result
                + ((itineraryItem == null) ? 0 : itineraryItem.hashCode());
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
        Itinerary other = (Itinerary) obj;
        if (itineraryItem == null) {
            if (other.itineraryItem != null)
                return false;
        } else if (!itineraryItem.equals(other.itineraryItem))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Itinerary [itineraryItem=" + itineraryItem + "]";
    }


}
