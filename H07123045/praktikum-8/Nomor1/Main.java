package Nomor1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static int jumlahData = 4;
    private static int jumlahBot = 3;
    private static int berhasil;

    public static void main(String[] args) {
        System.out.println(String.format("Start Load %d data", jumlahData));

        ExecutorService executor = Executors.newFixedThreadPool(jumlahBot);
        ExecutorService executorPribadi = Executors.newSingleThreadExecutor(); //untuk UiThread.
        UiThread ui = new UiThread(); 

        executorPribadi.execute(ui);

        for (int i = 1; i <= jumlahData; i++) { 
            Bot bot = new Bot();
            executor.execute(bot);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {}
        ui.stopProgram(); 
        executorPribadi.shutdown();

        while(!executorPribadi.isTerminated()) {}

        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + UiThread.jumlah + "s");

        if (berhasil == jumlahData) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            int gagal = jumlahData - berhasil;
            System.out.println(String.format("%d Data Successfully loaded & %d Data failed to load", berhasil, gagal));
        }
    }

    public static synchronized void dataBerhasil() {
        berhasil++;
    }
}

class Bot extends Thread {
    public void run() {
        int waktuEksesuki = TaskTimeHelper.getTaskExecutionTime(); 
        if (waktuEksesuki < 5) {
            try {
                Thread.sleep(waktuEksesuki * 1000);
                Main.dataBerhasil();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Request Timeout");
        }
    }
}

class UiThread extends Thread {
    private boolean yes = true;
    public static int jumlah;

    @Override
    public void run() {
        while (yes) { // terus berjalan selama variabel yes bernilai true.
            try {
                jumlah++;
                Thread.sleep(1000);
                System.out.println(String.format("Loading... (%ds)", jumlah));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopProgram(){
        yes = false;
    }
}

class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1;
    }
}