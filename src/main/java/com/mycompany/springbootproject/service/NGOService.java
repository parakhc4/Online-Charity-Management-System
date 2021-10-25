package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.model.NGO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NGOService {

    public List<NGO> getAll();

    public NGO addNGO(NGO airport);

    public NGO fetchById(int id);

    public void deleteNGO(int id);
}
