package com.property_finder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property_finder.entity.PropertyDistrict;

@Repository
public interface PropertyDistrictRepo extends JpaRepository<PropertyDistrict, Long> {

}
