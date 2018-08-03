package com.company.maze;

public class mazeGenerator {
    public static final int WALL = 1;

    public static void main(String[] args) {
//        $size = 25;
        int size = 25;

        //$maze = array_fill(0, $size, array_fill(0, $size, '#'));
        int[][] maze = new int[size][size];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = WALL;

            }

        }

        //print2d(generateMaze($maze, [0, 0]));
        print2D(generateMaze(maze, new int[]{0, 0}));

    }

    public static int[][] generateMaze(int[][] maze, int[] point) {
        return maze;
    }

    public static void print2D(int[][] maze) {

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                int value = maze[i][j];
                //ternary operator
                System.out.print((value == WALL ? "#" : ".") + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }


}

