package br.com.projeto.dslist.projections;

public interface GameMiniProjection {
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
