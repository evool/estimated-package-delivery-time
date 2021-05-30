package com.metapack.estimatedpackagedeliverytime.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "delivery_windows")
@Getter
@Setter
public class DeliveryWindow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TIME_FROM")
    private LocalTime from;

    @Column(name = "TIME_TO")
    private LocalTime to;

}
