package interfaces;

interface Media {
    // Abstract methods define what to do but not how to do it
    void play();
    void stop();

    // Default method provides a common implementation that can be overridden
    default void pause() {
        System.out.println("Playback paused.");
    }

    // Static method belongs to the interface and provides a common functionality across all implementations
    static void resetAll() {
        System.out.println("All media have been reset to default settings.");
    }
}

class Music implements Media {
    public void play() {
        System.out.println("Music is playing.");
    }
    public void stop() {
        System.out.println("Music stopped.");
    }
    public void pause() {
        System.out.println("Music paused. Ready to resume.");
    }
}

class Video implements Media {
    public void play() {
        System.out.println("Video is playing.");
    }
    public void stop() {
        System.out.println("Video stopped.");
    }
   /* public void pause() {
        System.out.println("Video paused. Buffering...");
    }*/
}

public class MediaController {
    public static void main(String[] args) {
        Media music = new Music();
        music.play();
        music.pause();
        music.stop();

        Media video = new Video();
        video.play();
        video.pause();
        video.stop();

        Media.resetAll(); // Call to static method in the interface
        
    }
}
