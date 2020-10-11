package nask.starwars.repository;

import nask.starwars.model.StarWarsCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<StarWarsCharacter, Long> {
}
