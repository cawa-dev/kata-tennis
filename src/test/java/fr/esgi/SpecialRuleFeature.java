package fr.esgi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.FORTY;
import static fr.esgi.Score.THIRTY;
import static org.assertj.core.api.Assertions.assertThat;

public class SpecialRuleFeature {

    private final GameContext gameContext;

    public SpecialRuleFeature(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    public Game game() {
        return this.gameContext.game();
    }

    @Given("Player One has FORTY points")
    public void playerOneHasFORTYPoints() {
        game().playerOne().setScore(FORTY);
    }

    @And("Player Two has THIRTY points")
    public void playerTwoHasTHIRTYPoints() {
        game().playerTwo().setScore(THIRTY);
    }

    @When("Player Two win the point")
    public void playerTwoWinThePoint() {
        game().winThePointOfDeuce(game().playerTwo());
    }

    @Then("Both player have to play DEUCE")
    public void bothPlayerHaveToPlayDEUCE() {
        assertThat(game().isDeuce()).isTrue();
    }

    @Given("Game is in DEUCE")
    public void gameIsInDEUCE() {
        game().setDeuce(true);
    }

    @When("Player One win the point of the game")
    public void playerOneWinThePointOfTheGame() {
        game().winThePointOfTheAdvantage(game().playerOne());
    }

    @Then("Player One should have advantage")
    public void playerOneShouldHaveAdvantage() {
        assertThat(game().playerOne().isAdvantage()).isTrue();
    }

    @Given("Player One has advantage")
    public void playerOneHasAdvantage() {
        game().playerOne().setAdvantage(true);
    }

    @When("Player Two win the point of deuce")
    public void playerTwoWinThePointOfDeuce() {
        game().winThePointOfDeuce(game().playerTwo());
    }

    @Then("The game return to DEUCE")
    public void theGameReturnToDEUCE() {
        assertThat(game().isDeuce()).isTrue();
    }

    @Given("Player Two has advantage")
    public void playerTwoHasAdvantage() {
        game().playerTwo().setAdvantage(true);
    }

    @Then("Player Two won the game")
    public void playerTwoWonTheGame() {
        assertThat(game().playerTwo().getGameWon()).isEqualTo(1);
    }
}
