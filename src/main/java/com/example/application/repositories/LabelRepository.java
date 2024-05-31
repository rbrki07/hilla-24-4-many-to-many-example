package com.example.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.application.entities.Label;

public interface LabelRepository extends JpaRepository<Label, Long>, JpaSpecificationExecutor<Label> {
    
}
