package com.gachon.healthdiary.controller;

import com.gachon.healthdiary.data.dto.DietDTO;
import com.gachon.healthdiary.service.DietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diet")
public class DietController {
    private final DietService dietService;

    @Autowired
    public DietController(DietService dietService) {
        this.dietService = dietService;
    }

    @PostMapping
    public ResponseEntity<DietDTO> createDiet(@RequestBody DietDTO dietDTO) {
        DietDTO savedDiet = dietService.createDiet(dietDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDiet);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DietDTO> getDiet(@PathVariable Long id) {
        DietDTO dietDTO = dietService.getDiet(id);
        return ResponseEntity.ok(dietDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDiet(@PathVariable Long id, @RequestBody DietDTO dietDTO) {
        dietService.updateDiet(id, dietDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiet(@PathVariable Long id) {
        dietService.deleteDiet(id);
        return ResponseEntity.noContent().build();
    }
}
