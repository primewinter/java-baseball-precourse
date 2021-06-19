package service.impl;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

    }

    @Override
    public int[] compareInputWithTargetNumbers(int[] input, int[] targetNumbers) {
        int[] result = new int[2];
        for(int i = 0 ; i < targetNumbers.length ; i++) {

        }
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

    @Override
    public int getStrikes(int[] input, int[] targetNumbers) {
        int strikes = 0;

        if( input[0] == targetNumbers[0] ) strikes++;
        
        if( input[1] == targetNumbers[1] ) strikes++;
        
        if( input[2] == targetNumbers[2] ) strikes++;
        
        return strikes;
    }

    @Override
    public int getBalls(int[] input, int[] targetNumbers) {
        return 0;
    }

    


}
