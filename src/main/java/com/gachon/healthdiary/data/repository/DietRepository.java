package com.gachon.healthdiary.data.repository;

import com.gachon.healthdiary.data.entity.Diet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietRepository extends JpaRepository<Diet, Long> {

}