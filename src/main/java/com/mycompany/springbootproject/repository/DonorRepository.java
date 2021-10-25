package com.mycompany.springbootproject.repository;

import com.mycompany.springbootproject.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {

}
