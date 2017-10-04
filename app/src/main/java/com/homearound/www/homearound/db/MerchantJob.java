package com.homearound.www.homearound.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "MERCHANT_JOB".
 */
public class MerchantJob {

    private Long id;
    private String distance;
    private String email;
    private String jobdetail;
    private String jobstatus;
    private String jobtitle;
    private String name;
    private String timefinish;
    private String timepost;

    public MerchantJob() {
    }

    public MerchantJob(Long id) {
        this.id = id;
    }

    public MerchantJob(Long id, String distance, String email, String jobdetail, String jobstatus, String jobtitle, String name, String timefinish, String timepost) {
        this.id = id;
        this.distance = distance;
        this.email = email;
        this.jobdetail = jobdetail;
        this.jobstatus = jobstatus;
        this.jobtitle = jobtitle;
        this.name = name;
        this.timefinish = timefinish;
        this.timepost = timepost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getJobdetail() {
        return jobdetail;
    }

    public void setJobdetail(String jobdetail) {
        this.jobdetail = jobdetail;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimefinish() {
        return timefinish;
    }

    public void setTimefinish(String timefinish) {
        this.timefinish = timefinish;
    }

    public String getTimepost() {
        return timepost;
    }

    public void setTimepost(String timepost) {
        this.timepost = timepost;
    }

}
