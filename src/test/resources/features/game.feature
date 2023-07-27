Feature: Game

  Rule: Each player can have either of these points in one game "LOVE", "FIFTEEN", "THIRTY", "FORTY"

    Example: Game Start
      Given The game as not started yet
      When game start
      Then both player should have score LOVE

    Example: First point of the game when the first player score a point
      Given Player One has LOVE
      When Player One wins the first point
      Then Player One should have FIFTEEN

    Example: Second point of the game when the second player score a point
      Given Player Two has LOVE
      When Player Two wins the second point
      Then Player Two should have FIFTEEN

    Example: Third point of the game when the first player score a point
      Given Player One has FIFTEEN
      When Player One wins the third point
      Then Player One should have THIRTY

    Example: Fourth point of the game when the second player score a point
      Given Player Two has FIFTEEN
      When Player Two wins the fourth point
      Then Player Two should have THIRTY

    Example: Fifth point of the game when the first player score a point
      Given Player One has THIRTY
      When Player One wins the fifth point
      Then Player One should have FORTY

    Example: Fifth point of the game when the second player score a point
      Given Player Two has THIRTY
      When Player Two wins the sixth point
      Then Player Two should have FORTY
