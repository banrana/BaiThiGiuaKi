package com.example.QL_NhanSu.repository;

import com.example.QL_NhanSu.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
