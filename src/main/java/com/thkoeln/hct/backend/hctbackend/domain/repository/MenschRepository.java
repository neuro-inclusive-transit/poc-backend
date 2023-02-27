package com.thkoeln.hct.backend.hctbackend.domain.repository;

import com.thkoeln.hct.backend.hctbackend.entity.Mensch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenschRepository extends JpaRepository<Mensch, Integer> {

}