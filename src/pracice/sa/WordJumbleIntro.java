/*
 * Amer Stas.
 * 4/2/2020
 * This program will doa all the possible word jumble
 */
package pracice.sa;
import java.util.Scanner;

public class WordJumbleIntro {
  public static void main(String[] args) {
    // Allowing to get user input 
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a word");
    // Declaring variables
    String letters = input.nextLine();
    // recursive method
    jumbleWords(letters, "");
  }

  //input parameters
  //word - the remaining letters in the word still to jumble
  //jumbLet - the letters already used to create
  //the jumbled word
  public static void jumbleWords(String word, String jumbLet) {
    int pos;
    String remainingLetters;
    String origWord = word;
    String origJumbledLetters = jumbLet;
    if (word.length() == 1) {
      System.out.println(jumbLet + word);
    } else {
      for (pos = 0; pos < origWord.length(); pos++) {
        remainingLetters = origWord.substring(0, pos)
          + origWord.substring(pos + 1, origWord.length());
        //recursive call to jumbleWords()
        jumbleWords(remainingLetters, 
          origJumbledLetters + origWord.charAt(pos));
      }
    }
  }
}


    

    



