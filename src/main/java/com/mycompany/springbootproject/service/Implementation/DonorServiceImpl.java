package com.mycompany.springbootproject.service.Implementation;

import com.mycompany.springbootproject.model.Donor;
import com.mycompany.springbootproject.repository.DonorRepository;
import com.mycompany.springbootproject.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorRepository donorRepository;

    @Override
    public List<Donor> getAll() {
        return donorRepository.findAll();
    }


    @Override
    public Donor addDonor(Donor donor) {
        donorRepository.save(donor);
        return donor;
    }

    @Override
    public Donor fetchById(int id) {
        Donor donor = null;
        Optional<Donor> optionalDonor = donorRepository.findById(id);
        if (optionalDonor.isPresent())
        {
            donor = optionalDonor.get();
        }
        return donor;
    }

    @Override
    public void deleteDonor(int id) {
        donorRepository.deleteById(id);
    }
}
