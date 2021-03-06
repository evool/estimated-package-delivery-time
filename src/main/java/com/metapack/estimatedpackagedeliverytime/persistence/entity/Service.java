package com.metapack.estimatedpackagedeliverytime.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "services")
@Getter
@Setter
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false, name = "NAME")
    private String name;

    @Column(nullable = false, name = "TRANSIT_TIMES")
    @OneToMany(cascade = CascadeType.ALL)
    private List<TransitTime> transitTimes;

}
