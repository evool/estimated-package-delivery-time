package com.metapack.estimatedpackagedeliverytime.models.deserialization;

import java.util.List;

public class Service {

    public String name;
    public List<TransitTime> transitTimes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransitTime> getTransitTimes() {
        return transitTimes;
    }

    public void setTransitTimes(List<TransitTime> transitTimes) {
        this.transitTimes = transitTimes;
    }

}
