package com.example.QL_NhanSu.services;

import com.example.QL_NhanSu.entity.PhongBan;
import com.example.QL_NhanSu.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongBanService {

    @Autowired
    private PhongBanRepository repo;

    public List<PhongBan> listAll() {
        return repo.findAll();
    }

    public void save(PhongBan product) {
        repo.save(product);
    }

    public PhongBan get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
