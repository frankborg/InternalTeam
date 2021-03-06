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
 * <p>Java class for TourStyles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourStyles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="styleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "TourStyles", propOrder = {
        "styleName"
})
public class TourStyles implements Serializable {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -6854626641263806710L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected List<String> styleName;

    /**
     * Gets the value of the styleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleName() {
        if (styleName == null) {
            styleName = new ArrayList<String>();
        }
        return this.styleName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = HASH_PRIME_NUMBER;
        int result = 1;
        result = prime * result
                + ((styleName == null) ? 0 : styleName.hashCode());
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
        TourStyles other = (TourStyles) obj;
        if (styleName == null) {
            if (other.styleName != null)
                return false;
        } else if (!styleName.equals(other.styleName))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TourStyles [styleName=" + styleName + "]";
    }

}
