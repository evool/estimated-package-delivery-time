package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "transitTimes")
public class TransitTimes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="COUNTRY_FROM")
    private String from;

    @Column(name="COUNTRY_TO")
    private String to;

    @OneToOne(cascade = CascadeType.ALL)
    private Dispatch dispatch;

    @OneToOne(cascade = CascadeType.ALL)
    private Transit transit;

    @OneToOne(cascade = CascadeType.ALL)
    private Delivery delivery;

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

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Transit getTransit() {
        return transit;
    }

    public void setTransit(Transit transit) {
        this.transit = transit;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
