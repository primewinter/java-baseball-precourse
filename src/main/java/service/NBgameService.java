package service;

public interface NBgameService {

    public void startGame();

    public int[] generateTargetNumbers();

    public void guessTargetNumbers(int[] targetNumbers);

    public int getStrikes(int[] input, int[] targetNumbers);

    public int getBalls(int[] input, int[] targetNumbers);

    public void printResult(int strikes, int balls);

    public boolean isRestarted();
}
