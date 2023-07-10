Feature: Winning Point

  Rule: If one of both players have “FORTY", and he win the point, he win the Game

    Example: Game is won by one player
      Given Player One has FORTY
      And Player Two have THIRTY
      When Player One win the point
      Then Player One should win the game