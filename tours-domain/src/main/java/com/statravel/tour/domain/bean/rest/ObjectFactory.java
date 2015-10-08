package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 * 
 */
@SuppressWarnings("restriction")
@XmlRegistry
public class ObjectFactory implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 4754093562572722535L;


    private final static QName _Tours_QNAME = new QName("", "tours");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tours }
     * 
     */
    public Tours createTours() {
        return new Tours();
    }

    /**
     * Create an instance of {@link TourStyles }
     * 
     */
    public TourStyles createTourStyles() {
        return new TourStyles();
    }

    /**
     * Create an instance of {@link TourCurrency }
     * 
     */
    public TourCurrency createTourCurrency() {
        return new TourCurrency();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link ItineraryItem }
     * 
     */
    public ItineraryItem createItineraryItem() {
        return new ItineraryItem();
    }

    /**
     * Create an instance of {@link TourActivities }
     * 
     */
    public TourActivities createTourActivities() {
        return new TourActivities();
    }

    /**
     * Create an instance of {@link TourIncludes }
     * 
     */
    public TourIncludes createTourIncludes() {
        return new TourIncludes();
    }

    /**
     * Create an instance of {@link TourPromotion }
     * 
     */
    public TourPromotion createTourPromotion() {
        return new TourPromotion();
    }

    /**
     * Create an instance of {@link TourPrice }
     * 
     */
    public TourPrice createTourPrice() {
        return new TourPrice();
    }

    /**
     * Create an instance of {@link TourCountriesVisited }
     * 
     */
    public TourCountriesVisited createTourCountriesVisited() {
        return new TourCountriesVisited();
    }

    /**
     * Create an instance of {@link Tour }
     * 
     */
    public Tour createTour() {
        return new Tour();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tours }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tours")
    public JAXBElement<Tours> createTours(Tours value) {
        return new JAXBElement<Tours>(_Tours_QNAME, Tours.class, null, value);
    }

}
