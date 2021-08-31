package nask.starwars.initialization;

import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.val;
import nask.starwars.model.StarWarsCharacter;
import nask.starwars.model.StarWarsHomeworld;
import nask.starwars.model.StarWarsStarship;
import nask.starwars.repository.CharacterRepository;
import nask.starwars.repository.HomeworldRepository;
import nask.starwars.repository.StarshipRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class DataInitializer implements ApplicationRunner {

    private final CharacterRepository characterRepository;
    private final HomeworldRepository homeworldRepository;
    private final StarshipRepository starshipRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        createTestCharacters();
    }

    private void createTestCharacters() {
        Map<String, StarWarsHomeworld> homeworldMap = createHomeWorlds();
        Map<String, StarWarsStarship> starshipMap = createStarships();

        StarWarsCharacter char1 = StarWarsCharacter.builder()
                .name("Luke Skywalker")
                .height(new BigDecimal(172))
                .mass(new BigDecimal(77))
                .hairColor("blond")
                .skinColor("fair")
                .eyeColor("blue")
                .birthYear("19BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Tatooine"))
                .starships(Sets.newHashSet(starshipMap.get("X-wing"),
                        starshipMap.get("Imperial shuttle")))
                .build();

        StarWarsCharacter char2 = StarWarsCharacter.builder()
                .name("C-3PO")
                .height(new BigDecimal(167))
                .mass(new BigDecimal(75))
                .skinColor("gold")
                .eyeColor("yellow")
                .birthYear("112BBY")
                .homeWorld(homeworldMap.get("Tatooine"))
                .build();

        StarWarsCharacter char3 = StarWarsCharacter.builder()
                .name("R2D2")
                .height(new BigDecimal(96))
                .mass(new BigDecimal(32))
                .skinColor("white, blue")
                .eyeColor("red")
                .birthYear("33BBY")
                .homeWorld(homeworldMap.get("Naboo"))
                .build();

        StarWarsCharacter char4 = StarWarsCharacter.builder()
                .name("Darth Vader")
                .height(new BigDecimal(202))
                .mass(new BigDecimal(136))
                .hairColor("none")
                .skinColor("white")
                .eyeColor("yellow")
                .birthYear("41.9BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Tatooine"))
                .starships(Sets.newHashSet(starshipMap.get("TIE Advanced x1")))
                .build();


        StarWarsCharacter char5 = StarWarsCharacter.builder()
                .name("Leia Organa")
                .height(new BigDecimal(150))
                .mass(new BigDecimal(49))
                .hairColor("brown")
                .skinColor("light")
                .eyeColor("brown")
                .birthYear("19BBY")
                .gender("female")
                .homeWorld(homeworldMap.get("Alderaan"))
                .build();

        StarWarsCharacter char6 = StarWarsCharacter.builder()
                .name("Owen Lars")
                .height(new BigDecimal(178))
                .mass(new BigDecimal(120))
                .hairColor("brown, grey")
                .skinColor("light")
                .eyeColor("blue")
                .birthYear("52BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Tatooine"))
                .build();

        StarWarsCharacter char7 = StarWarsCharacter.builder()
                .name("Beru Whitesun Lars")
                .height(new BigDecimal(165))
                .mass(new BigDecimal(75))
                .hairColor("brown")
                .skinColor("light")
                .eyeColor("blue")
                .birthYear("47BBY")
                .gender("female")
                .homeWorld(homeworldMap.get("Tatooine"))
                .build();

        StarWarsCharacter char8 = StarWarsCharacter.builder()
                .name("R5-D4")
                .height(new BigDecimal(97))
                .mass(new BigDecimal(32))
                .skinColor("white, red")
                .eyeColor("red")
                .homeWorld(homeworldMap.get("Tatooine"))
                .build();

        StarWarsCharacter char9 = StarWarsCharacter.builder()
                .name("Biggs Darklighter")
                .height(new BigDecimal(183))
                .mass(new BigDecimal(84))
                .hairColor("black")
                .skinColor("light")
                .eyeColor("brown")
                .birthYear("24BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Tatooine"))
                .starships(Sets.newHashSet(starshipMap.get("X-wing")))
                .build();

        StarWarsCharacter char10 = StarWarsCharacter.builder()
                .name("Obi-Wan Kenobi")
                .height(new BigDecimal(182))
                .mass(new BigDecimal(77))
                .hairColor("auburn, white")
                .skinColor("fair")
                .eyeColor("blue-gray")
                .birthYear("57BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Stewjon"))
                .starships(Sets.newHashSet(starshipMap.get("Jedi starfighter"),
                        starshipMap.get("Trade Federation cruiser"),
                        starshipMap.get("Naboo star skiff")))
                .build();

        StarWarsCharacter char11 = StarWarsCharacter.builder()
                .name("Anakin Skywalker")
                .height(new BigDecimal(188))
                .mass(new BigDecimal(84))
                .hairColor("blond")
                .skinColor("fair")
                .eyeColor("blue")
                .birthYear("41.9BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Tatooine"))
                .starships(Sets.newHashSet(starshipMap.get("Naboo fighter"),
                        starshipMap.get("Trade Federation cruiser"),
                        starshipMap.get("Jedi Interceptor")))
                .build();

        StarWarsCharacter char12 = StarWarsCharacter.builder()
                .name("Wilhuff Tarkin")
                .height(new BigDecimal(180))
                .hairColor("auburn, grey")
                .skinColor("fair")
                .eyeColor("blue")
                .birthYear("64BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Eriadu"))
                .build();

        StarWarsCharacter char13 = StarWarsCharacter.builder()
                .name("Chewbacca")
                .height(new BigDecimal(228))
                .mass(new BigDecimal(112))
                .hairColor("brown")
                .eyeColor("blue")
                .birthYear("200BBY")
                .gender("male")
                .homeWorld(homeworldMap.get("Kashyyyk"))
                .starships(Sets.newHashSet(starshipMap.get("Millennium Falcon"),
                        starshipMap.get("Imperial shuttle")))
                .build();

        List<StarWarsCharacter> characters = Arrays.asList(char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11, char12, char13);
        characterRepository.saveAll(characters);
    }

    private Map<String, StarWarsHomeworld> createHomeWorlds() {
        Map<String, StarWarsHomeworld> homeworlds = new HashMap<>();

        StarWarsHomeworld homeWorld1 = StarWarsHomeworld.builder()
                .name("Tatooine")
                .rotationPeriod(new BigDecimal(23))
                .orbitalPeriod(new BigDecimal(304))
                .diameter(new BigDecimal(10465))
                .climate("arid")
                .gravity("1 standard")
                .terrain("desert")
                .surfaceWater("1")
                .population(200000L)
                .build();
        homeworlds.put("Tatooine", homeWorld1);

        StarWarsHomeworld homeWorld2 = StarWarsHomeworld.builder()
                .name("Naboo")
                .rotationPeriod(new BigDecimal(26))
                .orbitalPeriod(new BigDecimal(312))
                .diameter(new BigDecimal(12120))
                .climate("temperate")
                .gravity("1 standard")
                .terrain("grassy hills, swamps, forests, mountains")
                .surfaceWater("12")
                .population(4500000000L)
                .build();
        homeworlds.put("Naboo", homeWorld2);

        StarWarsHomeworld homeWorld3 = StarWarsHomeworld.builder()
                .name("Alderaan")
                .rotationPeriod(new BigDecimal(24))
                .orbitalPeriod(new BigDecimal(364))
                .diameter(new BigDecimal(12500))
                .climate("temperate")
                .gravity("1 standard")
                .terrain("grasslands, mountains")
                .surfaceWater("40")
                .population(2000000000L)
                .build();
        homeworlds.put("Alderaan", homeWorld3);

        StarWarsHomeworld homeWorld4 = StarWarsHomeworld.builder()
                .name("Stewjon")
                .diameter(new BigDecimal(0))
                .climate("temperate")
                .gravity("1 standard")
                .terrain("grass")
                .build();
        homeworlds.put("Stewjon", homeWorld4);

        StarWarsHomeworld homeWorld5 = StarWarsHomeworld.builder()
                .name("Eriadu")
                .rotationPeriod(new BigDecimal(24))
                .orbitalPeriod(new BigDecimal(360))
                .diameter(new BigDecimal(13490))
                .climate("polluted")
                .gravity("1 standard")
                .terrain("cityscape")
                .population(22000000000L)
                .build();
        homeworlds.put("Eriadu", homeWorld5);

        StarWarsHomeworld homeWorld6 = StarWarsHomeworld.builder()
                .name("Kashyyyk")
                .rotationPeriod(new BigDecimal(26))
                .orbitalPeriod(new BigDecimal(381))
                .diameter(new BigDecimal(12765))
                .climate("tropical")
                .gravity("1 standard")
                .terrain("jungle, forests, lakes, rivers")
                .surfaceWater("60")
                .population(45000000L)
                .build();
        homeworlds.put("Kashyyyk", homeWorld6);

        return homeworldRepository.saveAll(homeworlds.values()).stream()
                .collect(Collectors.toMap(StarWarsHomeworld::getName, v -> v));
    }

    private Map<String, StarWarsStarship> createStarships() {
        Map<String, StarWarsStarship> starships = new HashMap<>();

        StarWarsStarship starship1 = StarWarsStarship.builder()
                .name("X-wing")
                .model("T-65 X-wing")
                .manufacturer("Incom Corporation")
                .costInCredits(new BigDecimal(149999))
                .length(new BigDecimal(12.5))
                .maxAtmosphericSpeed(new BigDecimal(1050))
                .crew(1)
                .passengers(0)
                .cargoCapacity(110L)
                .consumables("1 week")
                .hyperdriveRating(new BigDecimal(1.0))
                .mglt(100)
                .starshipClass("Starfighter")
                .build();
        starships.put("X-wing", starship1);

        StarWarsStarship starship2 = StarWarsStarship.builder()
                .name("Imperial shuttle")
                .model("Lambda-class T-4a shuttle")
                .manufacturer("Sienar Fleet Systems")
                .costInCredits(new BigDecimal(240000))
                .length(new BigDecimal(20))
                .maxAtmosphericSpeed(new BigDecimal(850))
                .crew(6)
                .passengers(20)
                .cargoCapacity(80000L)
                .consumables("2 months")
                .hyperdriveRating(new BigDecimal(1.0))
                .mglt(50)
                .starshipClass("Armed government transport")
                .build();
        starships.put("Imperial shuttle", starship2);

        StarWarsStarship starship3 = StarWarsStarship.builder()
                .name("TIE Advanced x1")
                .model("Twin Ion Engine Advanced x1")
                .manufacturer("Sienar Fleet Systems")
                .length(new BigDecimal(9.2))
                .maxAtmosphericSpeed(new BigDecimal(1200))
                .crew(1)
                .passengers(0)
                .cargoCapacity(150L)
                .consumables("5 days")
                .hyperdriveRating(new BigDecimal(1.0))
                .mglt(105)
                .starshipClass("Starfighter")
                .build();
        starships.put("TIE Advanced x1", starship3);

        StarWarsStarship starship4 = StarWarsStarship.builder()
                .name("Jedi starfighter")
                .model("Delta-7 Aethersprite-class interceptor")
                .manufacturer("Kuat Systems Engineering")
                .costInCredits(new BigDecimal(180000))
                .length(new BigDecimal(8))
                .maxAtmosphericSpeed(new BigDecimal(1150))
                .crew(1)
                .passengers(0)
                .cargoCapacity(60L)
                .consumables("7 days")
                .hyperdriveRating(new BigDecimal(1.0))
                .starshipClass("Starfighter")
                .build();
        starships.put("Jedi starfighter", starship4);

        StarWarsStarship starship5 = StarWarsStarship.builder()
                .name("Trade Federation cruiser")
                .model("Providence-class carrier/destroyer")
                .manufacturer("Rendili StarDrive, Free Dac Volunteers Engineering corps.")
                .costInCredits(new BigDecimal(125000000))
                .length(new BigDecimal(1088))
                .maxAtmosphericSpeed(new BigDecimal(1050))
                .crew(600)
                .passengers(48247)
                .cargoCapacity(50000000L)
                .consumables("4 years")
                .hyperdriveRating(new BigDecimal(1.5))
                .starshipClass("capital ship")
                .build();
        starships.put("Trade Federation cruiser", starship5);

        StarWarsStarship starship6 = StarWarsStarship.builder()
                .name("Naboo star skiff")
                .model("J-type star skiff")
                .manufacturer("Theed Palace Space Vessel Engineering Corps/Nubia Star Drives, Incorporated")
                .length(new BigDecimal(29.2))
                .maxAtmosphericSpeed(new BigDecimal(1050))
                .crew(3)
                .passengers(3)
                .hyperdriveRating(new BigDecimal(0.5))
                .starshipClass("yacht")
                .build();
        starships.put("Naboo star skiff", starship6);

        StarWarsStarship starship7 = StarWarsStarship.builder()
                .name("Naboo fighter")
                .model("N-1 starfighter")
                .manufacturer("Theed Palace Space Vessel Engineering Corps")
                .costInCredits(new BigDecimal(200000))
                .length(new BigDecimal(11))
                .maxAtmosphericSpeed(new BigDecimal(1100))
                .crew(1)
                .passengers(0)
                .cargoCapacity(65L)
                .consumables("7 days")
                .hyperdriveRating(new BigDecimal(1.0))
                .starshipClass("Starfighter")
                .build();
        starships.put("Naboo fighter", starship7);

        StarWarsStarship starship8 = StarWarsStarship.builder()
                .name("Jedi Interceptor")
                .model("Eta-2 Actis-class light interceptor")
                .manufacturer("Kuat Systems Engineering")
                .costInCredits(new BigDecimal(320000))
                .length(new BigDecimal(5.47))
                .maxAtmosphericSpeed(new BigDecimal(1500))
                .crew(1)
                .passengers(0)
                .cargoCapacity(60L)
                .consumables("2 days")
                .hyperdriveRating(new BigDecimal(1.0))
                .starshipClass("Starfighter")
                .build();
        starships.put("Jedi Interceptor", starship8);

        StarWarsStarship starship9 = StarWarsStarship.builder()
                .name("Millennium Falcon")
                .model("T-1300 light freighter")
                .manufacturer("Corellian Engineering Corporation")
                .costInCredits(new BigDecimal(100000))
                .length(new BigDecimal(34.37))
                .maxAtmosphericSpeed(new BigDecimal(1050))
                .crew(4)
                .passengers(6)
                .cargoCapacity(100000L)
                .consumables("2 months")
                .hyperdriveRating(new BigDecimal(0.5))
                .mglt(75)
                .starshipClass("Light freighter")
                .build();
        starships.put("Millenium Falcon", starship9);

        return starshipRepository.saveAll(starships.values()).stream()
                .collect(Collectors.toMap(StarWarsStarship::getName, v -> v));

//        return starships;
    }
}
