package fr.esgi;

import java.util.Set;

record Game(
        boolean isStarted,
        Set<Player> players,
        boolean isDeuce
) {
}
