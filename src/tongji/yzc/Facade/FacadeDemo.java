package tongji.yzc.Facade;

import tongji.yzc.Facade.BattleOfSunkenTreasure.GameFacadeController;

public class FacadeDemo {
    public static void main(String[] args) {
        GameFacadeController gameFacadeController = new GameFacadeController();
        try{
            gameFacadeController.startGame();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void test(){
        GameFacadeController gameFacadeController = new GameFacadeController();
        try{
            gameFacadeController.startGame();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
