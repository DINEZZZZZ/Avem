package com.redweber.avem.particulars;

import java.util.List;

public class KitData {

    private long timestamp;
    private String location;
    private String temperature;
    private String gasLeakageStatus;
    private String crashStatus;
    private List<String> cameraFootage;

    // Constructor
    public KitData(long timestamp, String location, String temperature, String gasLeakageStatus,
                   String crashStatus, List<String> cameraFootage) {
        this.timestamp = timestamp;
        this.location = location;
        this.temperature = temperature;
        this.gasLeakageStatus = gasLeakageStatus;
        this.crashStatus = crashStatus;
        this.cameraFootage = cameraFootage;
    }

    // Getters and Setters
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getGasLeakageStatus() {
        return gasLeakageStatus;
    }

    public void setGasLeakageStatus(String gasLeakageStatus) {
        this.gasLeakageStatus = gasLeakageStatus;
    }

    public String getCrashStatus() {
        return crashStatus;
    }

    public void setCrashStatus(String crashStatus) {
        this.crashStatus = crashStatus;
    }

    public List<String> getCameraFootage() {
        return cameraFootage;
    }

    public void setCameraFootage(List<String> cameraFootage) {
        this.cameraFootage = cameraFootage;
    }
}
