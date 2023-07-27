package fr.esgi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.FORTY;
import static fr.esgi.Score.THIRTY;
import static org.assertj.core.api.Assertions.assertThat;

public class SpecialRuleFeature {

    private final Game game = new Game(new Player("Souleman"), new Player("Sarah"));

    @Given("Player One has FORTY points")
    public void playerOneHasFORTYPoints() {
        game.playerOne().setScore(FORTY);
    }

    @And("Player Two has THIRTY points")
    public void playerTwoHasTHIRTYPoints() {
        game.playerTwo().setScore(THIRTY);
    }

    @When("Player Two wins the point")
    public void playerTwoWinsThePoint() {
        game.winThePointWhenGameIsDeuce(game.playerTwo());
    }

    @Then("Both player have to play DEUCE")
    public void bothPlayerHaveToPlayDEUCE() {
        assertThat(game.isDeuce()).isTrue();
    }

    @Given("Game is DEUCE")
    public void gameIsDEUCE() {
        game.setDeuce(true);
    }

    @When("Player One wins the point of the game")
    public void playerOneWinsThePointOfTheGame() {
        game.winThePointOfTheAdvantage(game.playerOne());
    }

    @Then("Player One should have advantage")
    public void playerOneShouldHaveAdvantage() {
        assertThat(game.playerOne().isAdvantage()).isTrue();
    }

    @Given("Player One has advantage")
    public void playerOneHasAdvantage() {
        game.playerOne().setAdvantage(true);
    }

    @And("Player Two has FORTY")
    public void playerTwoHasFORTY() {
        game.playerTwo().setScore(FORTY);
    }

    @When("Player Two wins the point when the game was deuce")
    public void playerTwoWinThePointWhenTheGameIsInDeuce() {
        game.winThePointWhenGameIsDeuce(game.playerTwo());
    }

    @Then("The game return to DEUCE")
    public void theGameReturnToDEUCE() {
        assertThat(game.isDeuce()).isTrue();
    }

    @Given("Player Two has advantage")
    public void playerTwoHasAdvantage() {
        game.playerTwo().setAdvantage(true);
    }

    @Then("Player Two won the game")
    public void playerTwoWonTheGame() {
        assertThat(game.playerTwo().getGameWon()).isEqualTo(1);
    }

}
