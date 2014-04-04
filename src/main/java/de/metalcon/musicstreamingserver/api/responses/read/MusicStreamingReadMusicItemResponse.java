package de.metalcon.musicstreamingserver.api.responses.read;

import java.io.InputStream;

import de.metalcon.musicstreamingserver.api.MusicData;
import de.metalcon.musicstreamingserver.api.responses.MusicStreamingResponse;

public class MusicStreamingReadMusicItemResponse extends MusicStreamingResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -5950670164507940683L;

    /**
     * Status message
     */
    protected String responseString;

    protected MusicData musicData;

    /**
     * create
     * 
     * @param responseString
     *            containing status messages about the create request
     */
    public MusicStreamingReadMusicItemResponse(
            String responseString,
            MusicData musicData) {
        super();
        this.musicData = musicData;
    }

    public InputStream getMusicInputStream() {
        return musicData.getMusicItemStream();
    }

    public String getResponseString() {
        return responseString;
    }

}
