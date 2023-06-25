package com.gachon.healthdiary.service;

import com.gachon.healthdiary.data.dto.DietDTO;
import com.gachon.healthdiary.data.entity.Diet;
import com.gachon.healthdiary.data.repository.DietRepository;
import com.gachon.healthdiary.exception.NotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DietService {
    private final DietRepository dietRepository;

    @Autowired
    public DietService(DietRepository dietRepository) {
        this.dietRepository = dietRepository;
    }

    public DietDTO createDiet(DietDTO dietDTO) {
        Diet diet = new Diet();
        BeanUtils.copyProperties(dietDTO, diet);
        Diet savedDiet = dietRepository.save(diet);
        DietDTO savedDietDTO = new DietDTO();
        BeanUtils.copyProperties(savedDiet, savedDietDTO);
        return savedDietDTO;
    }

    public DietDTO getDiet(Long id) {
        Diet diet = dietRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Diet not found with id: " + id));
        DietDTO dietDTO = new DietDTO();
        BeanUtils.copyProperties(diet, dietDTO);
        return dietDTO;
    }

    public void updateDiet(Long id, DietDTO dietDTO) {
        Diet diet = dietRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Diet not found with id: " + id));
        BeanUtils.copyProperties(dietDTO, diet, "id");
        dietRepository.save(diet);
    }

    public void deleteDiet(Long id) {
        dietRepository.deleteById(id);
    }
}
