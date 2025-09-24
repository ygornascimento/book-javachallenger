public class LogicalOperators {
    public static void main(String args[]) {
        int bartAge = 10;
        double bartMoney = 20;

        if (bartAge >= 12 && bartMoney++ >= 10) {
            System.out.println("Bart can go to the cinema.");
        }
        
        System.out.println(bartMoney);
    }
}
