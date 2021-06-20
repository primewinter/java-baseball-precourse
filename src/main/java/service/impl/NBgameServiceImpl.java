package service.impl;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import service.NBgameService;

public class NBgameServiceImpl implements NBgameService {

    static Scanner sc;
    @Override
    public void startGame() {
        sc = new Scanner(System.in);
        
        int[] targetNumbers = generateTargetNumbers();

        guessTargetNumbers(targetNumbers);
        
        if( isRestarted() ) {
            startGame();
        }
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
    public void guessTargetNumbers(int[] targetNumbers) {
        
        System.out.print("숫자를 입력해주세요 : ");
        String str = sc.next();
        int[] input = convertToArr(str);

        int strikes = getStrikes(input, targetNumbers);
        int balls = getBalls(input, targetNumbers);        
        
        printResult(strikes, balls);
        
        if( strikes == 3 ) {
            return;
        }

        guessTargetNumbers(targetNumbers);
    }

    @Override
    public void printResult(int strikes, int balls) {
        
        StringBuilder sb = new StringBuilder();
        if( strikes > 0 ) {
            sb.append(strikes+" 스트라이크 ");
        }
        if( balls > 0 ) {
            sb.append(balls+" 볼");
        }
        if( strikes == 0 && balls == 0 ) {
            sb.append("낫싱");
        }

        System.out.println(sb);
    }

    @Override
    public boolean isRestarted() {
        
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        
        int num = sc.nextInt();
        
        if( num == 1 ) {
            return true;
        }

        if( num == 2 ) {
            return false;
        }

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
        
        int balls = 0;

        if( input[0] != targetNumbers[0] && ( input[0] == targetNumbers[1] || input[0] == targetNumbers[2] )) {
            balls++;
        }
        if( input[1] != targetNumbers[1] && ( input[1] == targetNumbers[0] || input[1] == targetNumbers[2] )) {
            balls++;
        }
        if( input[2] != targetNumbers[2] && ( input[2] == targetNumbers[0] || input[2] == targetNumbers[1] )) {
            balls++;
        }

        return balls;
    }

    private int[] convertToArr(String str) {
        int[] arr = new int[str.length()];
        for(int i = 0 ; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        return arr;
    }
    


}
