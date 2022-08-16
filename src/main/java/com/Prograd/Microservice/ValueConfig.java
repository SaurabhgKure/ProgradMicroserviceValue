package com.Prograd.Microservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microserviceapp")
public class ValueConfig {
    public ValueConfig() {
    }

    private float min;
    private float max;

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public ValueConfig(float min, float max) {
        this.min= min;
        this.max = max;
    }
}
