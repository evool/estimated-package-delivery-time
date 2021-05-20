package com.metapack.estimatedpackagedeliverytime.models.deserialization;

import java.util.List;

public class Root {

    public String code;
    public List<Service> services;
    public DeliveryWindow deliveryWindow;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    public void setDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }
}
