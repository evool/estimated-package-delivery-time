package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "delivery_windows")
public class DeliveryWindow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TIME_FROM")
    private LocalTime from;

    @Column(name = "TIME_TO")
    private LocalTime to;

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
}
