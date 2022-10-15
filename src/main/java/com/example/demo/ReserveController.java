package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReserveController {

    @GetMapping("/api/concerts")
    public List<String> getPosts() {
        return List.of(
                "아이유",
                "싸이",
                "뉴진스"
        );
    }

    @GetMapping("/api/concerts/{concertId}")
    public String getPosts(@PathVariable Long concertId) {
        String info = "";
        if (concertId == 1) {
            info += "아이유 콘서트입니다.";
        } else if (concertId == 2) {
            info += "싸이 콘서트입니다.";
        } else {
            info += "뉴진스 콘서트 입니다.";
        }
        return info;
    }
}
