package com.example.examenfinal_bgc.infrastructure;
import com.example.examenfinal_bgc.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreo(String correo);
    // Otros métodos de consulta si es necesario
}