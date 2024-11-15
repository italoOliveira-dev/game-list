package br.com.projeto.dslist.dto;

import br.com.projeto.dslist.entites.Game;

public record GameDTO(
        Long id,
        String title,
        Integer year,
        String genre,
        String platforms,
        Double score,
        String imgUrl,
        String shortDescription,
        String longDescription) {

    public static GameDTO toDTO(Game entity) {
        return new GameDTO(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getGenre(),
                entity.getPlatforms(),
                entity.getScore(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getLongDescription());
    }
}
