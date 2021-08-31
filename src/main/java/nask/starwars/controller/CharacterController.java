package nask.starwars.controller;

import lombok.RequiredArgsConstructor;
import nask.starwars.representation.StarWarsCharacterRepresentation;
import nask.starwars.service.CharacterService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping(value = "{id}")
    public ResponseEntity<StarWarsCharacterRepresentation> getCharacter(@PathVariable Long id) {
        return characterService.getCharacter(id);
    }

    @GetMapping
    public ResponseEntity<Slice<StarWarsCharacterRepresentation>> getCharacters(@PageableDefault(page = 1, size = 5) Pageable pageable) {
        return characterService.getCharacters(pageable);
    }
}
