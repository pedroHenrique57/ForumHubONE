package edu.hiikkie.forumHubONE.domain.DTOs.curso;


import edu.hiikkie.forumHubONE.application.entities.Curso;

public record CursoDTO(
        String nome,
        Long id,
        String categoria
) {
    public CursoDTO(Curso curso) {
        this(curso.getNome(),
            curso.getId(),
            curso.getCategoria());
    }
}
