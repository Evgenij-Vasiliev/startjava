package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int concealedNumber;
    private int count;

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
        for (count = 0; count < 10; count++) {
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
        outputEnteredNums(playerOne);
        outputEnteredNums(playerTwo);
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " назовите число: ");
        player.getEnteredNumbers()[count] = scan.nextInt();
        System.out.println(player.getName() + " назвал число: " + player.getEnteredNumbers()[count]);
    }

    private boolean compare(Player player) {
        if(player.getEnteredNumbers()[count] != concealedNumber) {
            System.out.println("Вы ошиблись ");
            if(player.getEnteredNumbers()[count] > concealedNumber) {
                System.out.println("Ваше число " + player.getEnteredNumbers()[count] + " больше загаданного, " +
                        "у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
            } else if(player.getEnteredNumbers()[count] < concealedNumber) {
                System.out.println("Ваше число " + player.getEnteredNumbers()[count] + " меньше загаданного, ");
                System.out.println("у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
            }
        }
        else {
            System.out.println(player.getName() + " Вы угадали, загаданное число " + concealedNumber +
                    " с(со) " + (count + 1) + " попытки");
        }
        if (count == 9) {
            System.out.println(player.getName() + " у Вас закончились попытки");
        }
        return true;
    }

    private void outputEnteredNums(Player player) {
        System.out.print("Все числа, которые ввел " + player.getName() + " - ");
        int[] arrayCopy = Arrays.copyOf(player.getEnteredNumbers(), (count));
        System.out.println(Arrays.toString(arrayCopy));
    }
}
