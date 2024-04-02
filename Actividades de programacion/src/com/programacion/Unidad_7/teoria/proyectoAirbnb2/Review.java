package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

public class Review {

    private int number_reviews;
    private String last_review;
    private double reviews_per_month;

    public Review(int number_reviews, String last_review, double reviews_per_month) {
       setNumber_reviews(number_reviews);
       setLast_review(last_review);
       setReviews_per_month(reviews_per_month);
    }

    public int getNumber_reviews() {
        return number_reviews;
    }

    public void setNumber_reviews(int number_reviews) {
        this.number_reviews = number_reviews;
    }

    public String getLast_review() {
        return last_review;
    }

    public void setLast_review(String last_review) {
        this.last_review = last_review;
    }

    public double getReviews_per_month() {
        return reviews_per_month;
    }

    public void setReviews_per_month(double reviews_per_month) {
        this.reviews_per_month = reviews_per_month;
    }
}
