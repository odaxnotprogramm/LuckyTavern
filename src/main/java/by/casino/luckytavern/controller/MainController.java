package by.casino.luckytavern.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/unsecured")
    public String unsecured() {
        return "unsecured";
    }

    @GetMapping("/secured")
    public String securedData(Principal principal) {
        if(principal != null) {
            return principal.getName();
        }
        return null;
    }

    @GetMapping("/admin")
    public String adminData() {
        return "Admin data";
    }
}