import foop.*;
import java.util.*;

public class PlayerB02902016 extends Player{

   public PlayerB02902016(int nChip){
      super(nChip);
   }
   public boolean buy_insurance(Card my_open, Card dealer_open, ArrayList<Hand> current_table){
      return false;
   }

   public boolean do_double(Hand my_open, Card dealer_open, ArrayList<Hand> current_table){
      return false;
   }

   public boolean do_split(ArrayList<Card> my_open, Card dealer_open, ArrayList<Hand> current_table){
      return false;
   }

   public boolean do_surrender(Card my_open, Card dealer_open, ArrayList<Hand> current_table){
      return false;
   }

   public boolean hit_me(Hand my_open, Card dealer_open, ArrayList<Hand> current_table){
      return false;
   }

   public int make_bet(ArrayList<Hand> last_table, int total_player, int my_position){
      return (int)get_chips();
   }

   public String toString(){
      return Double.toString(this.get_chips());
   }
}