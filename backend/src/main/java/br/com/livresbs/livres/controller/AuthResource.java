package br.com.livresbs.livres.controller;

import br.com.livresbs.livres.service.impl.UserDetailsImpl;
import br.com.livresbs.livres.service.impl.UsuarioImpl;
import br.com.livresbs.livres.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthResource {
    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping(value = "/refresh_token")
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        UserDetailsImpl user = UsuarioImpl.authenticated();
        if (user != null) {
            String token = jwtUtil.generateToken(user.getUsername());
            response.addHeader("Authorization", "Bearer " + token);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}