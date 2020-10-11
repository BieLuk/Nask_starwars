package nask.starwars.repository;

import nask.starwars.model.StarWarsHomeworld;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworldRepository extends JpaRepository<StarWarsHomeworld, Long> {
}
