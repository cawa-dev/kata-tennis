Feature: Point
  Scenario: Each player can have either "love", "fifteen", "thirty", "forty" points
    Given Both Player has not started the Set
    When They start the Set
    Then Both Player should have score love
