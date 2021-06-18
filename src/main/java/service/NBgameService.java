package service;

public interface NBgameService {

    public void startGame();

    public int[] generateTargetNumbers();

    public void pingpong(int[] targetNumbers);

    public int[] compareInputWithTargetNumbers(int[] input, int[] targetNumbers);

    public void printResult();

    public boolean isRestarted();
}
