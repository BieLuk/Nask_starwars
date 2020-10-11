package nask.starwars.representation;

import lombok.Data;
import nask.starwars.model.StarWarsHomeworld;
import nask.starwars.model.StarWarsStarship;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
public class StarWarsCharacterRepresentation {

    private Long id;

    private String name;

    private BigDecimal height;

    private BigDecimal mass;

    private String hairColor;

    private String skinColor;

    private String eyeColor;

    private String birthYear;

    private String gender;

    private StarWarsHomeworldRepresentation homeWorld;

    private Set<StarWarsStarshipRepresentation> starships;
}
