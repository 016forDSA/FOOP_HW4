import java.lang.reflect.Constructor;

class CasinoChain{

   private State m_current_state;
   private String[] playerClassName;
   private Object[] player = new Object[4];

   private CasinoChain(){
      m_current_state = new Init();
   }

   private CasinoChain(String[] playerClassName, int nChip){
      m_current_state = new Init();
      for(int i = 0; i < 4; i++){
         try{
            Class tmp = Class.forName(playerClassName[i]);
            // System.out.println("Get Class");
            Constructor constructor = tmp.getConstructor(Integer.TYPE);
            // System.out.println("Get Constructor");
            player[i] = constructor.newInstance(nChip);
            // System.out.println("New Instance");
         } catch (Exception e){
            System.out.println(e.getCause());
         }
      }
   }

   public static CasinoChain Init(){
      return new CasinoChain();
   }
   
   public static CasinoChain InitWithPlayer(String[] playerClassName, int nChip){
      return new CasinoChain(playerClassName, nChip);
   }

   public void set_state(State s){
      m_current_state = s;
   }

   public void pull(){
      m_current_state.pull(this);
   }
}

interface State{
   void pull(CasinoChain wrapper);
}

class Init implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("Init");
      wrapper.set_state(new Bet());
      wrapper.pull();
   }
}

class Bet implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("Bet");
      wrapper.set_state(new Deal());
      wrapper.pull();
   }
}

class Deal implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("Deal");
      wrapper.set_state(new Insurance());
      wrapper.pull();
   }
}

class Insurance implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("Insurance");
      wrapper.set_state(new Surrender());
      wrapper.pull();
   }
}

class Surrender implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("Surrender");
      wrapper.set_state(new PlayerAction());
      wrapper.pull();
   }
}

class PlayerAction implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("PlayerAction");
      wrapper.set_state(new DealerAction());
      wrapper.pull();
   }
}

class DealerAction implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("DealerAction");
      wrapper.set_state(new Result());
      wrapper.pull();
   }
}

class Result implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("Result");
      wrapper.set_state(new End());
      wrapper.pull();
   }
}

class End implements State{

   public void pull(CasinoChain wrapper){
      System.out.println("End");
   }
}