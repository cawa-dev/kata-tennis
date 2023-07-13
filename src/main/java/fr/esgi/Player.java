package fr.esgi;

final class Player {

    private Score score;
    private final String name;
    private int gameWon = 0;
    private boolean isAdvantage;

    public Player(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGameWon() {
        return gameWon;
    }

    public void setGameWon() {
        this.gameWon++;
    }

    public boolean isAdvantage() {
        return isAdvantage;
    }

    public void setAdvantage(boolean isAdvantage) {
        this.isAdvantage = isAdvantage;
    }
}
