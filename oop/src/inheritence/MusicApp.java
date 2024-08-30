package inheritence;

class Playlist {
    Song track;
    
    void playSong(Song banger) {
        track = banger;
        System.out.println("Now Playing: " + track.title);
        System.out.println("Artist: " + track.artist);
    }
}

class Song {
    String title;
    String artist;
}

public class MusicApp {
    public static void main(String[] args) {
        // Create a catchy song
        Song hitSong = new Song();
        hitSong.title = "Kolaveri di";
        hitSong.artist = "Dhanush";

        // Create a playlist and add the song
        Playlist myJams = new Playlist();
        myJams.track = hitSong;

        // Let's play that tune!
        myJams.playSong(hitSong);
        

        // The song is also on your friend's playlist
        System.out.println("This song is fire! It's on my playlist!");
        System.out.println("Song: " + hitSong.title + " by " + hitSong.artist);
    }
}