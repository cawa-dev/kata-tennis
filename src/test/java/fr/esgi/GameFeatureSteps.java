package fr.esgi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fr.esgi.samples.PlayerSample.players;
import static org.assertj.core.api.Assertions.assertThat;

public class GameFeatureSteps {

    private Game game;

    public GameFeatureSteps() {
        this.game = new Game(
                Boolean.FALSE,
                players(),
                Boolean.FALSE);
    }

    @Given("The game as not started yet")
    public void theGameAsNotStartedYet() {
        assert this.game.isStarted() : false;
    }

    @When("game start")
    public void gameStart() {
        this.game = game.start(players());
    }

    @Then("both player should have score LOVE")
    public void bothPlayerShouldHaveScoreLOVE() {
        assertThat(this.game.isStarted()).isTrue();
    }
}
