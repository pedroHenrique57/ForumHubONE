package edu.hiikkie.forumHubONE.domain.DTOs.curso;

import jakarta.validation.constraints.NotBlank;

public record CursoCadastroDTO(
        @NotBlank
        String nome,
        String categoria
) {
}
