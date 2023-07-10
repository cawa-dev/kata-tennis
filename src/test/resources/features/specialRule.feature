Feature: Special Rule

  Rule: If both player have FORTY they play DEUCE

    Example: Game go in DEUCE
      Given Player One has FORTY
      And Player Two has THIRTY
      When Player Two win the point
      Then Both player have to play "DEUCE"

    Example: Game is in DEUCE
      Given Game is in DEUCE
      When Player One win the point
      Then Player One should have advantage


    Example: Player One have the ADVANTAGE
      Given Player One has advantage
      When Player Two win the point
      Then The game return to "DEUCE"

    Example The Game is won by the player two
      Given Player Two has advantage
      When Player Two win the point
      Then Player Two won the game
