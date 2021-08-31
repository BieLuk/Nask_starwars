package nask.starwars.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StarWarsHomeworld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal rotationPeriod;

    private BigDecimal orbitalPeriod;

    private BigDecimal diameter;

    private String climate;

    private String gravity;

    private String terrain;

    private String surfaceWater;

    private Long population;
}
