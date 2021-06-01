package com.metapack.estimatedpackagedeliverytime.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "modules")
@Getter
@Setter
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false, name = "PROVIDER_CODE")
    private String code;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(nullable = false, name = "SERVICES")
    private List<Service> services;

    @OneToOne
    private DeliveryWindow deliveryWindow;

}
