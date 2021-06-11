package com.metapack.estimatedpackagedeliverytime.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "transitTimes")
@Getter
@Setter
public class TransitTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false, name="COUNTRY_FROM")
    private String from;

    @Column(nullable = false, name="COUNTRY_TO")
    private String to;

    @OneToOne(cascade = CascadeType.ALL)
    private Dispatch dispatch;

    @OneToOne(cascade = CascadeType.ALL)
    private Transit transit;

    @OneToOne(cascade = CascadeType.ALL)
    private Delivery delivery;

}
