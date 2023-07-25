import java.util.ArrayList;
import java.util.List;

class TableGenerator implements Runnable {
    @Override
    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class PrimeNumber implements Runnable {
    private int count;

    public PrimeNumber(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " prime numbers:");
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2;
        while (primeNumbers.size() < count) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }

        for (int prime : primeNumbers) {
            System.out.println(prime);
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class MainThread {
    public static void main(String[] args) {
    
       System.out.println("\nName : ANGELA MATHEW");
	System.out.println("Reg.No : SJC22MCA-2005");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Course Name : OOPS LAB");
	System.out.println("Date : 22 JUNE 2023");
	System.out.println("\n-------------------------------------------------------------\n");
    
        Thread multiplicationTableThread = new Thread(new TableGenerator());
        Thread primeNumberThread = new Thread(new PrimeNumber(10));

        multiplicationTableThread.start();
        primeNumberThread.start();
    }
}

