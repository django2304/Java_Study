public class Rocket implements SpaceShip {
  
  private int currentRocketWeight;
  private int rocketCost;
  private static int weightLimit;
  private static double percent;
  
  @Override
  public boolean launch() {
    return true;
  }
  
  @Override
  public boolean land() {
    return true;
  }
  
  @Override
  public int carry(Item item) {
    currentRocketWeight += item.weight
    System.out.println(String.format("Current rocket weight is: %d\n", currentRocketWeight));
    return currentRocketWeight;
  }
  
  @Override
  public boolean canCarry (Item item) {
    int weightOfTheItem = currentRocketWeight + item.weight;
    System.out.println(weightOfTheItem);
    if (weightOfTheItem <= weightLimit)
      return true;
    else {
      System.out.println("Another rocket needed!");
      return false;
         }
   }
}
