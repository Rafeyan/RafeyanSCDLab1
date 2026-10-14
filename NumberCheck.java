package lab;
public class NumberCheck {

    
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    
    public boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    public static void main(String[] args) {

        NumberCheck checker = new NumberCheck();

        int number = 7;    

        if (checker.isEven(number)) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }

        if (checker.isPrime(number)) {
            System.out.println(number + " is PRIME");
        } else {
            System.out.println(number + " is NOT PRIME");
        }
    }
}