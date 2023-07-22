package com.example.examenfinal_bgc.applications;


import com.example.examenfinal_bgc.domain.Usuario;
import com.example.examenfinal_bgc.infrastructure.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public ResponseEntity<String> registrarUsuario(@RequestBody Usuario usuario) {
        Usuario existente = usuarioService.obtenerUsuarioPorCorreo(usuario.getCorreo());
        if (existente != null) {
            return new ResponseEntity<>("El correo ya está registrado", HttpStatus.BAD_REQUEST);
        }

        // Validar otros campos como DNI, RUC, etc. si es necesario

        usuarioService.registrarUsuario(usuario);
        return new ResponseEntity<>("Usuario registrado exitosamente", HttpStatus.CREATED);
    }

    @GetMapping("/login/facebook")
    public String loginWithFacebook() {
        // Redirigir al inicio de sesión de Facebook usando OAuth2
        return "redirect:/oauth2/authorization/facebook";
    }
}


