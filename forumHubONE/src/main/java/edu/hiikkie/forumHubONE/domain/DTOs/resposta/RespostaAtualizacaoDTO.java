package edu.hiikkie.forumHubONE.domain.DTOs.resposta;

import edu.hiikkie.forumHubONE.application.entities.Topico;
import edu.hiikkie.forumHubONE.application.entities.Usuario;

import java.time.LocalDateTime;

public record RespostaAtualizacaoDTO(
    Long id,
    String mensagem,
    Topico topico,
    LocalDateTime dataCriacao,
    Usuario autor,
    String solucao
) {
}
