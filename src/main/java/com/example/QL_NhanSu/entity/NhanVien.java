package com.example.QL_NhanSu.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "nhanvien")
public class NhanVien {


    @Id
    @Column(name = "ma_nv")
    private String ma_nv;

    @Column(name = "ten_nv")
    private String ten_nv;

    @Column(name = "gioi_tinh")
    private String gioi_tinh;
    @Column(name = "noi_sinh")
    private String noi_sinh;

    @ManyToOne
    @JoinColumn(name = "ma_phong", referencedColumnName = "ma_phong")
    private PhongBan phong_ban;

    @Column(name = "luong")
    private int luong;
}
