package com.homearound.www.homearound.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CUSTOMER_MESSAGE_BOX".
 */
public class CustomerMessageBox {

    private Long id;
    private String email;
    private String lastmessage;
    private String name;
    private String timelastmessage;

    public CustomerMessageBox() {
    }

    public CustomerMessageBox(Long id) {
        this.id = id;
    }

    public CustomerMessageBox(Long id, String email, String lastmessage, String name, String timelastmessage) {
        this.id = id;
        this.email = email;
        this.lastmessage = lastmessage;
        this.name = name;
        this.timelastmessage = timelastmessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimelastmessage() {
        return timelastmessage;
    }

    public void setTimelastmessage(String timelastmessage) {
        this.timelastmessage = timelastmessage;
    }

}
