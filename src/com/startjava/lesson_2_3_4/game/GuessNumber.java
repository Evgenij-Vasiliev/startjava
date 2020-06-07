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
        for(int i = 0 ; i < 10; i++) {
            inputNumber(playerOne);
            compare(playerOne);
            if(compare(playerOne)) {
                break;
            }
            inputNumber(playerTwo);
            compare(playerTwo);
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
        if(player.getEnteredNumbers()[player.getCount()] != concealedNumber) {
            System.out.println("Вы ошиблись ");
            if(player.getEnteredNumbers()[player.getCount()] > concealedNumber) {
                System.out.println("Ваше число " + player.getEnteredNumbers()[player.getCount()] + " больше загаданного, " +
                        "у Вас осталось " + (10 - 1 - player.getCount()) + " попыток(ки, ка)");
            } else if(player.getEnteredNumbers()[player.getCount()] < concealedNumber) {
                System.out.println("Ваше число " + player.getEnteredNumbers()[player.getCount()] + " меньше загаданного, ");
                System.out.println("у Вас осталось " + (10 - 1 - player.getCount()) + " попыток(ки, ка)");
            }
        }else {
            System.out.println(player.getName() + " Вы угадали, загаданное число " + concealedNumber +
                    " с(со) " + (player.getCount() + 1) + " попытки");

        }
        if (player.getCount() == 9) {
            System.out.println(player.getName() + " у Вас закончились попытки");
        }
        return true;
    }

    public void outputEnteredNums(Player player) {
        System.out.print("Все числа, которые ввел " + player.getName() + " - ");
        int[] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(), player.getCount());
        System.out.println(Arrays.toString(enteredNumbers));
    }
}
