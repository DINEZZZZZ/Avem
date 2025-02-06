package com.redweber.avem.particulars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/kits")
public class KitController {

    @Autowired
    private KitService kitService;

    @PostMapping("/{serialNumber}/data")
    public ResponseEntity<Kit> addKitData(@PathVariable String serialNumber, @RequestBody KitData kitData) {
        Kit updatedKit = kitService.addKitData(serialNumber, kitData);
        if (updatedKit != null) {
            return ResponseEntity.ok(updatedKit);
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }
    @GetMapping("/{serialNumber}")
    public ResponseEntity<Kit> getKitBySerialNumber(@PathVariable String serialNumber) {
        Optional<Kit> kit = kitService.getKitBySerialNumber(serialNumber);
        if (kit.isPresent()) {
            return ResponseEntity.ok(kit.get());
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Kit>> getAllKits() {
        List<Kit> allKits = kitService.getAllKits();
        if (allKits.isEmpty()) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok(allKits);
    }
}