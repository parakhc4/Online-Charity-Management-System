package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.model.Donor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DonorService {

    public List<Donor> getAll();

    public Donor addDonor(Donor airport);

    public Donor fetchById(int id);

    public void deleteDonor(int id);
}
