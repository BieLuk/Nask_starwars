package nask.starwars.representation;

import lombok.Data;
import nask.starwars.model.StarWarsCharacter;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class StarWarsStarshipRepresentation {

    private String name;

    private String model;

    private String manufacturer;

    private BigDecimal costInCredits;

    private BigDecimal length;

    private BigDecimal maxAtmosphericSpeed;

    private Integer crew;

    private Integer passengers;

    private Long cargoCapacity;

    private String consumables;

    private BigDecimal hyperdriveRating;

    private Integer mglt;

    private String starshipClass;

//    private Set<StarWarsCharacter> owners;
}
