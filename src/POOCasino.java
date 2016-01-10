import foop.*;
import java.util.*;
import java.lang.reflect.Constructor;

public class POOCasino{
   
   public static void main(String args[]){
      // Take in Input, format : nRound, nChip, PlayerClassName1, 2, 3, 4
      int nRound = Integer.parseInt(args[0]);
      int nChip = Integer.parseInt(args[1]);
      String[] playerClassName = {args[2], args[3], args[4], args[5]};
      
      // Init CasinoChain With Player(State Pattern)
      CasinoChain chain = CasinoChain.InitWithPlayer(playerClassName, nChip);

      try{
         while( nRound-- > 0){
            chain.set_state(new Init());
            chain.pull();
         }
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