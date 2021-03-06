package com.homearound.www.homearound.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CUSTOMER_SERVICE".
 */
public class CustomerService {

    private Long id;
    private String category;
    private String detail;
    private String distance;
    private String email;
    private String name;

    public CustomerService() {
    }

    public CustomerService(Long id) {
        this.id = id;
    }

    public CustomerService(Long id, String category, String detail, String distance, String email, String name) {
        this.id = id;
        this.category = category;
        this.detail = detail;
        this.distance = distance;
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
