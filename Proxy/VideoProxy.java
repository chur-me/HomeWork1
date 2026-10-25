package home3.Proxy;

class VideoProxy implements Video {
    private String name;
    private VideoFile real;

    VideoProxy(String name) {
        this.name = name;
    }

    public void play() {
        if (real == null) {
            real = new VideoFile(name);
        }
        real.play();
    }
}