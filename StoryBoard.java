import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane; //imported already available java libraries

import java.applet.Applet; //imports appplet class
import java.applet.AudioClip; //imports AudioClip class
import java.net.URL; //imports URL class

public class StoryBoard {
    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';
    char go = 'p';
    int playerhp = 340;
    int draghp = 500;
    char turn = 'x';
  
  public static void main (String args[]) {
    java.util.Date date = new java.util.Date(); //java.util.date class is being used to display the current date
    DelayedPrint.printSlow("It is " + date);
    
    URL url = StoryBoard.class.getResource("pixdrama.wav.wav"); //gets music file with URL and assigns it to url
    AudioClip clip2 = Applet.newAudioClip(url); //plays the music file (which gets called with url)
    clip2.loop(); //loops it nonestop
    
    new StoryBoard();
  }
  public StoryBoard() {
    //DelayedPrint.printSloow("");
    int points = 0;
    System.out.println("___________.__                _________                            __     ________   _____   ___________.__              .___       .__                     .___");
    System.out.println("\\__    ___/|  |__   ____     /   _____/ ____   ___________   _____/  |_   \\_____  \\_/ ____\\  \\__    ___/|  |__   ____    |   | _____|  | _____    ____    __| _/");
    System.out.println("  |    |   |  |  \\_/ __ \\    \\_____  \\_/ __ \\_/ ___\\_  __ \\_/ __ \\   __\\   /   |   \\   __\\     |    |   |  |  \\_/ __ \\   |   |/  ___/  | \\__  \\  /    \\  / __ | ");
    System.out.println("  |    |   |   Y  \\  ___/    /        \\  ___/\\  \\___|  | \\/\\  ___/|  |    /    |    \\  |       |    |   |   Y  \\  ___/   |   |\\___ \\|  |__/ __ \\|   |  \\/ /_/ | ");
    System.out.println("  |____|   |___|  /\\___  >  /_______  /\\___  >\\___  >__|    \\___  >__|    \\_______  /__|       |____|   |___|  /\\___  >  |___/____  >____(____  /___|  /\\____ | ");
    System.out.println("                \\/     \\/           \\/     \\/     \\/            \\/                \\/                         \\/     \\/            \\/          \\/     \\/      \\/ ");
    
    DelayedPrint.printSlow("Welcome to \"The Secret Of The Island\"");
    DelayedPrint.printSlow("    - In this game, you will make various decisions which will affect the outcome of the game.");
    int agelimit1 = 12;
    int agelimit2 = 4;
    int max = (agelimit1 > agelimit2) ? agelimit1 : agelimit2; //the ? : opperator (more efficient way of writing if-else statement in some cases like this one)
    int min = (agelimit2 > agelimit1) ? agelimit1 : agelimit2;
    DelayedPrint.printSlow("    - This game is generally designed for children from " + min + " to " + max + " but anybody can play");
    DelayedPrint.printSlow("    - You will also have to complete various tasks along the way to successfully complete the game.");
    DelayedPrint.printSlow("    - Get ready to have fun!");
    System.out.println("");
    
    DelayedPrint.printSlow("Before we start the game, please answer a few questions");
    System.out.println("");
    char bleee = IBIO.inputChar("Are you between 4-12 years of age? (y/n) >> ");
    while (vallllll(bleee)) {
      System.out.println("Please answer with a y or n");
      bleee = IBIO.inputChar("Are you between 4-12 years of age? (y/n) >> ");
    }
    if (bleee == 'n') {
      DelayedPrint.printSlow("Ok, thank you for your time and now get ready for the game!");
    } else {
      int blablabla = IBIO.inputInt("What is your age? "); //switch statement generates reples
      while (blablabla > 12 || blablabla < 4) {
        System.out.println("Hey you said you were between 4-12 years old");
        blablabla = IBIO.inputInt("Please re-enter your age >> ");
      }
        String ageString = "test";
        switch (blablabla) {
          case 4:  ageString = "four";
          break;
          case 5:  ageString = "five";
          break;
          case 6:  ageString = "six";
          break;
          case 7:  ageString = "seven";
          break;
          case 8:  ageString = "eight";
          break;
          case 9:  ageString = "nine";
          break;
          case 10: ageString = "ten";
          break;
          case 11: ageString = "eleven";
          break;
          case 12: ageString = "twelve";
          break;
        }
        DelayedPrint.printSlow("This game was made for you, since you are " + ageString + " years old");
      }
    
    JDialog.setDefaultLookAndFeelDecorated(true); //autimatically makes the dialog box look good
    int response = JOptionPane.showConfirmDialog(null, "Are You Ready To Begin Your Adventure?", "Ready?", //set to null (Default) and text is displayed and other text is the "title" of the dialog box
                                                 JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); //type of dialog box
    if (response == JOptionPane.NO_OPTION) { //if the "no option is pressed whole program will end"
      return;
    } else if (response == JOptionPane.YES_OPTION) { //if yes is pressed, it will continue on the start the game
      System.out.println("");
    } else if (response == JOptionPane.CLOSED_OPTION) { //if the program is closed, it will still continue (like it is "defaulted" to play) I included that for fun
      System.out.println("");
    }
    
    System.out.println("");
    System.out.println("");
    DelayedPrint.printSlow("Uhhh... Where am I?");
    DelayedPrint.printSlow("You suddenly wake in a dark cave and do not remember how you got here");
    DelayedPrint.printSlow("Slowly you begin to remember yourself a bit and start to see better too");
    DelayedPrint.printSlow("Your name is Ben Moore");
    maincharacter();
    DelayedPrint.printSlow("And you used to work as a pilot until you somehow ended up on this island");
    DelayedPrint.printSlow("At the end of the cave you see light and walk towards it");
    DelayedPrint.printSlow("You see: ");
    
    DelayedPrint.printSlow("   r) A huge jungle on your right");
    DelayedPrint.printSlow("   l) A swamp on your left");
    char ab = IBIO.inputChar("Which way do you want to go? (type r - to go right OR type l - to go left) >>");
    while (ab != 'r' && ab!= 'l') {
      System.out.println("Select from the option of r or l");
      System.out.println("Please try again");
      ab = IBIO.inputChar("Which way do you want to go? ");
    }
    boolean shovel = false;
    if (ab == 'r') {
      System.out.println("");///////////////////////////////////JUNGLE ADVENTURE//////////////////////////////////////////
      shovel = true;
      DelayedPrint.printSlow("Let's see what's in the jungle");
      jungleart();
      System.out.println("");
      DelayedPrint.printSlow("After wandering around in the jungle for some time, you feel like you are being watched and hear rustling in the trees");
      DelayedPrint.printSlow("Suddenly a monkey lands in front of you");
      monkeyart();
      System.out.println("");
      DelayedPrint.printSlow("Monkey: I challenge you to a duel");
      DelayedPrint.printSlow("   1) A duel?");
      DelayedPrint.printSlow("   2) You're just a little monkey I'm not afraid of you!");
      DelayedPrint.printSlow("   3) RUNNN!!!");
      int pq = IBIO.inputInt ("Enter your option >> ");
      if (pq == 1) {
        DelayedPrint.printSlow("A duel?");
        DelayedPrint.printSlow("Monkey: Yep...");
        DelayedPrint.printSlow("Monkey: I challenge you to the most intense game of tic tac toe you have ever seen");
        System.out.println("");
      } else if (pq == 2) {
        DelayedPrint.printSlow("You're just a little monkey I'm not afraid of you!");
        DelayedPrint.printSlow("Monkey: You know what");
        DelayedPrint.printSlow(".  .  .");
        DelayedPrint.printSlow("You're right");
        DelayedPrint.printSlow("Suddenly hundreds of monkeys jump out of the trees and gather around you");
        DelayedPrint.printSlow("How about now?");
        System.out.println("");
      } else {
        DelayedPrint.printSlow("You start running as fast as you can");
        DelayedPrint.printSlow("When you look back, you see that the monkey is not chasing you anymore but you keep running");
        DelayedPrint.printSlow("After a while, you get tired and sit on a log");
        DelayedPrint.printSlow("Suddenly hundreds of monkeys jump out of the trees and gather around you");
        DelayedPrint.printSlow("The monkey walks up to you and asks \"do you accept my challenge now?\"");
        System.out.println("");
      }
      
      //Tic Tac Toe Start -----------------------------------------------------------------------------------------------------------------------------------------------
      DelayedPrint.printSlow("I challenge you to a game of tic tac toe");
    DelayedPrint.printSlow("You will be 'x' and I will be 'o'");
    DelayedPrint.printSlow("You can make the first move");
    DelayedPrint.printSlow("");
    
    while (!winner ()) {
      printboard ();
      if (turn == 'x')
        makemove (turn);
      else if (turn == 'o')
        compmove(turn);
      
      if (turn == 'x')
        turn = 'o';
      else
        turn = 'x';
      
      if (tie()) {
        resetBoard();
        System.out.println("");
        System.out.println("");
        System.out.println("Its a Tie, game restarting...");
        System.out.println("");
      }
      
      if (printWinner () == 'x') {
        printboard ();
        DelayedPrint.printSlow("You Won");
      } else if (printWinner () == 'o') {
        printboard ();
        resetBoard();
        System.out.println("");
        System.out.println("");
        DelayedPrint.printSlow("Opponenet won... Restarting game.");
        System.out.println("");
      }
    }
      //Tic Tac Toe End --------------------------------------------------------------------------------------------------------------------
      
      System.out.println("Monkey: You have beat me and therefore I would like to give you a gift. I dont know what it is called but here you go");
      System.out.println("Monkey has gifted you a shovel");
      System.out.println("Monkey: You will need it. Now good luck adventurer");
      System.out.println("Thanks");
      points = 10;
    } else {
      System.out.println("");///////////////////////////////////SWAMP ADVENTURE//////////////////////////////////////////
      System.out.println("The swamp it is!");
      System.out.println("SPLASH");
      System.out.println("Who's there!");
      System.out.println("It is I. The guardian of this swamp, and since you have entered my territory, I challenge you to a duel");
      crocart();
      System.out.println("   1) What kind of duel?");
      System.out.println("   2) Alright lets do this!");
      int pnq = IBIO.inputInt ("Enter your option - 1 or 2 >> ");
      if (pnq == 1) {
        System.out.println("What kind of duel?");
        System.out.println("Crocodile: A good old INTENSE game of rock paper scissors!");
      } else {
        System.out.println("Crocodile: Any suggestions for what you want the duel to be of?");
        System.out.println("Uhh...");
        System.out.println("Crocodile: Ok good! Lets play tic tac toe");
      }
      
      
      //place rock paper scissors code here -----------------------------------------------------------------------------------------------------------------------------
      while (true) {
        int n = (int )(Math.random() * 3 + 1); //Selects random number from 1-3 for the crocodile
        
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        int x = IBIO.inputInt("Write a number from 1 - 3 to play either rock, paper or scissors");
        
        while (x > 3 || x < 1) { //to check if input is valid
          System.out.println("Not a valid entry, try again");
          x = IBIO.inputInt("Write a number from 1 - 3 to play either rock, paper or scissors");
        }
        
        if (x == 1) {
          System.out.println("You played: Rock");
        } else if (x == 2) {
          System.out.println("You played: Paper");
        } else if (x == 3) {
          System.out.println("You played: Scissors");
        }
        
        if (n == 1)
          System.out.println("Crocodile played: Rock");
        else if (n == 2)
          System.out.println("Crocodile played: Paper");
        else
          System.out.println("Crocodile played: Scissors");
        
        if (n == x) {
          System.out.println("It's a tie");
        } else if (x == 1 && n == 2 || x == 2 && n == 3 || x == 3 && n == 1) {
          System.out.println("Crocodile Won...");
        } else {
          System.out.println("Congratulations! You won");
          break; //exit the loop if the player wins
        }
      }
      //END OF ROCK PAPER SCISSORS CODE HERE ----------------------------------------------------------------------------------------------------------------------------
      points = 10;
      
      System.out.println("Crocodile: Wow nice! Feel free to roam the swamps now anytime you want.");
      System.out.println("After venturing further into the swamp you meet a wizard");
      
      //place wizard game code ----------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("Unknown voice: Pssst. Hey explorer over here.");
      System.out.println("Huh?");
      wizarddrawing();
      System.out.println("");
      System.out.println("Whoa! And who are you?");
      System.out.println("Wizard: I am the wizard of math");
      System.out.println("You could also become a math wiz if you answer four of my questions correctly");
      
      char again = 'y';
      while (again == 'y') {
        System.out.println("");
        int firsst = IBIO.inputInt("First Question: what is the remainder of 7/2");
        int modde = 7%2;
        while (firsst != modde) {
          System.out.println("Not quite, please try again.");
          firsst = IBIO.inputInt("First Question: what is the remainder of 7/2");
        }
        
        System.out.println("Nice Work! Now for your second question");
        
        int secondde = IBIO.inputInt("What is 15/3");
        int ansssss = 15/3;
        while (secondde != ansssss) {
          System.out.println("Sorry, please try again.");
          secondde = IBIO.inputInt("What is 15/3? ");
        }
        
        System.out.println("");
        
        System.out.println("Awesome! Moving on to your fourth question.");
        System.out.println("I am thinking of a number from one of the options listed below");
        int ip=1;  
        do{  
          System.out.println(ip);  
          ip++;
        }while(ip<=5);
        int thirdeh = IBIO.inputInt("Enter your guess for the number >> ");
        
        while (thirdeh != 3) {
          System.out.println("That is not the number try again.");
          thirdeh = IBIO.inputInt("Enter your guess for the number");
        }
        
        System.out.println("You are doing great so far");
        
        System.out.println("Guess another number from the options below");
        for (int jjnum = 2; jjnum <= 16; jjnum+= 2) {
          System.out.println(jjnum);
        }
        int hahaha = IBIO.inputInt("Enter your guess");
        
        while (hahaha != 12) {
          System.out.println("Sorry");
          hahaha = IBIO.inputInt("Enter your guess again");
        }
        
        System.out.println("You really are good.");
        System.out.println("Now for the final and hardest one");
        
        int randnumbereeh = (int)(Math.random() * 5 + 2);
        double realareaofcirc = Math.pow(randnumbereeh, 2)*Math.PI;
        int abcdefghi = (int) Math.round(realareaofcirc);
        
        System.out.println("Guess the area of the circle in my hand (rounded to the nearest whole number)");
        int fourttheeeh = IBIO.inputInt("extra info - radius is between 2 and 8");
        
        while (fourttheeeh != abcdefghi) {
          if (fourttheeeh < abcdefghi) {
            System.out.println("That is too low");
            fourttheeeh = IBIO.inputInt("Guess again");
          } else {
            System.out.println("That is too high");
            fourttheeeh = IBIO.inputInt("Guess again");
          }
        }
        
        DelayedPrint.printSlow("Wizard: Congratulations! You did it! You really are a math wiz and I knew if from the start");
        
        again = IBIO.inputChar("Do you want to play again? (y/n) ");
      }
      //end wizard game code ----------------------------------------------------------------------------------------------------------------------------------------
      points = 20;
    }
    
    System.out.println("");
    DelayedPrint.printSlow("It starts to rain. You seek shelter under an abandoned pirate ship that you see on the island");
    DelayedPrint.printSlow("The pirate ship is broken and some rain still keeps falling on you.");
    DelayedPrint.printSlow("A little while later, you hear a mysterious voice");
    DelayedPrint.printSlow("Voice: Hey, I can help you on your journey");
    //leopard guessing game -------------------------------------------------------------------------------------------------------------------------------------------
    DelayedPrint.printSlow("Voice: But I need you to guess what animal I am first");
    DelayedPrint.printSlow("Here's a Hint - It starts with the letter 'L', I have spots and I can climb trees");
    System.out.println("");
    String guess = IBIO.inputString("Enter your guess (check spelling): ");
    
    while (!checkValid(guess)) {
      System.out.println("Try Again");
      guess = IBIO.inputString("Enter your guess: ");
    }
    
    System.out.println("Woohoo! You got it right!");
    //END OF leopard guessing game ------------------------------------------------------------------------------------------------------------------------------------
    points = 30;
    
    System.out.println("");
    DelayedPrint.printSlow("Leopard: You must go back to the cave you started from and you will meet a chemist");
    DelayedPrint.printSlow("Leopard: No... But don't worry about how he got there. He will prepare you for the dragon");
    DelayedPrint.printSlow("Dragon??");
    DelayedPrint.printSlow("Leopard: I must go now. Sorry that is all I can tell you");
    System.out.println("");
    DelayedPrint.printSlow("----AT THE CAVE----");
    System.out.println("");
    drawChemist();
    DelayedPrint.printSlow("Chemist: Hey, I a chemist. The dragon is the strongest creature to exist and you will have to beat him to get the hidden treasure");
    DelayedPrint.printSlow("Hidden Treasure?!");
    DelayedPrint.printSlow("Chemist: Yes. But to beat him, you will need a potion which I can give you. If you answer three riddles/questions correctly.");
    DelayedPrint.printSlow("");
    
    //riddles game ---------------------------------------------------------------------------------------------------------------------------------------------------
    DelayedPrint.printSlow("1. What animal purrs");
    String a1 = IBIO.inputString("Enter your answer: ");
    while (!checkValid1(a1)) {
      System.out.println("Try Again");
      a1 = IBIO.inputString("Enter your answer: ");
    }
    if (checkValid1(a1))
      DelayedPrint.printSlow("Correct! Moving on to number two");
    
    
    System.out.println("");
    //---- qu 2.
    DelayedPrint.printSlow("2. What is 7+5");
    int a2 = IBIO.inputInt("Enter your answer: ");
    while (!checkValid2(a2)) {
      System.out.println("Try Again");
      a2 = IBIO.inputInt("Enter your answer: ");
    }
    if (checkValid2(a2))
      DelayedPrint.printSlow("Correct! Now for the last, and hardest riddle.");
    
    
    System.out.println("");
    //----- qu 3.
    DelayedPrint.printSlow("3. I am a big red building and animals live in me, what am I?");
    String a3 = IBIO.inputString("Enter your answer: ");
    
    while (!checkValid3(a3)) {
      System.out.println("Try Again");
      a3 = IBIO.inputString("Enter your answer: ");
    }
    
    if (checkValid3(a3)) {
      System.out.println("");
      DelayedPrint.printSlow("Chemist: WOW! You got all of then correct! You really are worthy of the dragon");
      DelayedPrint.printSlow("Chemist: Now here is the potion as I promised to give you.");
    }
    //END OF riddles game --------------------------------------------------------------------------------------------------------------------------------------------
    points = 40;
    
    DelayedPrint.printSlow("You drink the potion and start to feel stronger.");
    //dragon game -----------------------------------------------------------------------------------------------------------------------------------------------------
    System.out.println("");
    dragodrawing();
    DelayedPrint.printSlow("Oh no... It's the dragon");
    DelayedPrint.printSlow("Dragon: Yes, it is I. The mighty dragon. I have heard alot about you and your bravery little explorer.");
    DelayedPrint.printSlow("Oh, uh thank you...?");
    DelayedPrint.printSlow("Dragon: Finally a worthy opponent has come my way");
    DelayedPrint.printSlow("Dragon: Let's begin shall we?");
    System.out.println("");
    System.out.println("Your HP: " + playerhp);
    System.out.println("Dragon's HP: " + draghp);
    System.out.println("");
    DelayedPrint.printSlow("Wow... I'm really lucky to have had that potion. Who knows what my HP would have been without it");
    DelayedPrint.printSlow("Dragon: It's nice of you to finally show up... I've heard quite a bit about you. How brave, strong and smart you are... But lets put that to the test now");
    
    while (!won()) {
      if (go == 'p') {
        playermove();
      } else if (go == 'd') {
        dragonmove();
      }
      if (go == 'p') {
        go = 'd';
      } else {
        go = 'p';
      }
      if (playerhp <= 0) {
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------");
        DelayedPrint.printSlow("                        Game Over. The Dragon beat you...");
        DelayedPrint.printSlow("                                Restarting game");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        newGame();
      } else if (draghp <= 0) {
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        DelayedPrint.printSlow("      You did it! You successfully beat the boss!");
      }
    }
    //END OF dragon game ----------------------------------------------------------------------------------------------------------------------------------------------
    System.out.println("");
    DelayedPrint.printSlow("You have beat me. Now I can grant you a wish.");
    DelayedPrint.printSlow("   1) You may have heard that there is treasure on this island. I can give you a map to get to there OR");
    DelayedPrint.printSlow("   2) I can fly you back to your cozy home");
    
    int hurryup = IBIO.inputInt("Enter your option");
    
    while (!validitycheck(hurryup)) {
      System.out.println("That is not valid input. Please try again.");
      hurryup = IBIO.inputInt("Enter your option");
    }
    
    if (hurryup == 1) {
      DelayedPrint.printSlow("Dragon: As you wish");
      DelayedPrint.printSlow("Dragon: Here is the map");
      
      drawMap();
      
      DelayedPrint.printSlow("Wow which way do I go now. I don't really know how to read maps");
      System.out.println("");
      
      int g1 = IBIO.inputInt("How many steps forward do I go (one dashed line is one step)");
      while (g1 != 6) {
        System.out.println("Try Again");
        g1 = IBIO.inputInt("How many steps forward do I go (one dashed line is one step)");
      }
      if (g1 == 6)
        DelayedPrint.printSlow("Good Job! You Got it.");
      System.out.println("");
      
      
      int g2 = IBIO.inputInt("How many steps to the right do I take now? (one dashed line is one step)");
      while (g2 != 4) {
        System.out.println("Try Again");
        g2 = IBIO.inputInt("How many steps to the right do I take now? (one dashed line is one step)");
      }
      if (g2 == 4)
        DelayedPrint.printSlow("Excellent!");
      System.out.println("");
      
      int g3 = IBIO.inputInt("How many steps forward do I take again now? (one dashed line is one step)");
      while (g3 != 5) {
        System.out.println("Try Again");
        g3 = IBIO.inputInt("How many steps to the right do I take now? (do not count to location as a step)");
      }
      if (g3 == 5)
        DelayedPrint.printSlow("Yaaa! We have arrived at the loot.");
      
      if (shovel == true) {
        DelayedPrint.printSlow("Let's use the shovel that the monkey gave me!");
        DelayedPrint.printSlow("---- A little while later ----");
        drawchest();
        DelayedPrint.printSlow("Woah! It's so shiny!");
        DelayedPrint.printSlow("And is that a ship in the distance? I'm going to be saved too now! I can't believe it!");
      } else {
        DelayedPrint.printSlow("Hmmm. Digging might take a while. I guess I should start now...");
      }
      points = 50;
      System.out.println("Congratulations! You earned " + points + " points! Thats the max number of points possible");
    } else {
      //home
      DelayedPrint.printSlow("Dragon: Climb on. You might want to hold on tight though ;)");
      points = 40;
      System.out.println("Nice job, you earned " + points + " points! Try playing again to get a new high score.");
    }//THE END :)
  }
  
