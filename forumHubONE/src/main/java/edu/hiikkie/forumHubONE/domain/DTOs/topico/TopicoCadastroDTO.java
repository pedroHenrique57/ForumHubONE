package edu.hiikkie.forumHubONE.domain.DTOs.topico;

import edu.hiikkie.forumHubONE.domain.DTOs.curso.CursoDTO;
import edu.hiikkie.forumHubONE.domain.DTOs.usuario.UsuarioDTO;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TopicoCadastroDTO(
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotNull
        UsuarioDTO autor,

        @NotNull
        @Future
        LocalDateTime data,

        @NotBlank
        String status,

        @NotNull
        CursoDTO curso
) {
}
