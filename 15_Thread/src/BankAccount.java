import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.*;

public class BankAccount {
   private AtomicInteger balance = new AtomicInteger(0);
   public void deposit(int amount) {
       balance.addAndGet(amount);
   }
   public void withdraw(int amount) {
       balance.addAndGet(-amount);
   }
   public int getBalance() {
       return balance.get();
   }
   public void setBalance(int value) {
       this.balance.set(value);
   }
}
