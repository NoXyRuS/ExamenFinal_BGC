package com.example.examenfinal_bgc.infrastructure;
import com.example.examenfinal_bgc.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        // Lógica para validar y guardar el usuario en la base de datos
        // Implementar validaciones, encriptar contraseña, etc.
        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerUsuarioPorCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo);
    }
    // Otros métodos y lógica de negocio relacionados con usuarios
}
