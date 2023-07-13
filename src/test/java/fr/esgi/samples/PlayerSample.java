package fr.esgi.samples;

import fr.esgi.Player;

import java.util.Set;

import static fr.esgi.Score.LOVE;

public class PlayerSample {


    public static Set<Player> players() {
        return Set.of(new Player(LOVE, "Sarah", false),
                new Player(LOVE, "Souleman", false));
    }
}
