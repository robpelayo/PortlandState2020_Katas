package edu.pdx.cs410J.rpelayo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest {


    @Test
    public void romanNumeralFor1IsI() {
        assertThat(Kata.romanNumeralFor(1), equalTo("I"));
    }

    @Test
    public void romanNumeralFor1IsII() {
        assertThat(Kata.romanNumeralFor(2), equalTo("II"));
    }
    @Test
    public void romanNumeralFor3IsIII() {
        assertThat(Kata.romanNumeralFor(3), equalTo("III"));
    }

    @Test
    public void romanNumeralFor1IsIV() {
        assertThat(Kata.romanNumeralFor(4), equalTo("IV"));
    }

    @Test
    public void romanNumeralFor1IsV() {
        assertThat(Kata.romanNumeralFor(5), equalTo("V"));
    }

    @Test
    public void romanNumeralFor7IsVII() {
        assertThat(Kata.romanNumeralFor(7), equalTo("VII"));
    }

    @Test
    public void romanNumeralFor40IsXL() {
        assertThat(Kata.romanNumeralFor(40), equalTo("XL"));
    }
    @Test
    public void romanNumeralFor4999IsMMMMCMXCIX() {
        assertThat(Kata.romanNumeralFor(4999), equalTo("MMMMCMXCIX"));
    }


}
