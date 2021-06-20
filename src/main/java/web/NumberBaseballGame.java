package web;

import service.impl.NBgameServiceImpl;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NBgameServiceImpl gameService = new NBgameServiceImpl();

        gameService.startGame();
    }
}
