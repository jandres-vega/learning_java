package com.poo.laboratorio.box;

public class Box_01 {

    public int height;
    public int width;
    public int depth;

    public Box_01(){}
    public Box_01(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int calculateVolume(){
        return height * width * depth;
    }
}
