package br.com.projeto.dslist.dto;

import br.com.projeto.dslist.entites.Game;
import br.com.projeto.dslist.projections.GameMiniProjection;

public record GameMiniDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public static GameMiniDTO toDTO(Game game) {
        return new GameMiniDTO(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }

    public static GameMiniDTO toDTO(GameMiniProjection projection) {
        return new GameMiniDTO(projection.getId(), projection.getTitle(), projection.getGameYear(), projection.getImgUrl(), projection.getShortDescription());
    }
}
