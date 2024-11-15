package br.com.projeto.dslist.controllers;

import br.com.projeto.dslist.dto.GameDTO;
import br.com.projeto.dslist.dto.GameMiniDTO;
import br.com.projeto.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    public final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameMiniDTO>> showAll() {
        List<GameMiniDTO> games = gameService.findAll();

        return ResponseEntity.ok(games);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> show(@PathVariable Long id) {
        GameDTO gameDTO = gameService.findById(id);
        return ResponseEntity.ok(gameDTO);
    }
}
