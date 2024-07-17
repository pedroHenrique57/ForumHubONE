package edu.hiikkie.forumHubONE.domain.DTOs.usuario;

import edu.hiikkie.forumHubONE.application.entities.Usuario;

public record UsuarioDTO(
        Long id,
        String email
) {
    public UsuarioDTO(Usuario autor) {
        this(autor.getId(),autor.getEmail());
    }
}
