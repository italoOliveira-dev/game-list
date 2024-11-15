package br.com.projeto.dslist.dto;

import br.com.projeto.dslist.entites.GameList;

public record GameListDTO(Long id, String name) {

    public static GameListDTO toDTO(GameList gameList) {
        return new GameListDTO(gameList.getId(), gameList.getName());
    }
}
