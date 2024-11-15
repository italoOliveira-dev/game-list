package br.com.projeto.dslist.entites;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_game_list")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GameList() {}

    public GameList(Long id, String name ) {
        this.id = id;
        this.name = name;
    }
}
