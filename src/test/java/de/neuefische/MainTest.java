package de.neuefische;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  //Annotation
  @Test
  void sum_shouldReturn5_whenCalledWith4And1(){
      //GIVEN -> Alle uns bekannten Werte
      int expected = 5;
      //WHEN -> Tatsächlicher Methodenaufruf
      int actual = Main.sum(4, 1);
      //THEN -> Abgleich von erwartetem und tatsächlichem Wert
      assertEquals(expected, actual);
  }

  @Test
    void isEven_shouldReturnTrue_whenCalledWith2(){
      //GIVEN
      //WHEN
      boolean actual = Main.isEven(2);
      //THEN
      assertTrue(actual);
  }

    @Test
    void isEven_shouldReturnFalse_whenCalledWith1(){
        //GIVEN
        //WHEN
        boolean actual = Main.isEven(1);
        //THEN
        assertFalse(actual);
    }
    @Test
    void gradeToText_shouldReturnSehrGut_whenCalledWith1(){
        //GIVEN
        String expected = "Sehr gut!";
        //WHEN
        String actual = Main.gradeToText(1);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void gradeToText_shouldReturnGut_whenCalledWith2(){
        //GIVEN
        String expected = "Gut!";
        //WHEN
        String actual = Main.gradeToText(2);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void gradeToText_shouldReturnBefriedigend_whenCalledWith3(){
        //GIVEN
        String expected = "Befriedigend";
        //WHEN
        String actual = Main.gradeToText(3);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void gradeToText_shouldReturnAusreichend_whenCalledWith4(){
        //GIVEN
        String expected = "Ausreichend";
        //WHEN
        String actual = Main.gradeToText(4);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void gradeToText_shouldReturnMangelhaft_whenCalledWith5(){
        //GIVEN
        String expected = "Mangelhaft";
        //WHEN
        String actual = Main.gradeToText(5);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void gradeToText_shouldReturnUngenügend_whenCalledWith6(){
        //GIVEN
        String expected = "Ungenügend";
        //WHEN
        String actual = Main.gradeToText(6);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void gradeToText_shouldReturnFallbackText_whenCalledWithInvalidNumber(){
        //GIVEN
        String expected = "Bitte geben Sie eine Valide Zahl zwischen 1-6 ein!";
        //WHEN
        String actual = Main.gradeToText(9);
        //THEN
        assertEquals(expected, actual);
    }
}