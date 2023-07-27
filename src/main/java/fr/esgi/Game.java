package fr.esgi;

import static fr.esgi.Score.LOVE;

public final class Game {

    private boolean isStarted;
    private final Player playerOne;
    private final Player playerTwo;
    private boolean isDeuce;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start(Player playerOne, Player playerTwo) {
        setStarted(true);
        playerOne.setScore(LOVE);
        playerTwo.setScore(LOVE);
    }

    public void winPoints(Player player) {
        player.setScore(player.getScore().next()
                .orElseThrow(() -> new RuntimeException("The score your trying to reach is limited")));
    }

    public void hasWon(Player player) {
        player.setGameWon();
    }

    public void winThePointWhenGameIsDeuce(Player player) {
        if (player.isAdvantage()) {
            System.out.printf("%s has won the game%n", player.getName());
            hasWon(player);
            setDeuce(false);
        } else {
            System.out.printf("%s has reach 40 points too%n", player.getName());
            player.setScore(player.getScore().next().orElseThrow(() -> new RuntimeException("The score your trying to reach is limited")));
            setDeuce(true);
        }
    }

    public void winThePointOfTheAdvantage(Player playerOne) {
        playerOne.setAdvantage(true);
    }

    public boolean isStarted() {
        return this.isStarted;
    }

    public void setStarted(boolean isStarted) {
        this.isStarted = isStarted;
    }

    public Player playerOne() {
        return playerOne;
    }

    public Player playerTwo() {
        return playerTwo;
    }

    public boolean isDeuce() {
        return isDeuce;
    }

    public void setDeuce(boolean deuce) {
        isDeuce = deuce;
    }

    @Override
    public String toString() {
        return "Game{" +
                "isStarted=" + isStarted +
                ", playerOne=" + playerOne +
                ", playerTwo=" + playerTwo +
                ", isDeuce=" + isDeuce +
                '}';
    }
}
