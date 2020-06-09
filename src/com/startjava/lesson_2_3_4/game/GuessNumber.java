package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int concealedNumber;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        System.out.println("Начало игры");
        System.out.println("Компьютер загадает число от 0 до 100 ");
        System.out.println("игроки по очереди будут пытаться угадать число, загаданное компьютером");
        System.out.println("У каждого игрока 10 попыток");
        concealedNumber = (int) (Math.random() * 100 + 1);
        for(int i = 0; i < 10; i++) {
            playerOne.setCount(i);
            inputNumber(playerOne);
            if(compare(playerOne)) {
                break;
            }
            if (i == 9) {
                System.out.println(playerOne.getName() + " у Вас закончились попытки");
                break;
            }
            playerTwo.setCount(i);
            inputNumber(playerTwo);
            if(compare(playerTwo)) {
                break;
            }
        }
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " назовите число: ");
        player.getEnteredNumbers()[player.getCount()] = scan.nextInt();
        System.out.println(player.getName() + " назвал число: " + player.getEnteredNumbers()[player.getCount()]);
    }

    private boolean compare(Player player) {
        int playerNumber = player.getEnteredNumbers()[player.getCount()];
        if(playerNumber > concealedNumber) {
            System.out.println("Ваше число " + playerNumber + " больше загаданного, " +
                    "у Вас осталось " + (10 - 1 - player.getCount()) + " попыток(ки, ка)");
        } else if(playerNumber < concealedNumber) {
            System.out.println("Ваше число " + playerNumber + " меньше загаданного, ");
            System.out.println("у Вас осталось " + (10 - 1 - player.getCount()) + " попыток(ки, ка)");
        } else {
            System.out.println(player.getName() + " Вы угадали, загаданное число " + concealedNumber +
                    " с(со) " + (player.getCount() + 1) + " попытки");
            return true;
        }
        return false;
    }

    public void outputEnteredNums(Player player) {
        System.out.print("Все числа, которые ввел " + player.getName() + " - ");
        int[] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(), player.getCount() + 1);
        System.out.println(Arrays.toString(enteredNumbers));
    }
}
