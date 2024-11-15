package br.com.projeto.dslist.repositories;

import br.com.projeto.dslist.entites.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
