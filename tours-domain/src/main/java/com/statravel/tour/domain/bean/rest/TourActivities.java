package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TourActivities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourActivities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "TourActivities", propOrder = {
        "activityName"
})
public class TourActivities implements Serializable{

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -3515086096166511442L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected List<String> activityName;

    /**
     * Gets the value of the activityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getactivityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getactivityName() {
        if (activityName == null) {
            activityName = new ArrayList<String>();
        }
        return this.activityName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = HASH_PRIME_NUMBER;
        int result = 1;
        result = prime * result
                + ((activityName == null) ? 0 : activityName.hashCode());
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
        TourActivities other = (TourActivities) obj;
        if (activityName == null) {
            if (other.activityName != null)
                return false;
        } else if (!activityName.equals(other.activityName))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TourActivities [activityName=" + activityName + "]";
    }

}
