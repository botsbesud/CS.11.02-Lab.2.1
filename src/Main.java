/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: thomasChen
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int alpha, int beta){
        return alpha + beta;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String text) {
        return text + text + text;
        // OR is ||
        // AND is &&
    }
    // 6. half
    public static double half(double num) {
        return num/2;
    }
    // 7. roundPositiveValueToNearestInteger - use CASTING
    public static double roundPositiveValueToNearestInteger(double num) {
        return (int)(num + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double num) {
        return (int)(num - 0.5);
    }
}