  public void resetBoard ()
  {
    a = ' ';
    b = ' ';
    c = ' ';
    d = ' ';
    e = ' ';
    f = ' ';
    g = ' ';
    h = ' ';
    i = ' ';
    
    turn = 'x';
    //no need to reprint board as when the game restarts, it will do it in the printboard() method so
    //all we needed to do was re-assign the varibles with no value and make the turn x again
  }
  
  public void printboard ()
  {
    System.out.println("   1   2   3");
    System.out.println("1  " + a +" | "+ b +" | "+ c);
    System.out.println("  ---+---+---");
    System.out.println("2  " + d +" | "+ e +" | "+ f);
    System.out.println("  ---+---+---");
    System.out.println("3  " + g +" | "+ h +" | "+ i);
    // Board will be printed out like one above and each letter is assigned to a square
  }
  
  public void compmove (char piece) {
    System.out.println("");   
    System.out.println(""); 
    System.out.println("Opponent's Move:");
    int x = (int)(Math.random() * 3 + 1);
    int y = (int)(Math.random() * 3 + 1);
    while (!isValid (x, y))
    {
      x = (int)(Math.random() * 3 + 1);
      y = (int)(Math.random() * 3 + 1);
    }
    if (x == 1 && y == 1) //assigns coordinate to the piece for the computer
      a = piece;
    else if (x == 2 && y == 1)
      b = piece;
    else if (x == 3 && y == 1)
      c = piece;
    else if (x == 1 && y == 2)
      d = piece;
    else if (x == 2 && y == 2)
      e = piece;
    else if (x == 3 && y == 2)
      f = piece;
    else if (x == 1 && y == 3)
      g = piece;
    else if (x == 2 && y == 3)
      h = piece;
    else if (x == 3 && y == 3)
      i = piece;
  }
  
