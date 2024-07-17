package edu.hiikkie.forumHubONE.domain.DTOs.topico;

import edu.hiikkie.forumHubONE.application.entities.Topico;
import edu.hiikkie.forumHubONE.domain.DTOs.curso.CursoDTO;
import edu.hiikkie.forumHubONE.domain.DTOs.usuario.UsuarioDTO;

import java.time.LocalDateTime;

public record TopicoDTO(
        Long id,
        String titulo,
        String mensagem,
        UsuarioDTO usuario,
        LocalDateTime data,
        String status,
        CursoDTO curso
) {
    public TopicoDTO(Topico topico) {
        this(topico.getId(),
            topico.getTitulo(),
            topico.getMensagem(),
            new UsuarioDTO(topico.getUsuario()),
            topico.getDataCriacao(),
            topico.getStatus(),
            new CursoDTO(topico.getCurso()));
    }
}
