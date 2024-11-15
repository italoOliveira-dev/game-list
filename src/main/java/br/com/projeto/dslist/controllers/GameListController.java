package br.com.projeto.dslist.controllers;

import br.com.projeto.dslist.dto.GameListDTO;
import br.com.projeto.dslist.dto.GameMiniDTO;
import br.com.projeto.dslist.services.GameListService;
import br.com.projeto.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    @Autowired
    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDTO>> showAll() {
        List<GameListDTO> listGames = gameListService.findAll();
        return ResponseEntity.ok(listGames);
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameMiniDTO>> searchByList(@PathVariable Long listId) {
        List<GameMiniDTO> gameList = gameService.findByList(listId);
        return ResponseEntity.ok(gameList);
    }
}
