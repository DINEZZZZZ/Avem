package com.redweber.avem.particulars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitService {

    @Autowired
    private KitRepository kitRepository;


    public Kit addKitData(String serialNumber, KitData kitData) {
        Optional<Kit> existingKit = kitRepository.findById(serialNumber);
        if (existingKit.isPresent()) {
            Kit kit = existingKit.get();
            kit.getKitData().add(kitData);
            kitRepository.save(kit);
            return kit;
        } else {
            Kit newKit = new Kit();
            newKit.setSerialNumber(serialNumber);
            newKit.setStatus("active");
            newKit.setKitData(List.of(kitData));
            kitRepository.save(newKit);
            return newKit;
        }
    }
    public Optional<Kit> getKitBySerialNumber(String serialNumber) {
        return kitRepository.findById(serialNumber);
    }
    public List<Kit> getAllKits() {
        return kitRepository.findAll();
    }
}