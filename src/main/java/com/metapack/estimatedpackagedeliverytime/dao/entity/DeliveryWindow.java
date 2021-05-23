package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "delivery_windows")
public class DeliveryWindow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime timeFrom;

    private LocalTime timeTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalTime from) {
        this.timeFrom = from;
    }

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalTime to) {
        this.timeTo = to;
    }
}
