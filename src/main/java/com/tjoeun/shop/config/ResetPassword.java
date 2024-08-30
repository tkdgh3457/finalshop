package com.tjoeun.shop.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ResetPassword {
	
	
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String newPassword = "123123";  // 새 비밀번호를 여기에 입력
        String hashedPassword = encoder.encode(newPassword);
        System.out.println("Hashed Password: " + hashedPassword);
     
        // 데이터 베이스에서
        // UPDATE member SET password = '여기에_새로운_해시_비밀번호_입력' WHERE email = 'user@example.com';
        // 해시에 특수문자 있어서 오류날때는 아래처럼 오류가났다 안났다함.
        // UPDATE `member` SET `password` = '$2a$10$LYDKhtcH8YSyMWTPGHjE6.Kj.x.Q/vawgV5zSeYiU3iKPT4S4Uidq' WHERE `email` = 'asd@asd';

    }
}

