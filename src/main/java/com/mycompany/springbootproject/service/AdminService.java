package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    public List<Admin> getAll();

    public Admin addAdmin(Admin airport);

    public Admin fetchById(int id);

    public void deleteAdmin(int id);
}
