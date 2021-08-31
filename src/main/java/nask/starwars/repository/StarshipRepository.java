package nask.starwars.repository;

import nask.starwars.model.StarWarsStarship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarshipRepository extends JpaRepository<StarWarsStarship, Long> {
}