  public void makemove (char piece)
  {
    int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
    int y = IBIO.inputInt ("Enter the y-coordinate: ");
    while (!isValid (x, y))
    {
      System.out.println ("Error - invalid coordinate. Try again.");
      x = IBIO.inputInt ("\nEnter the x-coordinate: ");
      y = IBIO.inputInt ("Enter the y-coordinate: ");
    }
    if (x == 1 && y == 1)//assigns coordinate to the piece for the player
      a = piece;
    else if (x == 2 && y == 1)
      b = piece;
    else if (x == 3 && y == 1)
      c = piece;
    else if (x == 1 && y == 2)
      d = piece;
    else if (x == 2 && y == 2)
      e = piece;
    else if (x == 3 && y == 2)
      f = piece;
    else if (x == 1 && y == 3)
      g = piece;
    else if (x == 2 && y == 3)
      h = piece;
    else if (x == 3 && y == 3)
      i = piece;
    //complete the other 7 spaces
  }
  
  
  public boolean isValid (int x, int y)
  {
    //returns false if invalid
    // x and y must be between 1 and 3 and the position can not be already taken
    if (x > 3 || x < 1 && y > 3 || y < 1)
      return false;
    if (x == 1 && y == 1 && a!=' ')
      return false;
    else if (x == 2 && y == 1 && b!=' ')
      return false;
    else if (x == 3 && y == 1 && c!=' ')
      return false;
    else if (x == 1 && y == 2 && d!=' ')
      return false;
    else if (x == 2 && y == 2 && e!=' ')
      return false;
    else if (x == 3 && y == 2 && f!=' ')
      return false;
    else if (x == 1 && y == 3 && g!=' ')
      return false;
    else if (x == 2 && y == 3 && h!=' ')
      return false;
    else if (x == 3 && y == 3 && i!=' ')
      return false;
    else
      return true;
  }
  
  
  public boolean winner ()
  { //returns true if three in a row
    if (a == b && a == c && a != ' ')
      return true;
    else if (d == e && d == f && d != ' ')
      return true;
    else if (g == h && g == i && g != ' ')
      return true;
    else if (a == d && a == g && a != ' ')
      return true;
    else if (b == e && b == h && b != ' ')
      return true;
    else if (c == f && c == i && c != ' ')
      return true;
    else if (a == e && a == i && a != ' ')
      return true;
    else if (g == e && g == c && g != ' ')
      return true;
    else
      return false;
  }
  
