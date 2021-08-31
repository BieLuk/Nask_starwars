package nask.starwars.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nask.starwars.exception.CharacterNotFoundException;
import nask.starwars.exception.WrongPageNumberException;
import nask.starwars.model.StarWarsCharacter;
import nask.starwars.repository.CharacterRepository;
import nask.starwars.representation.StarWarsCharacterRepresentation;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final ModelMapper modelMapper;

    public ResponseEntity<StarWarsCharacterRepresentation> getCharacter(Long id) {
        StarWarsCharacter character = characterRepository.findById(id).orElseThrow(() -> {
            CharacterNotFoundException exception = new CharacterNotFoundException("Character not found id: " + id);
            log.error("Exception occured", exception);
            return exception;
        });

        StarWarsCharacterRepresentation response = modelMapper.map(character, StarWarsCharacterRepresentation.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<Slice<StarWarsCharacterRepresentation>> getCharacters(Pageable pageable) {

        Slice<StarWarsCharacter> characters = characterRepository.findAll(pageable);
        Slice<StarWarsCharacterRepresentation> response = characters.map(character -> modelMapper.map(character, StarWarsCharacterRepresentation.class));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
