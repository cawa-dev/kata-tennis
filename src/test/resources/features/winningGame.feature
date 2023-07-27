Feature: Winning Point

  Rule: If one of both players have “FORTY" and he have win four points and at least two more than is opponent, he wins the Game

    Example: Game is won by one player
      Given Player One has FORTY
      And Player Two have THIRTY
      When Player One wins the point
      Then Player One should win the game