package fr.esgi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.FORTY;
import static fr.esgi.Score.THIRTY;
import static org.assertj.core.api.Assertions.assertThat;

public class WinningPointFeature {

    private final Player playerOne = new Player("Sacha");
    private final Player playerTwo = new Player("Souleman");
    private final Game game = new Game(playerOne, playerTwo);

    @Given("Player One has FORTY")
    public void playerOneHasFORTY() {
        this.game.getPlayerOne().setScore(FORTY);
    }

    @And("Player Two have THIRTY")
    public void playerTwoHaveTHIRTY() {
        this.game.getPlayerTwo().setScore(THIRTY);
    }

    @When("Player One win the point")
    public void playerOneWinThePoint() {
        this.game.hasWon(this.playerOne);
    }

    @Then("Player One should win the game")
    public void playerOneShouldWinTheGame() {
        assertThat(this.game.getPlayerOne().getGameWon()).isEqualTo(1);
    }
}
