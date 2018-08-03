package TwoStackExercise;

public class stackImplementation {

    public static void main(String[] args) {

        Stack stack1 = new Stack(3);
        Stack stack2 = new Stack(3);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(2);

        compareStacks(stack1, stack2);



    }
    public static boolean compareStacks(Stack stack1, Stack stack2){

        for (int i = 0; i <= 3  ; i++) {

            boolean areSame = stack1.pop() == stack2.pop();
//            int popped1 = stack1.pop();
//            int popped2 = stack2.pop();
//            boolean areSame = popped1 == popped2;

            if(areSame == false){
                System.out.println("They're not the same.");
                return false;
            }
        }
        return true;


    }


}


//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a string of brackets!!");
//        String str = scanner.nextLine();
//        Stack stack1 = new Stack(str.length());
//        for (int i = 0; i < str.length() ; i++) {
//            char c = str.charAt(i);
//            if(c == '(') {
//                stack1.push(c);
//            } else {
//                Character popChar = stack1.pop();
//                        if(popChar == null){
//                            System.out.println("MASSIVE ERROR!!");
//                            return;
//                        }
//            }
//
//
//        }
//        if(stack1.pop() != null) {
//            System.out.println("JUST A REGULAR ERROR!");
//
//        } else {
//            System.out.println("Clean brackets!!!!");
//        }
