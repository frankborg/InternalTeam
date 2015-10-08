package com.statravel.tour.domain.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Tour bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Tour implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 7171393922919893332L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private String code;
    private Content title;
    private Content description;
    private Provider provider;
    private Integer duration;
    private boolean status;
    private Comfort comfort;
    private List<Itinerary> itinerary;
    private List<Include> includes;
    private List<Activity> activities;
    private List<Style> tripStyles;
    private List<Country> countriesVisited;
    private List<City> cityVisited;
    private List<Departure> departures;
    private List<Promotion> promotions;
    private boolean recommended;
    private Market market;
    private List<Media> media;
    private Integer groupMinimum;
    private Integer groupMaximum;
    private Price price;
    private Region region;

    /**
     * 
     */
    public Tour() {
        super();
    }

    /**
     * @param id
     *            tour id
     */
    public Tour(final Integer id) {
        this.id = id;
    }

    /**
     * @param code
     *            tour code
     * @param title
     *            tour title
     * @param description
     *            tour description
     * @param status
     *            tour status
     * @param market
     *            tour market
     */
    public Tour(final String code, final Content title, final Content description, final boolean status, final Market market) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.status = status;
        this.market = market;
    }

    /**
     * @param code
     *            tour code
     * @param marketCode
     *            market code
     */
    public Tour(final String code, final String marketCode) {
        this.code = code;
        this.market = new Market(marketCode);
    }

    /**
     * @return the tour id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the tour id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the tour code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the tour code to set
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    /**
     * @return the the content object referring the tour title
     */
    public final Content getTitle() {
        return title;
    }

    /**
     * @param title
     *            the the content object referring the tour title to set
     */
    public final void setTitle(final Content title) {
        this.title = title;
    }

    /**
     * @return the the content object referring the tour description
     */
    public final Content getDescription() {
        return description;
    }

    /**
     * @param description
     *            the the content object referring the tour description to set
     */
    public final void setDescription(final Content description) {
        this.description = description;
    }

    /**
     * @return the tour provider
     */
    public final Provider getProvider() {
        return provider;
    }

    /**
     * @param provider
     *            the tour provider to set
     */
    public final void setProvider(final Provider provider) {
        this.provider = provider;
    }

    /**
     * @return the tour duration in days
     */
    public final Integer getDuration() {
        return duration;
    }

    /**
     * @param duration
     *            the tours duration to set
     */
    public final void setDuration(final Integer duration) {
        this.duration = duration;
    }

    /**
     * @return the tour status
     */
    public final boolean isActive() {
        return status;
    }

    /**
     * @param status
     *            the tour status to set
     */
    public final void setStatus(final boolean status) {
        this.status = status;
    }

    /**
     * @return the tour comfort
     */
    public final Comfort getComfort() {
        return comfort;
    }

    /**
     * @param comfort
     *            the tour comfort to set
     */
    public final void setComfort(final Comfort comfort) {
        this.comfort = comfort;
    }

    /**
     * @return the itinerary
     */
    public final List<Itinerary> getItinerary() {
        return itinerary;
    }

    /**
     * @param itinerary
     *            the itinerary to set
     */
    public final void setItinerary(final List<Itinerary> itinerary) {
        this.itinerary = itinerary;
    }

    /**
     * @return the tour includes
     */
    public final List<Include> getIncludes() {
        return includes;
    }

    /**
     * @param includes
     *            the tour includes to set
     */
    public final void setIncludes(final List<Include> includes) {
        this.includes = includes;
    }

    /**
     * @return the tour activities
     */
    public final List<Activity> getActivities() {
        return activities;
    }

    /**
     * @param activities
     *            the tour activities to set
     */
    public final void setActivities(final List<Activity> activities) {
        this.activities = activities;
    }

    /**
     * @return the tour trip styles
     */
    public final List<Style> getTripStyles() {
        return tripStyles;
    }

    /**
     * @param tripStyles
     *            the tour trip styles to set
     */
    public final void setTripStyles(final List<Style> tripStyles) {
        this.tripStyles = tripStyles;
    }

    /**
     * @return the tour countries visited
     */
    public final List<Country> getCountriesVisited() {
        return countriesVisited;
    }

    /**
     * @param countriesVisited
     *            the tour countries visited to set
     */
    public final void setCountriesVisited(final List<Country> countriesVisited) {
        this.countriesVisited = countriesVisited;
    }

    /**
     * @return the tour cities visited
     */
    public final List<City> getCityVisited() {
        return cityVisited;
    }

    /**
     * @param cityVisited
     *            the tour cities visited to set
     */
    public final void setCityVisited(final List<City> cityVisited) {
        this.cityVisited = cityVisited;
    }

    /**
     * @return the tour departure information
     */
    public final List<Departure> getDepartures() {
        return departures;
    }

    /**
     * @param departures
     *            the tour departure information to set
     */
    public final void setDepartures(final List<Departure> departures) {
        this.departures = departures;
    }

    /**
     * @return the true if the tour is recommended
     */
    public final boolean isRecommended() {
        return recommended;
    }

    /**
     * @param recommended
     *            the tour recommendation to set
     */
    public final void setRecommended(final boolean recommended) {
        this.recommended = recommended;
    }

    /**
     * @return the tour market
     */
    public final Market getMarket() {
        return market;
    }

    /**
     * @param market
     *            the tour market to set
     */
    public final void setMarket(final Market market) {
        this.market = market;
    }

    /**
     * @return the media
     */
    public final List<Media> getMedia() {
        return media;
    }

    /**
     * @param media
     *            the media to set
     */
    public final void setMedia(final List<Media> media) {
        this.media = media;
    }

    /**
     * @return the groupMinimum
     */
    public final Integer getGroupMinimum() {
        return groupMinimum;
    }

    /**
     * @param groupMinimum
     *            the groupMinimum to set
     */
    public final void setGroupMinimum(final Integer groupMinimum) {
        this.groupMinimum = groupMinimum;
    }

    /**
     * @return the groupMaximum
     */
    public final Integer getGroupMaximum() {
        return groupMaximum;
    }

    /**
     * @param groupMaximum
     *            the groupMaximum to set
     */
    public final void setGroupMaximum(final Integer groupMaximum) {
        this.groupMaximum = groupMaximum;
    }

    /**
     * @return the promotions
     */
    public final List<Promotion> getPromotions() {
        return promotions;
    }

    /**
     * @param promotions
     *            the promotions to set
     */
    public final void setPromotions(final List<Promotion> promotions) {
        this.promotions = promotions;
    }

    /**
     * @return the price
     */
    public final Price getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public final void setPrice(final Price price) {
        this.price = price;
    }

    /**
     * @return the region
     */
    public final Region getRegion() {
        return region;
    }

    /**
     * @param region
     *            the region to set
     */
    public final void setRegion(final Region region) {
        this.region = region;
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

        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((market == null) ? 0 : market.hashCode());

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

        Tour other = (Tour) obj;

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }

        if (market == null) {

            if (other.market != null) {
                return false;
            }

        } else if (!market.equals(other.market)) {
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
        return "Tour [id=" + id + ", code=" + code + ", title=" + title + ", description=" + description + ", provider=" + provider + ", duration="
                + duration + ", status=" + status + ", comfort=" + comfort + ", includes=" + includes + ", activities=" + activities
                + ", tripStyles=" + tripStyles + ", countriesVisited=" + countriesVisited + ", cityVisited=" + cityVisited + ", departure="
                + departures + ", image=" + ", recommended=" + recommended + ", market=" + market + ", itinerary=" + itinerary + "]";
    }

}
