Feature: Game

  Rule: Each player can have either of these points in one game "LOVE", "FIFTEEN", "THIRTY", "FORTY"

    Example: Game Start
      Given The game as not started yet
      When game start
      Then both player should have score LOVE

    Example: First Point
      Given Player One has LOVE
      When Player One win the first point
      Then Player One should have FIFTEEN

    Example: Second Point
      Given Player Two has LOVE
      When Player Two win the second point
      Then Player Two should have FIFTEEN

    Example: Third Point
      Given Player One has FIFTEEN
      When Player One win the third point
      Then Player One should have THIRTY

    Example: Fourth Point
      Given Player Two has FIFTEEN
      When Player Two win the fourth point
      Then Player Two should have THIRTY

    Example: Fifth Point
      Given Player One has THIRTY
      When Player One win the fifth point
      Then Player One should have FORTY

    Example: Sixth Point
      Given Player Two has THIRTY
      When Player Two win the sixth point
      Then Player Two should have FORTY