  public boolean tie ()
  { //if all are filled but nobody one then true
    if (a != ' ' && b != ' ' && c != ' ' && d != ' ' && e != ' ' && f != ' ' && g != ' ' && h != ' ' && i != ' ' && winner() == false)
      return true;
    else
      return false;
  }
  
  public char printWinner ()
  { //returns who is in the winning condition
    if (a == b && a == c && a != ' ') //top horizontal
      return a;
    else if (d == e && d == f && d != ' ')
      return d;
    else if (g == h && g == i && g != ' ')
      return g;
    else if (a == d && a == g && a != ' ')
      return a;
    else if (b == e && b == h && b != ' ')
      return b;
    else if (c == f && c == i && c != ' ')
      return c;
    else if (a == e && a == i && a != ' ')
      return a;
    else if (g == e && g == c && g != ' ')
      return g;
    else
      return 0;
  }
  
  public boolean validitycheck(int hurryup) {
    if (hurryup == 1 || hurryup == 2)
      return true;
    else
      return false;
  }
  
  public boolean isItValid(char mov) {
    if ((mov == 'a') || (mov == 'h') || (mov == 'f') || (mov == 's')) {
      return true;
    }
    return false;
  }
  
  public void newGame() {
    go = 'p';
    playerhp = 300;
    draghp = 500;
  }
  
