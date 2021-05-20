package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<TransitTime> transitTime;

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

    public List<TransitTime> getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(List<TransitTime> transitTime) {
        this.transitTime = transitTime;
    }
}
