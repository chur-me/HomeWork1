package home3.Proxy;

class VideoFile implements Video {
    private String name;

    VideoFile(String name) {
        this.name = name;
        System.out.println("Загружаем " + name + "... (10 сек)");
    }

    public void play() {
        System.out.println("Play " + name);
    }
}