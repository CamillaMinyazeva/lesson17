import java.util.Random;


public class Main {
    public static volatile Object obj = new Object();

    public static void main(String args[]) throws InterruptedException {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + new Random().nextInt(100);
        }

            Thread thread3 = new Thread(() -> {
                for (int i = 0; i < array.length; i++) {
                    if (i % 3 == 0) {
                        synchronized (obj) {
                            array[i]++;
                        }
                    }

                }
            });
            thread3.start();

            Thread thread5 = new Thread(() -> {
                for (int i = 0; i < array.length; i++) {
                    if (i % 5 == 0) {
                        synchronized (obj) {
                            array[i]++;
                        }
                    }

                }
            });
            thread5.start();

            Thread thread7 = new Thread(() -> {
                for (int i = 0; i < array.length; i++) {
                    if (i % 7 == 0) {
                        synchronized (obj) {
                            array[i]++;
                        }
                    }

                }
            });
            thread7.start();

            Thread thread19 = new Thread(() -> {
                for (int i = 0; i < array.length; i++) {
                    if (i % 19 == 0) {
                        synchronized (obj) {
                            array[i]++;
                        }
                    }

                }
            });
            thread19.start();

    }
    }

