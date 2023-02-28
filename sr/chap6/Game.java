package chap6;

public interface Game {
     public static final int level = 3;
    public void start();
    public void pause();
    public void toContinue();
    public void stop();
    public void play();
}//end

abstract class TicTacToeAbst implements Game{

    @Override
    public void start() {
        System.out.println("TicTacToe : start()");
    }

    @Override
    public void pause() {
    System.out.println("TicTacToe : pause()");

    }

    @Override
    public void play() {
    System.out.println("TicTacToe : play()");
    }

}
class TicTacToe extends TicTacToeAbst {
    @Override
    public void toContinue() {
        System.out.println("toContinue");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }
}
