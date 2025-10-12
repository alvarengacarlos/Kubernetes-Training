package com.alvarengacarlos.api;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alvarengacarlos.api.Dto.CreateUpdatePhraseDto;

@RestController
@RequestMapping("/phrases")
public class Controller {
    Map<UUID, String> memoryDb = new HashMap<>();
    // TODO: create mongo connection here

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPhrase(@RequestBody CreateUpdatePhraseDto dto) {
        memoryDb.put(UUID.randomUUID(), dto.phrase);
    }

    @GetMapping("/{phraseId}")
    @ResponseStatus(HttpStatus.OK)
    public String getPhrase(@PathVariable UUID phraseId) {
        if (!memoryDb.containsKey(phraseId)) {
            return "";
        }

        return memoryDb.get(phraseId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Object[] getPhrases() {
        return memoryDb.values().toArray();
    }

    @PutMapping("/{phraseId}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePhrase(@PathVariable UUID phraseId, @RequestBody CreateUpdatePhraseDto dto) {
        memoryDb.put(phraseId, dto.phrase);
    }

    @DeleteMapping("/{phraseId}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePhrase(@PathVariable UUID phraseId) {
        memoryDb.remove(phraseId);
    }
}
