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
public class StarWarsCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal height;

    private BigDecimal mass;

    private String hairColor;

    private String skinColor;

    private String eyeColor;

    private String birthYear;

    private String gender;

    @ManyToOne
    @JoinColumn(name = "home_world_id", referencedColumnName = "id")
    private StarWarsHomeworld homeWorld;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "character_starship",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "starship_id")
    )
    private Set<StarWarsStarship> starships;


}