  public int playermove() {
    System.out.println("Type   a   to attack");
    System.out.println("Type   h   to heal");
    System.out.println("Type   f   to flee");
    System.out.println("Type   s   to use special move");
    System.out.println("     NOTE: Using your special move will cause you some damage too");
    char mov = IBIO.inputChar("Enter your move:");
    while (!isItValid(mov)) {
      System.out.println("Sorry please try again.");
      System.out.println("Type   a   to attack");
      System.out.println("Type   h   to heal");
      System.out.println("Type   f   to flee");
      System.out.println("Type   s   to use special move");
      System.out.println("     NOTE: Using your special move will cause you some damage too");
      mov = IBIO.inputChar("Enter your move:");
    }
    if (mov == 'a') {
      attack();
    } else if (mov == 'h') {
      heal();
    } else if (mov == 's') {
      supermove();
    } else
      flee();
    return 0;
  }
  
  public int dragonmove() {
    int dragAttack = (int)(Math.random() * 30.0D + 1.0D);
    playerhp -= dragAttack;
    System.out.println("Dragon Attacked! Your HP is now: " + playerhp);
    return playerhp;
  }
  
  public boolean won() {
    if (playerhp <= 0)
      return true;
    if (draghp <= 0) {
      return true;
    }
    return false;
  }
  
