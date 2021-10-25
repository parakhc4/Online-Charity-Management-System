package com.mycompany.springbootproject.repository;

import com.mycompany.springbootproject.model.NGO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NGORepository extends JpaRepository<NGO, Integer> {

}
