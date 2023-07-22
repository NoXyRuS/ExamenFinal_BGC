package com.example.examenfinal_bgc.applications;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2LoginSuccessController {

    @GetMapping("/login/oauth2/code/facebook")
    public String loginSuccess(@AuthenticationPrincipal OAuth2User oauth2User) {
        // Procesar la información del usuario de Facebook y autenticar al usuario en tu aplicación
        return "Redirección a página de inicio o panel de usuario";
    }
}
