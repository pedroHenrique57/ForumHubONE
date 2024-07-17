package edu.hiikkie.forumHubONE.infrastructure.DB.repositories;

import edu.hiikkie.forumHubONE.application.entities.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico,Long> {
}
