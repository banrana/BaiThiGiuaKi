package com.example.QL_NhanSu.services;

import com.example.QL_NhanSu.entity.NhanVien;
import com.example.QL_NhanSu.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository repo;

    public List<NhanVien> listAll() {
        return repo.findAll();
    }

    public void save(NhanVien product) {
        repo.save(product);
    }

    public NhanVien get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}