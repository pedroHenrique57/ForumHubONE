package edu.hiikkie.forumHubONE.domain.DTOs.resposta;

import edu.hiikkie.forumHubONE.application.entities.Resposta;
import edu.hiikkie.forumHubONE.application.entities.Topico;
import edu.hiikkie.forumHubONE.application.entities.Usuario;

import java.time.LocalDateTime;

public record RespostaDTO(
    Long id,
    String mensagem,
    Topico topico,
    LocalDateTime dataCriacao,
    Usuario autor,
    String solucao) {
  public RespostaDTO(Resposta resposta) {
    this(
        resposta.getId(),
        resposta.getMensagem(),
        resposta.getTopico(),
        resposta.getDataCriacao(),
        resposta.getAutor(),
        resposta.getSolucao());
  }
}
