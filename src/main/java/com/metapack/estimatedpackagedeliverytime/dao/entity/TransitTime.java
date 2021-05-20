package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "transit_times")
public class TransitTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime from;

    private LocalTime to;

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

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getTo() {
        return to;
    }

    public void setTo(LocalTime to) {
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
