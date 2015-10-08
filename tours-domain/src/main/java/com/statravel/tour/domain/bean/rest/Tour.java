package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for Tour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tourCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tourName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tourDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comfortLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tourIncludes" type="{}TourIncludes"/>
 *         &lt;element name="itineraryImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itinerary" type="{}Itinerary"/>
 *         &lt;element name="tourStyles" type="{}TourStyles"/>
 *         &lt;element name="tourActivities" type="{}TourActivities"/>
 *         &lt;element name="tourRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tourCountriesVisited" type="{}TourCountriesVisited"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{}TourPrice"/>
 *         &lt;element name="promotions" type="{}Promotions"/>
 *         &lt;element name="currency" type="{}TourCurrency"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tourDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tourProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tour", propOrder = {
        "tourCode",
        "tourName",
        "tourDescription",
        "comfortLevel",
        "tourIncludes",
        "itineraryImage",
        "itinerary",
        "tourstyles",
        "tourActivities",
        "tourRegion",
        "tourCountriesVisited",
        "link",
        "price",
        "promotions",
        "currency",
        "image",
        "tourDuration",
        "tourProvider",
        "marketCode"
})
public class Tour implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -2364154710711126339L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    protected String tourCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected String tourName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected String tourDescription;
    @XmlElement(required = true)
    protected String comfortLevel;
    @XmlElement(required = false)
    protected TourIncludes tourIncludes;
    @XmlElement(required = true)
    protected String itineraryImage;
    @XmlElement(required = false)
    protected Itinerary itinerary;
    @XmlElement(required = false)
    protected TourStyles tourstyles;
    @XmlElement(required = false)
    protected TourActivities tourActivities;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(AdapterXmlCDATA.class)
    protected String tourRegion;
    @XmlElement(required = false)
    protected TourCountriesVisited tourCountriesVisited;
    @XmlElement(required = true)
    protected String link;
    @XmlElement(required = true)
    protected TourPrice price;
    @XmlElement(required = true)
    protected Promotions promotions;
    @XmlElement(required = true)
    protected TourCurrency currency;
    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected int tourDuration;
    @XmlElement(required = true)
    protected String tourProvider;
    @XmlElement(required = true)
    protected String marketCode;

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the tourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */

    public void setTourName(String value) {
        this.tourName = value;
    }

    /**
     * Gets the value of the tourDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getTourDescription() {
        return tourDescription;
    }

    /**
     * Sets the value of the tourDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setTourDescription(String value) {
        this.tourDescription = value;
    }

    /**
     * Gets the value of the comfortLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getComfortLevel() {
        return comfortLevel;
    }

    /**
     * Sets the value of the comfortLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setComfortLevel(String value) {
        this.comfortLevel = value;
    }

    /**
     * Gets the value of the tourIncludes property.
     * 
     * @return
     *     possible object is
     *     {@link TourIncludes }
     * 
     */
    public TourIncludes getTourIncludes() {
        return tourIncludes;
    }

    /**
     * Sets the value of the tourIncludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourIncludes }
     * 
     */
    public void setTourIncludes(TourIncludes value) {
        this.tourIncludes = value;
    }

    /**
     * Gets the value of the itineraryImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getItineraryImage() {
        return itineraryImage;
    }

    /**
     * Sets the value of the itineraryImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setItineraryImage(String value) {
        this.itineraryImage = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Itinerary }
     * 
     */
    public Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Itinerary }
     * 
     */
    public void setItinerary(Itinerary value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the tourstyles property.
     * 
     * @return
     *     possible object is
     *     {@link TourStyles }
     * 
     */
    public TourStyles getTourstyles() {
        return tourstyles;
    }

    /**
     * Sets the value of the tourstyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourStyles }
     * 
     */
    public void setTourstyles(TourStyles value) {
        this.tourstyles = value;
    }

    /**
     * Gets the value of the tourActivities property.
     * 
     * @return
     *     possible object is
     *     {@link TourActivities }
     * 
     */
    public TourActivities getTourActivities() {
        return tourActivities;
    }

    /**
     * Sets the value of the tourActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourActivities }
     * 
     */
    public void setTourActivities(TourActivities value) {
        this.tourActivities = value;
    }

    /**
     * Gets the value of the tourRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getTourRegion() {
        return tourRegion;
    }

    /**
     * Sets the value of the tourRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setTourRegion(String value) {
        this.tourRegion = value;
    }

    /**
     * Gets the value of the tourCountriesVisited property.
     * 
     * @return
     *     possible object is
     *     {@link TourCountriesVisited }
     * 
     */
    public TourCountriesVisited getTourCountriesVisited() {
        return tourCountriesVisited;
    }

    /**
     * Sets the value of the tourCountriesVisited property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCountriesVisited }
     * 
     */
    public void setTourCountriesVisited(TourCountriesVisited value) {
        this.tourCountriesVisited = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link TourPrice }
     * 
     */
    public TourPrice getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourPrice }
     * 
     */
    public void setPrice(TourPrice value) {
        this.price = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     * 
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     * 
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link TourCurrency }
     * 
     */
    public TourCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCurrency }
     * 
     */
    public void setCurrency(TourCurrency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the tourDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public int getTourDuration() {
        return tourDuration;
    }

    /**
     * Sets the value of the tourDuration property.
     * 
     * @param i
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setTourDuration(int i) {
        this.tourDuration = i;
    }

    /**
     * Gets the value of the tourProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getTourProvider() {
        return tourProvider;
    }

    /**
     * Sets the value of the tourProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setTourProvider(String value) {
        this.tourProvider = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((comfortLevel == null) ? 0 : comfortLevel.hashCode());
        result = prime * result
                + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((image == null) ? 0 : image.hashCode());
        result = prime * result
                + ((itinerary == null) ? 0 : itinerary.hashCode());
        result = prime * result
                + ((itineraryImage == null) ? 0 : itineraryImage.hashCode());
        result = prime * result + ((link == null) ? 0 : link.hashCode());
        result = prime * result
                + ((marketCode == null) ? 0 : marketCode.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result
                + ((promotions == null) ? 0 : promotions.hashCode());
        result = prime * result
                + ((tourActivities == null) ? 0 : tourActivities.hashCode());
        result = prime * result
                + ((tourCode == null) ? 0 : tourCode.hashCode());
        result = prime
                * result
                + ((tourCountriesVisited == null) ? 0 : tourCountriesVisited
                        .hashCode());
        result = prime * result
                + ((tourDescription == null) ? 0 : tourDescription.hashCode());
        result = prime * result + tourDuration;
        result = prime * result
                + ((tourIncludes == null) ? 0 : tourIncludes.hashCode());
        result = prime * result
                + ((tourName == null) ? 0 : tourName.hashCode());
        result = prime * result
                + ((tourProvider == null) ? 0 : tourProvider.hashCode());
        result = prime * result
                + ((tourRegion == null) ? 0 : tourRegion.hashCode());
        result = prime * result
                + ((tourstyles == null) ? 0 : tourstyles.hashCode());
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
        Tour other = (Tour) obj;
        if (comfortLevel == null) {
            if (other.comfortLevel != null)
                return false;
        } else if (!comfortLevel.equals(other.comfortLevel))
            return false;
        if (currency == null) {
            if (other.currency != null)
                return false;
        } else if (!currency.equals(other.currency))
            return false;
        if (image == null) {
            if (other.image != null)
                return false;
        } else if (!image.equals(other.image))
            return false;
        if (itinerary == null) {
            if (other.itinerary != null)
                return false;
        } else if (!itinerary.equals(other.itinerary))
            return false;
        if (itineraryImage == null) {
            if (other.itineraryImage != null)
                return false;
        } else if (!itineraryImage.equals(other.itineraryImage))
            return false;
        if (link == null) {
            if (other.link != null)
                return false;
        } else if (!link.equals(other.link))
            return false;
        if (marketCode == null) {
            if (other.marketCode != null)
                return false;
        } else if (!marketCode.equals(other.marketCode))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (promotions == null) {
            if (other.promotions != null)
                return false;
        } else if (!promotions.equals(other.promotions))
            return false;
        if (tourActivities == null) {
            if (other.tourActivities != null)
                return false;
        } else if (!tourActivities.equals(other.tourActivities))
            return false;
        if (tourCode == null) {
            if (other.tourCode != null)
                return false;
        } else if (!tourCode.equals(other.tourCode))
            return false;
        if (tourCountriesVisited == null) {
            if (other.tourCountriesVisited != null)
                return false;
        } else if (!tourCountriesVisited.equals(other.tourCountriesVisited))
            return false;
        if (tourDescription == null) {
            if (other.tourDescription != null)
                return false;
        } else if (!tourDescription.equals(other.tourDescription))
            return false;
        if (tourDuration != other.tourDuration)
            return false;
        if (tourIncludes == null) {
            if (other.tourIncludes != null)
                return false;
        } else if (!tourIncludes.equals(other.tourIncludes))
            return false;
        if (tourName == null) {
            if (other.tourName != null)
                return false;
        } else if (!tourName.equals(other.tourName))
            return false;
        if (tourProvider == null) {
            if (other.tourProvider != null)
                return false;
        } else if (!tourProvider.equals(other.tourProvider))
            return false;
        if (tourRegion == null) {
            if (other.tourRegion != null)
                return false;
        } else if (!tourRegion.equals(other.tourRegion))
            return false;
        if (tourstyles == null) {
            if (other.tourstyles != null)
                return false;
        } else if (!tourstyles.equals(other.tourstyles))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Tour [tourCode=" + tourCode + ", tourName=" + tourName
                + ", tourDescription=" + tourDescription + ", comfortLevel="
                + comfortLevel + ", tourIncludes=" + tourIncludes
                + ", itineraryImage=" + itineraryImage + ", itinerary="
                + itinerary + ", tourstyles=" + tourstyles
                + ", tourActivities=" + tourActivities + ", tourRegion="
                + tourRegion + ", tourCountriesVisited=" + tourCountriesVisited
                + ", link=" + link + ", price=" + price + ", promotions="
                + promotions + ", currency=" + currency + ", image=" + image
                + ", tourDuration=" + tourDuration + ", tourProvider="
                + tourProvider + ", marketCode=" + marketCode + "]";
    }




}
