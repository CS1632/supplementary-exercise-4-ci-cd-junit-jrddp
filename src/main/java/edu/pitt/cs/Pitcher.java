package edu.pitt.cs;
import java.util.Random;

public class Pitcher {
  private Random random = new Random();
  private int stress = 0;

  /**
   * Returns whether strike was thrown, with 50/50 chance of strikes and balls.
   * 
   * @return true if strike is thrown or false otherwise
   */
  public boolean throwBall() {
    return (random.nextInt(2) == 1);
  }

  public void addStress(int n) {
    stress += n;
  }

  public int getStress() {
    return stress;
  }
}
