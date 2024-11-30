import org.w3c.dom.ls.LSOutput;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Monique Siu
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        //1. add
        int sum = add(5,7);
        System.out.println(sum);

        //2. add
        int sum2 = add(5,7,6,6);
        System.out.println("Sum of four numbers = :" + sum2);

        //3. morningGreeting
        String morningGreetingName = morningGreeting("Toby Fox");
        System.out.println(morningGreetingName);

        //4. afternoonGreeting
        String afternoonGreetingName = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingName);

        //5. triple
        String userInput = triple("oohbaby");
        System.out.println(userInput);

        //6. half
        double sum3 = half(19);
        System.out.println(sum3);

        //7. roundPositiveValueToNearestInteger
        System.out.println(roundPositiveValue(8.5));

        //8. roundNegativeValueToNearestInteger
        double negativeValue = -4.5;
        int roundedNegative = roundNegativeValueToNearestInteger(negativeValue);
        System.out.println("Rounded negative value: " + roundedNegative);


    }

//Write a method called add that takes two integers, adds them together,
// and returns the result. Below is an example of a call to the add method.
    // 1. add
    public static int add(int a , int b){
        return a+b;
    }
    // 2. add
    public static int add(int a, int b, int c , int d){
        return add(add(a,b),add(c,d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String input){
        return input + input + input;
    }
    // 6. half
    public static double half(int a){
        return a/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValue(double roundPositiveValue) {
        return (int) Math.round(roundPositiveValue);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double roundNegative) {

        if(roundNegative < 0){
            if (roundNegative % 1 == -0.5){
                return (int) (roundNegative -0.5);
            }
        }

        return (int) Math.round(roundNegative);
    }
}
