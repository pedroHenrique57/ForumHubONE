package edu.hiikkie.forumHubONE.infrastructure.DB.repositories;

import edu.hiikkie.forumHubONE.application.entities.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta,Long> {
}
