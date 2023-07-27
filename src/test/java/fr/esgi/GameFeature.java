package fr.esgi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GameFeature {

    private final Game game = new Game(new Player("Souleman"), new Player("Sarah"));

    @Given("The game as not started yet")
    public void theGameAsNotStartedYet() {
        assertThat(game.isStarted()).isFalse();
    }

    @When("game start")
    public void gameStart() {
        game.start(game.playerOne(), game.playerTwo());
    }

    @Then("both player should have score LOVE")
    public void bothPlayerShouldHaveScore() {
        assertThat(game.playerOne().getScore()).isEqualTo(LOVE);
        assertThat(game.playerTwo().getScore()).isEqualTo(LOVE);
    }

    @Given("Player One has LOVE")
    public void playerOneHasLOVE() {
        game.playerOne().setScore(LOVE);
    }

    @When("Player One wins the first point")
    public void playerOneWinsTheFirstPoint() {
        game.winPoints(game.playerOne());
    }

    @Then("Player One should have FIFTEEN")
    public void playerOneShouldHaveFIFTEEN() {
        assertThat(game.playerOne().getScore()).isEqualTo(FIFTEEN);
    }

    @Given("Player Two has LOVE")
    public void playerTwoHasLOVE() {
        game.playerTwo().setScore(LOVE);
    }

    @When("Player Two wins the second point")
    public void playerTwoWinsTheSecondPoint() {
        game.winPoints(game.playerTwo());
    }

    @Then("Player Two should have FIFTEEN")
    public void playerTwoShouldHaveFIFTEEN() {
        assertThat(game.playerTwo().getScore()).isEqualTo(FIFTEEN);
    }

    @Given("Player One has FIFTEEN")
    public void playerOneHasFIFTEEN() {
        game.playerOne().setScore(FIFTEEN);
    }

    @When("Player One wins the third point")
    public void playerOneWinsTheThirdPoint() {
        game.winPoints(game.playerOne());
    }

    @Then("Player One should have THIRTY")
    public void playerOneShouldHaveTHIRTY() {
        assertThat(game.playerOne().getScore()).isEqualTo(THIRTY);
    }

    @Given("Player Two has FIFTEEN")
    public void playerTwoHasFIFTEEN() {
        game.playerTwo().setScore(FIFTEEN);
    }

    @When("Player Two wins the fourth point")
    public void playerTwoWinsTheFourthPoint() {
        game.winPoints(game.playerTwo());
    }

    @Then("Player Two should have THIRTY")
    public void playerTwoShouldHaveTHIRTY() {
        assertThat(game.playerTwo().getScore()).isEqualTo(THIRTY);
    }

    @Given("Player One has THIRTY")
    public void playerOneHasTHIRTY() {
        game.playerOne().setScore(FORTY);
    }

    @When("Player One wins the fifth point")
    public void playerOneWinsTheFifthPoint() {
        game.winPoints(game.playerOne());
    }

    @Then("Player One should have FORTY")
    public void playerOneShouldHaveFORTY() {
        assertThat(game.playerOne().getScore()).isEqualTo(FORTY);
    }

    @Given("Player Two has THIRTY")
    public void playerTwoHasTHIRTY() {
        game.playerTwo().setScore(FORTY);
    }

    @When("Player Two wins the sixth point")
    public void playerTwoWinsTheSixthPoint() {
        game.winPoints(game.playerTwo());
    }

    @Then("Player Two should have FORTY")
    public void playerTwoShouldHaveFORTY() {
        assertThat(game.playerTwo().getScore()).isEqualTo(FORTY);
    }
}
