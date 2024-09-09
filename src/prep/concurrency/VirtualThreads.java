package prep.concurrency;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreads {

    public static void fetchFiles(int idx, String path) {
        try {
            System.out.println(idx + "before " + Thread.currentThread());
            var lines = Files.lines(Paths.get(path)).count();
            System.out.println(idx + "after:: noOfLines=" + lines +" :: " + Thread.currentThread());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws Exception{
//        demoNormalThread();
        demoVirtualThread();
    }

    public static void demoNormalThread() throws InterruptedException {
        int MAX = 10000;
        var executorService = Executors.newFixedThreadPool(MAX);
        for (var i =0; i<MAX; i++) {
            var index = i;
            executorService.submit(() -> fetchFiles(index, "coding-playground.iml"));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
    }

    // Virtual threads are like Q-tips (ear buds) use and throw, there's no point in pooling them.
    // Virtual threads are non-blocking in nature, they don't wait for any I/O operation or Thread.sleep they
    // will leave it and come back by itself on compeletion of the task and continue it from there, it's like
    // unmounting when an I/O operation starting and mounting back when it ends.

    // When to use it? -> when we have mounting and unmounting candidate, we should use it.
    public static void demoVirtualThread() throws InterruptedException{
        int MAX = 10000;
        var executorService = Executors.newVirtualThreadPerTaskExecutor();
        for (var i =0; i<MAX; i++) {
            var index = i;
            executorService.submit(() -> fetchFiles(index, "coding-playground.iml"));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
    }
}
