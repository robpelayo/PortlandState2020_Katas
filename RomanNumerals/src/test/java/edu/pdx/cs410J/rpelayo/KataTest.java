package edu.pdx.cs410J.rpelayo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest
{


  @Test
  public void romanNumeralFor1IsI() {
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }


}
