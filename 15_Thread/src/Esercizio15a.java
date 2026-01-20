import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Esercizio15a {
    public static void simulateBigFileDownload() {
        System.out.println("Inizio simulazione download file >");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fine download file");
    }
    public static void timeCounter() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        simulateBigFileDownload();
        timeCounter();
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(Esercizio15a::simulateBigFileDownload);
        exec.submit(Esercizio15a::timeCounter);
        exec.shutdown();
    }
}
