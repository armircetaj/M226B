import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Esercizio15b {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(500);
        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 100; i++) {
            exec.submit(() -> b.deposit(400));
            exec.submit(() -> b.withdraw(100));
            exec.submit(() -> b.withdraw(200));
            exec.submit(() -> b.withdraw(100));
        }
        exec.shutdown();
        System.out.println(b.getBalance());
    }

}
