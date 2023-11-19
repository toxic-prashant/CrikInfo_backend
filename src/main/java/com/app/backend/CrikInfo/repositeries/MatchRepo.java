package com.app.backend.CrikInfo.repositeries;

import com.app.backend.CrikInfo.models.Match;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepo extends JpaRepository<Match, Integer> {
  Optional<Match> findByTeamHeading(String teamHeading);

}
