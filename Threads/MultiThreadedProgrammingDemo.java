// Simulates file downloading using multithreading
class FileDownload implements Runnable {
    private String fileName;

    public FileDownload(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Starting download: " + fileName);
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000); // Simulating download delay (1s)
                System.out.println(fileName + " - " + (i * 20) + "% downloaded");
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
        System.out.println("Completed download: " + fileName);
    }
}

public class MultiThreadedProgrammingDemo {
    public static void main(String[] args) {
        Thread file1 = new Thread(new FileDownload("file1.zip"));
        Thread file2 = new Thread(new FileDownload("file2.mp4"));
        Thread file3 = new Thread(new FileDownload("file3.pdf"));

        file1.start();
        file2.start();
        file3.start();
    }
}
