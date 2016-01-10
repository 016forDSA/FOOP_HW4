import foop.Card;
import java.util.*;
import java.lang.reflect.Constructor;

public class POOCasino{
   private static String className = "Card";
   
   private static String player[] = new String[4];

   public static void main(String args[]){
      // Construct or something else
      int nRound = Integer.parseInt(args[0]);
      int nChip = Integer.parseInt(args[1]);
      String[] player = {args[2], args[3], args[4], args[5]};
      
      System.out.println(nRound);
      System.out.println(nChip);
      System.out.println(player[0]); 
      System.out.println(player[1]);
      System.out.println(player[2]); 
      System.out.println(player[3]);
      CasinoChain chain = CasinoChain.Init();
      try{
         System.out.println("Start");
         // while(true){
            chain.pull();
         // }
      } catch (Exception e){
         System.out.println(e.getMessage());
      }
      /*
         init();
         bet();
         deal();
         if(dealerGetAce())
            insurance();
         checkDealerHoleCard()
         if(dealerNotBlackJack())
            surrender()
         for each player
            flipOpen()
            if(twoEqualCard())
               split()
            if(isSplit())
               doTwice()
            doubleDown()
            doUntilDone()
         dealerAction()
         compareResult()
      */
         // Class c = Class.forName(className);
         // Constructor cConstructor = Class.forName(className).getConstructor(Byte.TYPE, Byte.TYPE);
         // Card car = new Card(Card.CLUB, Card.VALUE_LOWER);
         // System.out.println(car.getSuit() + " " + car.getValue());
      // } catch(Exception e){
      //  System.out.print(e.getStackTrace());
      // }
   }  

}