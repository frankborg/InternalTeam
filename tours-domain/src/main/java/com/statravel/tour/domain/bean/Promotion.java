package com.statravel.tour.domain.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Promotion bean.
 * 
 * @author STA Travel Development team
 * 
 */
public class Promotion implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1345835981990357520L;
    private static final int HASH_PRIME_NUMBER = 31;

    private Integer id;
    private Date startDate;
    private Date endDate;
    private Double price;
    private Double discountPrice;
    private Double discountPercentage;
    private Double discountAmount;
    private Double deposit;
    private String promotionCode;
    private String currencyCode;
    private PromotionType promotionType;
    private Currency currency;

    /**
     * 
     */
    public Promotion() {
        super();
    }

    /**
     * @param startDate
     *            promotion start date
     * @param endDate
     *            promotion end date
     * @param price
     *            normal price
     * @param discountPrice
     *            price after the discount
     * @param discountPercentage
     *            discount percentage
     * @param discountAmount
     *            discount amount
     */
    public Promotion(final Date startDate, final Date endDate, final Double price, final Double discountPrice, final Double discountPercentage,
            final Double discountAmount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.discountPrice = discountPrice;
        this.discountPercentage = discountPercentage;
        this.discountAmount = discountAmount;
    }

    /**
     * @return the promotion id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the promotion id to set
     */
    public final void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return the promotion start date
     */
    public final Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *            the promotion start date to set
     */
    public final void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the promotion end date
     */
    public final Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     *            the promotion end date to set
     */
    public final void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the promotion price
     */
    public final Double getPrice() {
        return price;
    }

    /**
     * @param price
     *            the promotion price to set
     */
    public final void setPrice(final Double price) {
        this.price = price;
    }

    /**
     * @return the promotion discount price
     */
    public final Double getDiscountPrice() {
        return discountPrice;
    }

    /**
     * @param discountPrice
     *            the promotion discount price to set
     */
    public final void setDiscountPrice(final Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * @return the promotion discount percentage
     */
    public final Double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * @param discountPercentage
     *            the promotion discount percentage to set
     */
    public final void setDiscountPercentage(final Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /**
     * @return the promotion discount amount
     */
    public final Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * @param discountAmount
     *            the promotion discount amount to set
     */
    public final void setDiscountAmount(final Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * @return the promotion deposit required
     */
    public final Double getDeposit() {
        return deposit;
    }

    /**
     * @param deposit
     *            the promotion deposit required to set
     */
    public final void setDeposit(final Double deposit) {
        this.deposit = deposit;
    }

    /**
     * @return the promotion code
     */
    public final String getPromotionCode() {
        return promotionCode;
    }

    /**
     * @param promotionCode
     *            the promotion code to set
     */
    public final void setPromotionCode(final String promotionCode) {
        this.promotionCode = promotionCode;
    }

    /**
     * @return the currency code
     */
    public final String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode
     *            the currency code to set
     */
    public final void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the promotion type
     */
    public final PromotionType getPromotionType() {
        return promotionType;
    }

    /**
     * @param promotionType
     *            the promotion type to set
     */
    public final void setPromotionType(final PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * @return the currency
     */
    public final Currency getCurrency() {
        return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public final void setCurrency(final Currency currency) {
        this.currency = currency;
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

        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((promotionCode == null) ? 0 : promotionCode.hashCode());
        result = prime * result + ((promotionType == null) ? 0 : promotionType.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());

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

        Promotion other = (Promotion) obj;

        if (endDate == null) {

            if (other.endDate != null) {
                return false;
            }

        } else if (!endDate.equals(other.endDate)) {
            return false;
        }

        if (id == null) {

            if (other.id != null) {
                return false;
            }

        } else if (!id.equals(other.id)) {
            return false;
        }

        if (promotionCode == null) {

            if (other.promotionCode != null) {
                return false;
            }

        } else if (!promotionCode.equals(other.promotionCode)) {
            return false;
        }

        if (promotionType == null) {

            if (other.promotionType != null) {
                return false;
            }

        } else if (!promotionType.equals(other.promotionType)) {
            return false;
        }

        if (startDate == null) {

            if (other.startDate != null) {
                return false;
            }

        } else if (!startDate.equals(other.startDate)) {
            return false;
        }

        if (currencyCode == null) {

            if (other.currencyCode != null) {
                return false;
            }

        } else if (!currencyCode.equals(other.currencyCode)) {
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
        return "Promotion [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", price=" + price + ", discountPrice=" + discountPrice
                + ", discountPercentage=" + discountPercentage + ", discountAmount=" + discountAmount + ", deposit=" + deposit + ", promotionCode="
                + promotionCode + ", currencyCode=" + currencyCode + ", promotionType=" + promotionType + "]";
    }

}