  public int heal() {
    int healnum = (int)(Math.random() * 15.0D + 1.0D);
    playerhp += healnum;
    return playerhp;
  }
  
  public int attack() {
    int attacknum = (int)(Math.random() * 15.0D + 1.0D);
    draghp -= attacknum;
    System.out.println("");
    System.out.println("You Attacked. Dragon's HP is now: " + draghp);
    return draghp;
  }
  
  public int supermove() {
    int sprattack = (int)(Math.random() * 40.0D + 15.0D);
    int sprdamage = (int)(Math.random() * 15.0D + 1.0D);
    draghp -= sprattack;
    playerhp -= sprdamage;
    System.out.println("");
    System.out.println("You used your Super Attack. Dragon's HP is now: " + draghp);
    System.out.println("You lost some HP in the process too. Your hp is now: " + playerhp);
    return 0;
  }
  
  public int flee() {
    System.out.println("Try all you want now, but you can't flee");
    return 0;
  }
  
  public boolean vallllll(char bleee) {
    if (bleee == 'y' || bleee == 'n')
      return false;
    else
      return true;
  }
  
  public boolean checkValid1(String a1) {
    if (a1.equals("Cat") || a1.equals("cat") || a1.equals("CAT"))
      return true;
    else
      return false;
  }
  
  public boolean checkValid2(int a2) {
    if (a2 == 12)
      return true;
    else
      return false;
  }
  
  public boolean checkValid3(String a3) {
    if (a3.equals("Barn") || a3.equals("barn") || a3.equals("BARN") || a3.equals("A BARN") || a3.equals("a barn") || a3.equals("a Barn") || a3.equals("A Barn"))
      return true;
    else
      return false;
  }
  
  public static void maincharacter() {
    System.out.println("         .--..--.");
    System.out.println("        /    V   \\");
    System.out.println("     __|__________|__");
    System.out.println("    '--///      \\\\\\--'");
    System.out.println("      (    6  6    ) ");
    System.out.println("       :     )    ;");
    System.out.println("        \\   ==   /");
    System.out.println("         `-.__.-`");
    System.out.println("      __ _(\\__/)_ __");
    System.out.println("    /`  / \\(><)/ \\  `\\");
    System.out.println("   /    \\ |::::| /    \\");
    System.out.println("   |    / /::::\\ \\  | |");
    System.out.println("   | | /  |::::|  \\ | |");
    System.out.println("   | | \\  |'::'|  / | |");
    System.out.println("   | |  \\_/ :: \\_/  | |");
    System.out.println("   | |    |____|o   | |");
    System.out.println("   |_|    |____|o   |_|");
    System.out.println("   |_\\    |    |o   /_|");
    System.out.println("   /  \\___| L_ |___/  \\");
    System.out.println("  ((((||    ||    ||))))");
    System.out.println("       |    ||    |");
    System.out.println("       |    ||    |");
    System.out.println("       |    ||    |");
    System.out.println("       |    ||    |");
    System.out.println("       |    ||    |");
    System.out.println("       |___ || ___|");
    System.out.println("     __[____||____]__");
    System.out.println("    (       )(       )");
    System.out.println("     `---'==  =='---'");
  }
  
