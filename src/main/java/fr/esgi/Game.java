package fr.esgi;

import static fr.esgi.Score.*;

class Game {

    private boolean isStarted;
    private boolean isDeuce;
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

    public void hasWon(Player player) {
        player.setGameWon();
    }

    public void winThePointOfDeuce(Player player) {
        if (player.isAdvantage()) {
            System.out.printf("%s has win the game", player.getName());
            hasWon(player);
        } else {
            System.out.printf("%s has reach 40 points too", player.getName());
            setDeuce(true);
        }
    }

    public boolean isDeuce() {
        return isDeuce;
    }

    public void setDeuce(boolean deuce) {
        isDeuce = deuce;
    }

    public void winThePointOfTheAdvantage(Player playerOne) {
        playerOne.setAdvantage(true);
    }
}