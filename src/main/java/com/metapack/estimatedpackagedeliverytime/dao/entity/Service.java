package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TransitTimes> transitTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransitTimes> getTransitTime() {
        return transitTimes;
    }

    public void setTransitTime(List<TransitTimes> transitTimes) {
        this.transitTimes = transitTimes;
    }
}
