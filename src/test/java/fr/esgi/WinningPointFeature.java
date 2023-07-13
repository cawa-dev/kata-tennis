package fr.esgi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.FORTY;
import static fr.esgi.Score.THIRTY;
import static org.assertj.core.api.Assertions.assertThat;

public class WinningPointFeature {

    private final GameContext gameContext;

    public WinningPointFeature(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    public Game game() {
        return this.gameContext.game();
    }

    @Given("Player One has FORTY")
    public void playerOneHasFORTY() {
        game().playerOne().setScore(FORTY);
    }

    @And("Player Two have THIRTY")
    public void playerTwoHaveTHIRTY() {
        game().playerTwo().setScore(THIRTY);
    }

    @When("Player One win the point")
    public void playerOneWinThePoint() {
        game().hasWon(game().playerOne());
    }

    @Then("Player One should win the game")
    public void playerOneShouldWinTheGame() {
        assertThat(game().playerOne().getGameWon()).isEqualTo(1);
    }
}
