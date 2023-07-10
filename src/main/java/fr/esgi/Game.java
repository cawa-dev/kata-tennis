package fr.esgi;

import static fr.esgi.Score.*;

class Game {

    private boolean isStarted;
    private final Player playerOne;
    private final Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.isStarted = false;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start(Player playerOne, Player playerTwo) {
        this.isStarted = true;
        playerOne.setScore(LOVE);
        playerTwo.setScore(LOVE);
    }

    public void winFirstPoint(Player playerOne) {
        playerOne.setScore(FIFTEEN);
    }

    public void winSecondPoint(Player playerTwo) {
        playerTwo.setScore(FIFTEEN);
    }

    public void winThirdPoint(Player playerOne) {
        playerOne.setScore(THIRTY);
    }

    public void winFourthPoint(Player playerTwo) {
        playerTwo.setScore(THIRTY);
    }

    public void winFifthPoint(Player playerOne) {
        playerOne.setScore(FORTY);
    }

    public void winSixthPoint(Player playerTwo) {
        playerTwo.setScore(FORTY);
    }

    public boolean isStarted() {
        return this.isStarted;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void hasWon(Player playerOne) {
        playerOne.setGameWon();
    }
}