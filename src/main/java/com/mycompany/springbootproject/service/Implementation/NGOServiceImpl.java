package com.mycompany.springbootproject.service.Implementation;

import com.mycompany.springbootproject.model.NGO;
import com.mycompany.springbootproject.repository.NGORepository;
import com.mycompany.springbootproject.service.NGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NGOServiceImpl implements NGOService {

    @Autowired
    private NGORepository ngoRepository;

    @Override
    public List<NGO> getAll() {
        return ngoRepository.findAll();
    }

    @Override
    public NGO addNGO(NGO ngo) {
        ngoRepository.save(ngo);
        return ngo;
    }

    @Override
    public NGO fetchById(int id) {
        NGO ngo = null;
        Optional<NGO> optionalNGO = ngoRepository.findById(id);
        if (optionalNGO.isPresent())
        {
            ngo = optionalNGO.get();
        }
        return ngo;
    }


    @Override
    public void deleteNGO(int id) {
        ngoRepository.deleteById(id);
    }
}
