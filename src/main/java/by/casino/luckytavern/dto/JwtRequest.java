package by.casino.luckytavern.dto;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
