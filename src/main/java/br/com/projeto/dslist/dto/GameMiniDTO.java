package br.com.projeto.dslist.dto;

import br.com.projeto.dslist.entites.Game;

public record GameMiniDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public static GameMiniDTO toDTO(Game game) {
        return new GameMiniDTO(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}
