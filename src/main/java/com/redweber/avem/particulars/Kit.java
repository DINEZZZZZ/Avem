package com.redweber.avem.particulars;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "kits")
public class Kit {

    @Id
    private String serialNumber;  // Unique identifier for the kit
    private String status;        // Status of the kit (active, inactive)
    private List<KitData> kitData; // List of kit data entries

    // Getters and Setters
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<KitData> getKitData() {
        return kitData;
    }

    public void setKitData(List<KitData> kitData) {
        this.kitData = kitData;
    }
}
