package edu.cnm.deepdive;

public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;

  public String abbreviation(){
    switch (this){
      case CLUBS:
        return "C";
      case HEARTS:
        return "H";
      case DIAMONDS:
        return "D";
      case SPADES:
        return "S";
   }
    return null;
  }
  public Color getColor(){
    switch (this) {
      case CLUBS:
      case SPADES:
        return  Color.BLACK;
        default:
          return Color.RED;
    }
  }

public enum Color{
    RED, BLACK;
}
}
