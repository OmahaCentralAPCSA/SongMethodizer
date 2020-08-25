public class PracticeSong {

 /*
 PracticeSong should take the song "Happy" by Pharrell
  

1. Eliminate redudancy and repitition. Concise. Structure. 

Because I'm happy
Clap along if you feel like a room without a roof
Because I'm happy
Clap along if you feel like happiness is the truth
Because I'm happy
Clap along if you know what happiness is to you
Because I'm happy
Clap along if you feel like that's what you wanna do

Because I'm happy
Clap along if you feel like a room without a roof
Because I'm happy
Clap along if you feel like happiness is the truth
Because I'm happy
Clap along if you know what happiness is to you
Because I'm happy
Clap along if you feel like that's what you wanna do

 */

  public static void main(String [] args) {
      playChorus();
      System.out.println(); 
      playChorus(); 
  }

  public static void playChorus() {
      becauseHappy("feel like a room without a roof");
      becauseHappy("feel like happiness is the truth");
      becauseHappy("know what happiness is to you");
      becauseHappy("feel like that's what you wanna do");
      //System.out.println(); 

      //use for loops and parameters to make it even more concise. 
  }

  public static void becauseHappy(String text) {
      System.out.println("Because I'm happy\nClap along if you " + text);
  }


}
