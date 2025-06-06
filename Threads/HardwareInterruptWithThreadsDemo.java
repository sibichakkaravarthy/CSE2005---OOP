class FileDownload implements Runnable {
    private String fileName;
    private volatile boolean interrupted = false;

    public FileDownload(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Starting download: " + fileName);
        try {
            for (int i = 1; i <= 5; i++) {
                if (interrupted) 
                    break;
                Thread.sleep(1000);
                System.out.println(fileName + " - " + (i * 20) + "% downloaded");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread sleep interrupted: " + fileName);
        }
        if (interrupted) {
            System.out.println("Download interrupted manually: " + fileName);
        } else {
            System.out.println("Completed download: " + fileName);
        }
    }

    public void interruptDownload() {
        interrupted = true;
    }
}

public class HardwareInterruptWithThreadsDemo {
    public static void main(String[] args) {
        FileDownload fileDownload = new FileDownload("file1.zip");
        Thread downloadThread = new Thread(fileDownload);
        downloadThread.start();

        // Shutdown hook to handle Ctrl+C
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nShutdown detected (Ctrl+C pressed).");
            fileDownload.interruptDownload(); // Set interrupt flag
            try {
                downloadThread.join(); // Wait for thread to finish
            } catch (InterruptedException e) {
                System.out.println("Shutdown interrupted.");
            }
        }));
    }
}
