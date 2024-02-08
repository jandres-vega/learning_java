package com.poo.test;
import com.poo.Box_01;

public class TestBox {
    public static void main(String[] args) {
        Box_01 boxOne = new Box_01();

        boxOne.height = 3;
        boxOne.width = 5;
        boxOne.depth = 10;

        System.out.println("Resultado del volumen de la caja 1: " + boxOne.calculateVolume());

        Box_01 boxTwo = new Box_01(6,4,3);

        System.out.println("REsultado del volumn de la caja 2: " + boxTwo.calculateVolume());
    }
}
