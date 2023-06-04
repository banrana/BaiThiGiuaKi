package com.example.QL_NhanSu;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Pass {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPString ="Abc@123";
        String encodedPassword = encoder.encode(rawPString);

        System.out.println(encodedPassword);
    }
}

