package com.yena.yenaoptic.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Role")
public class RoleWs {
    @Autowired
    private RoleServiceImpl roleService;
    @GetMapping("/authority/{authority}")
    public Role findByAuthority(@PathVariable String authority) {
        return roleService.findByAuthority(authority);
    }

    @PostMapping("/")
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }
}
