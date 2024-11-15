package br.com.projeto.dslist.controllers;

import br.com.projeto.dslist.dto.GameListDTO;
import br.com.projeto.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;

    @Autowired
    public GameListController(GameListService gameListService) {this.gameListService = gameListService;}

    @GetMapping
    public ResponseEntity<List<GameListDTO>> showAll() {
        List<GameListDTO> listGames = gameListService.findAll();
        return ResponseEntity.ok(listGames);
    }
}