  public static void drawchest() {
    System.out.println("                          _.--.");
    System.out.println("                      _.-'_:-'||");
    System.out.println("                  _.-'_.-::::'||");
    System.out.println("             _.-:'_.-::::::'  ||");
    System.out.println("           .'`-.-:::::::'     ||");
    System.out.println("          /.'`;|:::::::'      ||_");
    System.out.println("         ||   ||::::::'     _.;._'-._");
    System.out.println("         ||   ||:::::'  _.-!oo @.!-._'-.");
    System.out.println("         \'.  ||:::::.-!()oo @!()@.-'_.|");
    System.out.println("          '.'-;|:.-'.&$@.& ()$%-'o.'\\U||");
    System.out.println("            `>'-.!@%()@'@_%-'_.-o _.|'||");
    System.out.println("             ||-._'-.@.-'_.-' _.-o  |'||");
    System.out.println("             ||=[ '-._.-\\U/.-'    o |'||");
    System.out.println("             || '-.]=|| |'|      o  |'||");
    System.out.println("             ||      || |'|        _| ';");
    System.out.println("             ||      || |'|    _.-'_.-'");
    System.out.println("             |'-._   || |'|_.-'_.-'");
    System.out.println("              '-._'-.|| |' `_.-'");
    System.out.println("                  '-.||_/.-'");
    
  }
  
  public static void dragodrawing() {
    System.out.println("             __                  __");
    System.out.println("            ( _)                ( _)");
    System.out.println("           / / \\\\              / /\\_\\_");
    System.out.println("          / /   \\\\            / / | \\ \\");
    System.out.println("         / /     \\\\          / /  |\\ \\ \\");
    System.out.println("        /  /   ,  \\ ,       / /   /|  \\ \\");
    System.out.println("       /  /    |\\_ /|      / /   / \\   \\_\\");
    System.out.println("      /  /  |\\/ \\ '/| \\   / /   /   \\    \\\\");
    System.out.println("     |  /   |/  0 \\0\\    / |    |    \\    \\\\");
    System.out.println("     |    |\\|      \\_\\_ /  /    |     \\    \\\\");
    System.out.println("     |  | |/    \\.\\ o\\o)  /      \\     |    \\\\");
    System.out.println("     \\    |     /\\\\`v-v  /        |    |     \\\\");
    System.out.println("      | \\/    /_| \\\\_|  /         |    | \\    \\\\");
    System.out.println("      | |    /__/_ `-` /   _____  |    |  \\    \\\\");
    System.out.println("      \\|    [__]  \\_/  |_________  \\   |   \\    ()");
    System.out.println("       /    [___] (    \\         \\  |\\ |   |   //");
    System.out.println("      |    [___]                  |\\| \\|   /  |/");
    System.out.println("     /|    [____]                  \\  |/\\ / / ||");
    System.out.println("    (  \\   [____ /     ) _\\      \\  \\    \\| | ||");
    System.out.println("     \\  \\  [_____|    / /     __/    \\   / / //");
    System.out.println("     |   \\ [_____/   / /        \\    |   \\/ //");
    System.out.println("     |   /  '----|   /=\\____   _/    |   / //");
    System.out.println("  __ /  /        |  /   ___/  _/\\    \\  | ||");
    System.out.println(" (/-(/-\\)       /   \\  (/\\/\\)/  |    /  | /");
    System.out.println("               (/\\/\\)           /   /   //");
    System.out.println("                      _________/   /   |/");
    System.out.println("                     \\____________/    ");
  }
  
  public void drawMap() {
    System.out.println("            ~        ~          ~            ~        ~");
    System.out.println(" ~                                  _.,-'=_.-'-._  ~        ~");
    System.out.println("         ~     ~           ~   ._.-'             '-._   ~");
    System.out.println("                      _.-':_.-'                      '-._   ~     ~");
    System.out.println("                  _.-'                                   '-._.'-._");
    System.out.println("   ~       .-'.-,'                                                '-.");
    System.out.println("           '-._                       /\\   /\\                    _.-'");
    System.out.println(" ~             '-.                   /  \\ /  \\                ._'");
    System.out.println("           ~      '-._                 /\\ (           _.'-._,-'");
    System.out.println("                      '-._            /  \\ )      _.-'        ");
    System.out.println(" ~     ) ( ) (    ~     .-'               (     .'              ~");
    System.out.println("      ) \" ( \" (        .-'                 )    '-._.,.            ~");
    System.out.println("     )  \"  (\"  (       '-._               /           '-._  ~ ");
    System.out.println("    )   \"   (   ( ___      '-._          (                '.   ~");
    System.out.println("        \"   \"    |   | ~      .'          )                '-._");
    System.out.println("  ---._-|--|--|--|--/     _.-'           /                   _.'   ~");
    System.out.println("       \\ o  o  o  o/     '-._           /         Treasure   '-._-'-.");
    System.out.println("   ~~~~~~~~~~~~~~~~~         '-._      (             |         _.-''");
    System.out.println("  ~          ~             ~     '-.    ) /\\         |   _.-\"._,'");
    System.out.println("                  ~              _.'   / /\\ /\\       |  '.  ~         ");
    System.out.println("                       _.-'-._.-'     / /  \\  \\      |   '-._._      ");
    System.out.println("          ~        _.-'              /               |          '-. ~");
    System.out.println("                .-'              .-'('-._        |----            '-.");
    System.out.println(" ~            _.'         _.-'-.-'~   ~  '.      |      _.'-.-'._  .'");
    System.out.println("     .-'=_.'-'         .-'  ~   ~   _ _.-'       |  _.-'     ~   '.'");
    System.out.println("  _.-'                 '-._,.-'._.-'             |  '_   ~       ~");
    System.out.println(".'                                               |     '-._   ~    ~");
    System.out.println("'-.- = .-'.                                      |         '=._");
    System.out.println("          '._                              You Are Here        '-.");
    System.out.println("        ~    :_                                            _.-'.-' ~");
    System.out.println("     ~     ~   \"._,-'.-'._    .-`-._;'-._.='._          .-'  ~");
    System.out.println("                    ~     '-_.\"      ~    ~   '-._:'=~_.'       ~");
    System.out.println("           ~     ~      ~        ~     ~        ~          ~    ~");
  }
  
