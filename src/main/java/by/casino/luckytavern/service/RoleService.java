package by.casino.luckytavern.service;

import by.casino.luckytavern.entity.Role;
import by.casino.luckytavern.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER")
                .orElseThrow(() -> new IllegalArgumentException("Роль 'ROLE_USER' не найдена"));
    }
}