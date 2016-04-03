/**
 * Encapsulates the data of a YouTube video.
 *
 * DO NOT MODIFY THIS CLASS!!
 *
 * @author sburton
 */

public class YouTubeAdapter implements SocialMediaEntry {
    YouTubeVideo myVideo;

    public YouTubeAdapter() {
    myVideo = new YouTubeVideo();
    }

    public YouTubeAdapter(String author, String title, String description) {
    myVideo = new YouTubeVideo(author, title, description);
    }

    @Override
    public String getUser() {
        return myVideo.getAuthor();
    }

    @Override
    public String getPostText() {
        return myVideo.getTitle() + myVideo.getDescription();
    }
}
