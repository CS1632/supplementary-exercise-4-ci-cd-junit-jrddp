package edu.pitt.cs;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.mockito.*;

public class PitcherTest {
  @Test
  public void testAddStress() {
    // preconditions
    Pitcher pitcher = new Pitcher();

    // execution steps
    pitcher.addStress(10);

    // postconditions
    assertEquals("Adding 10 stress to a new pitcher does not result in returning 10 stress.", 10, pitcher.getStress());
  }

  /**
   * <pre>
   * Preconditions: A Pitcher pitcher is created.
   *                The pitcher always throws strikes.
   *                A Batter batter is created.
   *                The batter always swings bat.
   *                A BallGame game is created using pitcher and batter.
   * Execution steps: Call game.pitch().
   * Postconditions: The string "hit" is returned from the call.
   *                 Stress of 10 is added to the pitcher.
   * </pre>
   */
  @Test
  public void testPitch() {
    // preconditions
    Pitcher pitcher = Mockito.mock(Pitcher.class);
    // pitcher always throws strikes
    Mockito.when(pitcher.throwBall()).thenReturn(true);
    Batter batter = Mockito.mock(Batter.class);
    // batter always swings bat
    Mockito.when(batter.swingBat()).thenReturn(true);
    BallGame game = new BallGame(pitcher, batter);

    // execution steps
    String result = game.pitch();

    // postconditions
    assertEquals("Game pitch with thrown strike and swing did not return expected 'hit'.", "hit", result);
    // ensure stress of 10 is added to pitcher
    Mockito.verify(pitcher).addStress(10);
  }

}
