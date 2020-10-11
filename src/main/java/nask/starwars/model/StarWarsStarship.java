package nask.starwars.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StarWarsStarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
}
