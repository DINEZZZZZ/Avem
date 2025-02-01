package com.redweber.avem.particulars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitService {

    @Autowired
    private KitRepository kitRepository;

    // Method to add kit data
    public Kit addKitData(String serialNumber, KitData kitData) {
        Optional<Kit> existingKit = kitRepository.findById(serialNumber);
        if (existingKit.isPresent()) {
            Kit kit = existingKit.get();
            kit.getKitData().add(kitData);
            kitRepository.save(kit); // Save updated kit data
            return kit;
        } else {
            Kit newKit = new Kit();
            newKit.setSerialNumber(serialNumber);
            newKit.setStatus("active");
            newKit.setKitData(List.of(kitData)); // Initialize with one data entry
            kitRepository.save(newKit);
            return newKit;
        }
    }

    // Method to get a specific kit by serial number
    public Optional<Kit> getKitBySerialNumber(String serialNumber) {
        return kitRepository.findById(serialNumber);
    }

    // Method to get all kits with their data
    public List<Kit> getAllKits() {
        return kitRepository.findAll();
    }
}
