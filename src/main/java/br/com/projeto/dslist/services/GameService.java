package br.com.projeto.dslist.services;

import br.com.projeto.dslist.dto.GameMiniDTO;
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
        return gameRepository.findAll().stream().map(GameMiniDTO::fromDTO).toList();
    }
}
