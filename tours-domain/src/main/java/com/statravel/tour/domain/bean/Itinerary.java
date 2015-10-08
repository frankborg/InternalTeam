package com.statravel.tour.domain.bean;

import java.io.Serializable;

/**
 * Itinerary bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Itinerary implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -2177172355494995334L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Content title;
    private Content description;
    private Content shortDescription;
    private Integer order;

    /**
     * 
     */
    public Itinerary() {
        super();
    }

    /**
     * @param id
     *            itinerary id
     * @param title
     *            content object referring the itinerary title
     * @param description
     *            content object referring the itinerary description
     * @param shortDescription
     *            content object referring the itinerary short description
     * @param order
     *            itinerary display order
     */
    public Itinerary(final Integer id, final Content title, final Content description, final Content shortDescription, final Integer order) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
        this.order = order;
    }

    /**
     * @param title
     *            content object referring the itinerary title
     * @param description
     *            content object referring the itinerary description
     * @param shortDescription
     *            content object referring the itinerary short description
     */
    public Itinerary(final Content title, final Content description, final Content shortDescription) {
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
    }

    /**
     * @param id
     *            itinerary id
     * @param title
     *            content object referring the itinerary title
     * @param description
     *            content object referring the itinerary description
     * @param shortDescription
     *            content object referring the itinerary short description
     */
    public Itinerary(final Integer id, final Content title, final Content description, final Content shortDescription) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
    }

    /**
     * @param title
     *            content object referring the itinerary title
     * @param description
     *            content object referring the itinerary description
     * @param shortDescription
     *            content object referring the itinerary short description
     * @param order
     *            itinerary display order
     */
    public Itinerary(final Content title, final Content description, final Content shortDescription, final Integer order) {
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
        this.order = order;
    }

    /**
     * @return the itinerary id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the itinerary id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the content object referring the itinerary title
     */
    public final Content getTitle() {
        return title;
    }

    /**
     * @param title
     *            the content object referring the itinerary title to set
     */
    public final void setTitle(final Content title) {
        this.title = title;
    }

    /**
     * @return the content object referring the itinerary description
     */
    public final Content getDescription() {
        return description;
    }

    /**
     * @param description
     *            the content object referring the itinerary description to set
     */
    public final void setDescription(final Content description) {
        this.description = description;
    }

    /**
     * @return the content object referring the itinerary shortDescription
     */
    public final Content getShortDescription() {
        return shortDescription;
    }

    /**
     * @param shortDescription
     *            the content object referring the itinerary shortDescription to
     *            set
     */
    public final void setShortDescription(final Content shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @return the itinerary display order
     */
    public final Integer getOrder() {
        return order;
    }

    /**
     * @param order
     *            the itinerary display order to set
     */
    public final void setOrder(final Integer order) {
        this.order = order;
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

        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());

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

        Itinerary itineraryObjectReceived = (Itinerary) obj;

        if (description == null) {

            if (itineraryObjectReceived.description != null) {
                return false;
            }

        } else if (!description.equals(itineraryObjectReceived.description)) {
            return false;
        }

        if (shortDescription == null) {

            if (itineraryObjectReceived.shortDescription != null) {
                return false;
            }

        } else if (!shortDescription.equals(itineraryObjectReceived.shortDescription)) {
            return false;
        }

        if (title == null) {

            if (itineraryObjectReceived.title != null) {
                return false;
            }

        } else if (!title.equals(itineraryObjectReceived.title)) {
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
        return "Itinerary [id=" + id + ", title=" + title.getContentText() + ", description=" + description.getContentText() + ", shortDescription="
                + shortDescription.getContentText() + ", order=" + order + "]";
    }

}
