package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "transit_times")
public class TransitTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="countryFrom")
    private String from;

    @Column(name="countryTo")
    private String to;

    @OneToOne(cascade = CascadeType.ALL)
    private DaysAndDuration dispatch;

    @OneToOne(cascade = CascadeType.ALL)
    private DaysAndDuration transit;

    @OneToOne(cascade = CascadeType.ALL)
    private DaysAndDuration delivery;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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
