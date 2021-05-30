package com.metapack.estimatedpackagedeliverytime.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "transitTimes")
@Getter
@Setter
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

}
