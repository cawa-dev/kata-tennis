Feature: Special Rule

  Rule: If both player have FORTY they play DEUCE

    Example: Game go in DEUCE
      Given Player One has FORTY points
      And Player Two has THIRTY points
      When Player Two wins the point
      Then Both player have to play DEUCE

    Example: Game is DEUCE
      Given Game is DEUCE
      When Player One wins the point of the game
      Then Player One should have advantage

    Example: Player One have the advantage and the Player Two score
      Given Player One has advantage
      And Player Two has FORTY
      When Player Two wins the point when the game was deuce
      Then The game return to DEUCE

    Example: The Game is won by the player two
      Given Player Two has advantage
      When Player Two wins the point when the game was deuce
      Then Player Two won the game