  public static void monkeyart() {                           //SINCE YOUNGER CHILDREN MIGHT NOT UNDERSTAND/LIKE THE STORY (TEXT PART) I ADDED LOTS OF FUN ASCII ART
    System.out.println("      .=\"=.");
    System.out.println("    _/.\\,/.\\_     _");
    System.out.println("   ( ( o o ) )    ))");
    System.out.println("    |/  \"  \\|    //");
    System.out.println("     \\ --- /    //");
    System.out.println("     /`\"\"\"`\\  ((");
    System.out.println("    / /_,_\\ \\  \\");
    System.out.println("    \\_\\_'__/ \\  ))");
    System.out.println("    /`  /`~\\  |//");
    System.out.println("   /   /    \\  /");
    System.out.println("  ,--`,--'\\/\\    /");
    System.out.println(" '-- \"--'  '--'");
  }
  
  public static void crocart() {
    System.out.println("            .-._   _ _ _ _ _ _ _ _");
    System.out.println(" .-''-.__.-'00  '-' ' ' ' ' ' ' ' '-.");
    System.out.println("'.___ '    .   .--_'-' '-' '-' _'-' '._");
    System.out.println(" V: V 'vv-'   '_   '.       .'  _..' '.'.");
    System.out.println("   '=.____.=_.--'   :_.__.__:_   '.   : :");
    System.out.println("           (((____.-'        '-.  /   : :");
    System.out.println("                          (((-'\\ .' /");
    System.out.println("                           _____..'  .'");
    System.out.println("                          '-._____.-'");
  }
  
  public static void jungleart() {
    System.out.println("             ,@@@@@@@,");
    System.out.println("     ,,,.   ,@@@@@@/@@,  .oo8888o.");
    System.out.println("  ,&%%&%&&%,@@@@@/@@@@@@,8888\\88/8o");
    System.out.println(" ,%&\\%&&%&&%,@@@\\@@@/@@@88\\88888/88'");
    System.out.println(" %&&%&%&/%&&%@@\\@@/ /@@@88888\\88888'");
    System.out.println(" %&&%/ %&%%&&@@\\ V /@@' `88\\8 `/88'");
    System.out.println(" `&%\\ ` /%&'    |.|        \\ '|8'");
    System.out.println("     |o|        | |         | |");
    System.out.println("     |.|        | |         | |");
    System.out.println("  \\/ ._\\//_/__/  ,\\_//__\\/.  \\_//__/_");
  }
  
  public boolean checkValid(String guess) {
    if (guess.equalsIgnoreCase("leopard"))//so that the case does not matter (user can make it capital or lowercase or mixed as long as spelling is right)
      return true;
    else
      return false;
  }
  
  public static void drawChemist() {
System.out.println("                    _..._                  ");
System.out.println("                   //''\\\\\\                 ");
System.out.println("                   ||. .||                 ");
System.out.println("                   |\\ _ /|      (          ");
System.out.println("                  .-/\\ /\\-.     )   |      ");
System.out.println("                 |  ` \\ '  |    _   |      ");
System.out.println("           (     | |  |  | |    H=--+-     ");
System.out.println("           ))    | |__|[ | |    U   |      ");
System.out.println("           __    \\___(_3/ /     )   |      ");
System.out.println("-|_H_H_|---||---------|!|/------|---|---.  ");
System.out.println(" |_U_U_|  /__\\        |_|      _[_ _|__  \\ ");
System.out.println("------------------------------------------`");
  }
  
  public static void wizarddrawing() {
    System.out.println("                    ____ ");
    System.out.println("                  .'* *.'");
    System.out.println("               __/_*_*(_");
    System.out.println("              / _______ \\");
    System.out.println("             _\\_)/___\\(_/_ ");
    System.out.println("            / _((\\- -/))_ \\");
    System.out.println("            \\ \\())(-)(()/ /");
    System.out.println("             ' \\(((()))/ '");
    System.out.println("            / ' \\)).))/ ' \\");
    System.out.println("           / _ \\ - | - /_  \\");
    System.out.println("          (   ( .;''';. .'  )");
    System.out.println("          _\\\"__ /    )\\ __\"/_");
    System.out.println("            \\/  \\   ' /  \\/");
    System.out.println("             .'  '...' ' )");
    System.out.println("              / /  |  \\ \\");
    System.out.println("             / .   .   . \\");
    System.out.println("            /   .     .   \\");
    System.out.println("           /   /   |   \\   \\");
    System.out.println("         .'   /    b    '.  '.");
    System.out.println("     _.-'    /     Bb     '-. '-._ ");
    System.out.println(" _.-'       |      BBb       '-.  '-. ");
    System.out.println("(____(_____(______.dBBBb.________)____)");
  }
}