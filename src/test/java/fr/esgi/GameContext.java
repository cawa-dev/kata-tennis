package fr.esgi;

public record GameContext(Game game) {

    /**
     * Constructor for Dependency Injection in the Game Context of the Kata
     */
    public GameContext() {
        this(new Game(new Player("Souleman"), new Player("Sarah")));
    }
}
