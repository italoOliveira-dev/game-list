package br.com.projeto.dslist.repositories;

import br.com.projeto.dslist.entites.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
