package fr.esgi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.Score.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GameFeature {

    private final Player playerOne = new Player("Sacha");
    private final Player playerTwo = new Player("Souleman");
    private final Game game = new Game(playerOne, playerTwo);

    @Given("The game as not started yet")
    public void theGameAsNotStartedYet() {
        assertThat(game.isStarted()).isFalse();
    }

    @When("game start")
    public void gameStart() {
        this.game.start(playerOne, playerTwo);
    }

    @Then("both player should have score LOVE")
    public void bothPlayerShouldHaveScore() {
        assertThat(game.getPlayerOne().getScore()).isEqualTo(LOVE);
        assertThat(game.getPlayerTwo().getScore()).isEqualTo(LOVE);
    }

    @Given("Player One has LOVE")
    public void playerOneHasLOVE() {
        this.playerOne.setScore(LOVE);
    }

    @When("Player One win the first point")
    public void playerOneWinTheFirstPoint() {
        this.game.winFirstPoint(this.playerOne);
    }

    @Then("Player One should have FIFTEEN")
    public void playerOneShouldHaveFIFTEEN() {
        assertThat(this.game.getPlayerOne().getScore()).isEqualTo(FIFTEEN);
    }

    @Given("Player Two has LOVE")
    public void playerTwoHasLOVE() {
        this.playerTwo.setScore(LOVE);
    }

    @When("Player Two win the second point")
    public void playerTwoWinTheSecondPoint() {
        this.game.winSecondPoint(this.playerTwo);
    }

    @Then("Player Two should have FIFTEEN")
    public void playerTwoShouldHaveFIFTEEN() {
        assertThat(this.game.getPlayerTwo().getScore()).isEqualTo(FIFTEEN);
    }

    @Given("Player One has FIFTEEN")
    public void playerOneHasFIFTEEN() {
        this.game.getPlayerOne().setScore(FIFTEEN);
    }

    @When("Player One win the third point")
    public void playerOneWinTheThirdPoint() {
        this.game.winThirdPoint(this.playerOne);
    }

    @Then("Player One should have THIRTY")
    public void playerOneShouldHaveTHIRTY() {
        assertThat(this.game.getPlayerOne().getScore()).isEqualTo(THIRTY);
    }

    @Given("Player Two has FIFTEEN")
    public void playerTwoHasFIFTEEN() {
        this.game.getPlayerTwo().setScore(FIFTEEN);
    }

    @When("Player Two win the fourth point")
    public void playerTwoWinTheFourthPoint() {
        this.game.winFourthPoint(this.playerTwo);
    }

    @Then("Player Two should have THIRTY")
    public void playerTwoShouldHaveTHIRTY() {
        assertThat(this.game.getPlayerTwo().getScore()).isEqualTo(THIRTY);
    }

    @Given("Player One has THIRTY")
    public void playerOneHasTHIRTY() {
        this.game.getPlayerOne().setScore(FORTY);
    }

    @When("Player One win the fifth point")
    public void playerOneWinTheFifthPoint() {
        this.game.winFifthPoint(this.playerOne);
    }

    @Then("Player One should have FORTY")
    public void playerOneShouldHaveFORTY() {
        assertThat(this.game.getPlayerOne().getScore()).isEqualTo(FORTY);
    }

    @Given("Player Two has THIRTY")
    public void playerTwoHasTHIRTY() {
        this.game.getPlayerTwo().setScore(FORTY);
    }

    @When("Player Two win the sixth point")
    public void playerTwoWinTheSixthPoint() {
        this.game.winSixthPoint(this.playerTwo);
    }

    @Then("Player Two should have FORTY")
    public void playerTwoShouldHaveFORTY() {
        assertThat(this.game.getPlayerTwo().getScore()).isEqualTo(FORTY);
    }
}
