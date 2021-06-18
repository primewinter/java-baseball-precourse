package service.impl;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import service.NBgameService;

public class NBgameServiceImpl implements NBgameService {

    @Override
    public void startGame() {
        // TODO Auto-generated method stub

    }

    @Override
    public int[] generateTargetNumbers() {
        Set<Integer> set = new LinkedHashSet<>();
        Random random = new Random();

        while (set.size() < 3) {
            int number = random.nextInt(9) + 1;
            set.add(number);
        }

        int[] targetNumber = new int[3];
        int i = 0;

        for (int num : set) {
            targetNumber[i] = num;
            i++;
        }

        return targetNumber;
    }

    @Override
    public void pingpong(int[] targetNumbers) {
        // TODO Auto-generated method stub

    }

    @Override
    public int[] compareInputWithTargetNumbers(int[] input, int[] targetNumbers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printResult() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isRestarted() {
        // TODO Auto-generated method stub
        return false;
    }

}
