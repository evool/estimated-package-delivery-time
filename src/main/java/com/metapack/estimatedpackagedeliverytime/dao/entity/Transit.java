package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRANSIT")
public class Transit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false, name = "DURATION")
    private Integer duration;

    @Column(nullable = false, name = "MONDAY")
    private Boolean monday;
    @Column(nullable = false, name = "TUESDAY")
    private Boolean tuesday;
    @Column(nullable = false, name = "WEDNESDAY")
    private Boolean wednesday;
    @Column(nullable = false, name = "THURSDAY")
    private Boolean thursday;
    @Column(nullable = false, name = "FRIDAY")
    private Boolean friday;
    @Column(nullable = false, name = "SATURDAY")
    private Boolean saturday;
    @Column(nullable = false, name = "SUNDAY")
    private Boolean sunday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }
}
