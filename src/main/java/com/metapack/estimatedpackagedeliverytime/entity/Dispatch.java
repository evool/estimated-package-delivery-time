package com.metapack.estimatedpackagedeliverytime.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DISPATCH")
@Getter
@Setter
public class Dispatch {

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

}
