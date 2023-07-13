package fr.esgi;

import java.util.Set;
import java.util.stream.Collectors;

import static fr.esgi.Score.LOVE;

public record Game(
        Boolean isStarted,
        Set<Player> players,
        Boolean isDeuce
) {

    public Game start(Set<Player> players) {
        Set<Player> updatedPlayers = players.stream()
                .map(player -> player.withScore(LOVE))
                .collect(Collectors.toSet());

        return new Game(true, updatedPlayers, false);
    }
}
