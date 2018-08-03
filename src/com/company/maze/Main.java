package com.company.maze;

public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze(25);
        //if it's inited inside the constructor than why no empty brackets call
        maze.print2d();
        System.out.println();
        System.out.println();
        maze.generateMaze(new int[]{0,0});
        maze.print2d();

    }
}

