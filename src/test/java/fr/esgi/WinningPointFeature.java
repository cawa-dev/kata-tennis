package fr.esgi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.FORTY;
import static fr.esgi.Score.THIRTY;
import static org.assertj.core.api.Assertions.assertThat;

public class WinningPointFeature {

    private final Game game = new Game(new Player("Souleman"), new Player("Sarah"));

    @Given("Player One has FORTY")
    public void playerOneHasFORTY() {
        game.playerOne().setScore(FORTY);
    }

    @And("Player Two have THIRTY")
    public void playerTwoHaveTHIRTY() {
        game.playerTwo().setScore(THIRTY);
    }

    @When("Player One wins the point")
    public void playerOneWinThePoint() {
        game.hasWon(game.playerOne());
    }

    @Then("Player One should win the game")
    public void playerOneShouldWinTheGame() {
        assertThat(game.playerOne().getGameWon()).isEqualTo(1);
    }
}
