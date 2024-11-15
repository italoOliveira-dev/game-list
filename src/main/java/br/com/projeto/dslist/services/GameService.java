package br.com.projeto.dslist.services;

import br.com.projeto.dslist.dto.GameDTO;
import br.com.projeto.dslist.dto.GameMiniDTO;
import br.com.projeto.dslist.entites.Game;
import br.com.projeto.dslist.projections.GameMiniProjection;
import br.com.projeto.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMiniDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMiniDTO::toDTO).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return GameDTO.toDTO(getById(id));
    }

    public List<GameMiniDTO> findByList(Long listId) {
        List<GameMiniProjection> gameMiniProjections = gameRepository.searchByList(listId);
        return gameMiniProjections.stream().map(GameMiniDTO::toDTO).toList();
    }

    public Game getById(Long id) {
        return gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Game not found"));
    }
}
