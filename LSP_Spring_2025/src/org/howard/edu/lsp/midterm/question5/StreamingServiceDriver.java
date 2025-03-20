package org.howard.edu.lsp.midterm.question5;

public class StreamingServiceDriver {
    public static void main(String[] args) {
        Streamable music = new Music("Still a Friend - Incognito");
        Streamable movie = new Movie("Avengers End Game");
        Streamable audiobook = new Audiobook("A Promised Land – Barack Obama");

        music.play();
        music.pause();
        music.stop();

        Movie movieWithRewind = (Movie) movie;
        movieWithRewind.rewind(30);

        Audiobook audiobookWithSpeed = (Audiobook) audiobook;
        audiobookWithSpeed.setPlaybackSpeed(1.5);

        Music musicWithPlaylist = (Music) music;
        musicWithPlaylist.addToPlaylist("Favorites");
    }
}
