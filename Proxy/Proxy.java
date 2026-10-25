package home3.Proxy;

public class Proxy {
    public static void main(String[] args) {
        Video v1 = new VideoProxy("film1.mp4");
        Video v2 = new VideoProxy("film2.mp4");
        Video v3 = new VideoProxy("film3.mp4");

        v2.play();

        System.out.println("\nТут уже без загрузки");
        v2.play();
    }
}
