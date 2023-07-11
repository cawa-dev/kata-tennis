package fr.esgi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.FORTY;
import static fr.esgi.Score.THIRTY;
import static org.assertj.core.api.Assertions.assertThat;

public class SpeciaRuleFeature {

    private final Player playerOne = new Player("Sacha");
    private final Player playerTwo = new Player("Souleman");
    private final Game game = new Game(playerOne, playerTwo);

    @Given("Player One has FORTY points")
    public void playerOneHasFORTYPoints() {
        this.game.getPlayerOne().setScore(FORTY);
    }

    @And("Player Two has THIRTY points")
    public void playerTwoHasTHIRTYPoints() {
        this.game.getPlayerTwo().setScore(THIRTY);
    }

    @When("Player Two win the point")
    public void playerTwoWinThePoint() {
        this.game.winThePointOfDeuce(playerTwo);
    }

    @Then("Both player have to play DEUCE")
    public void bothPlayerHaveToPlayDEUCE() {
        assertThat(this.game.isDeuce()).isTrue();
    }

    @Given("Game is in DEUCE")
    public void gameIsInDEUCE() {
        this.game.setDeuce(true);
    }

    @When("Player One win the point of the game")
    public void playerOneWinThePointOfTheGame() {
        this.game.winThePointOfTheAdvantage(playerOne);
    }

    @Then("Player One should have advantage")
    public void playerOneShouldHaveAdvantage() {
        assertThat(this.game.getPlayerOne().isAdvantage()).isTrue();
    }

    @Given("Player One has advantage")
    public void playerOneHasAdvantage() {
        this.game.getPlayerOne().setAdvantage(true);
    }

    @When("Player Two win the point of deuce")
    public void playerTwoWinThePointOfDeuce() {
        this.game.winThePointOfDeuce(playerTwo);
    }

    @Then("The game return to DEUCE")
    public void theGameReturnToDEUCE() {
        assertThat(this.game.isDeuce()).isTrue();
    }

    @Given("Player Two has advantage")
    public void playerTwoHasAdvantage() {
        this.game.getPlayerTwo().setAdvantage(true);
    }

    @Then("Player Two won the game")
    public void playerTwoWonTheGame() {
        assertThat(this.game.getPlayerTwo().getGameWon()).isEqualTo(1);
    }
}
