package TwoStackExercise;

public class Stack {
    private int top = 0;
    private int[] array;

    public Stack(int size) {
        this.top = 0;
        this.array = new int[size];
    }

    public boolean push(int element) {
        if (array.length == top) {
            return false;
        }
        array[top] = element;
        top++;
        return true;
    }

    public int pop() {
        if (top != 0) {
            top--;
            return array[top];
        }
        return 0;
    }



}

