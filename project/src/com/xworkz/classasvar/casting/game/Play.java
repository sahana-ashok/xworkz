package com.xworkz.prog.casting.game;

public class Play {
    public void inner(Game game){
       game.play();
       game.duration();
       game.opponent();
       game.strategy();
       game.winner();

       if(game instanceof Chess){
           System.out.println("game instanceof Chess");
           Chess chess=(Chess) game;
           chess.wood();
       }
    }
}
