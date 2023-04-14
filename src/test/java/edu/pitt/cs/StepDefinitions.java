package edu.pitt.cs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
  private Pitcher pitcher;

  @Given("a new pitcher")
  public void aNewPitcher() {
    pitcher = new Pitcher();
  }

  @When("I add {int} stress to the pitcher")
  public void iAddStressToThePitcher(int stress) {
    pitcher.addStress(stress);
  }

  @Then("the pitcher has {int} stress")
  public void thePitcherHasStress(int stress) {
    assertEquals(stress, pitcher.getStress());
  }

}
