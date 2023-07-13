package fr.esgi;

public record Player(
        Score score,
        String playerName,
        boolean hasAdvantage
) {

    public Player withScore(Score score) {
        return new Player(
                score,
                playerName,
                hasAdvantage
        );
    }
}
