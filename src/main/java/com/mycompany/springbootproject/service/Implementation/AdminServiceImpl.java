package com.mycompany.springbootproject.service.Implementation;

import com.mycompany.springbootproject.model.Admin;
import com.mycompany.springbootproject.repository.AdminRepository;
import com.mycompany.springbootproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin addAdmin(Admin admin) {
        adminRepository.save(admin);
        return admin;
    }

    @Override
    public Admin fetchById(int id) {
        Admin admin = null;
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        if (optionalAdmin.isPresent())
        {
            admin = optionalAdmin.get();
        }
        return admin;
    }


    @Override
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}
