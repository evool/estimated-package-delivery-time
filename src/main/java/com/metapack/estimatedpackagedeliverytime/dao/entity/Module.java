package com.metapack.estimatedpackagedeliverytime.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "modules")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @OneToMany
    private List<Service> service;

    @OneToOne
    private DeliveryWindow deliveryWindow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }

    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    public void setDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }
}
