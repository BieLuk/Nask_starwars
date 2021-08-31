package nask.starwars.representation;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class StarWarsHomeworldRepresentation {

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
