package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "transit_times")
public class TransitTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String countryFrom;

    private String countryTo;

    @OneToOne
    private DaysAndDuration dispatch;

    @OneToOne
    private DaysAndDuration transit;

    @OneToOne
    private DaysAndDuration delivery;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(String from) {
        this.countryFrom = from;
    }

    public String getCountryTo() {
        return countryTo;
    }

    public void setCountryTo(String to) {
        this.countryTo = to;
    }

    public DaysAndDuration getDispatch() {
        return dispatch;
    }

    public void setDispatch(DaysAndDuration dispatch) {
        this.dispatch = dispatch;
    }

    public DaysAndDuration getTransit() {
        return transit;
    }

    public void setTransit(DaysAndDuration transit) {
        this.transit = transit;
    }

    public DaysAndDuration getDelivery() {
        return delivery;
    }

    public void setDelivery(DaysAndDuration delivery) {
        this.delivery = delivery;
    }
}
