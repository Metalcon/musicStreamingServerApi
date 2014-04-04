package de.metalcon.musicstreamingserver.api.responses.read;

import java.io.InputStream;

import de.metalcon.musicstreamingserver.api.MusicData;

public class MusicStreamingReadMusicItemResponse extends
        MusicStreamingReadMusicItemMetaDataResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -5950670164507940683L;

    /**
     * Status message
     */
    protected String responseString;

    /**
     * create
     * 
     * @param responseString
     *            containing status messages about the create request
     */
    public MusicStreamingReadMusicItemResponse(
            String responseString,
            MusicData musicData) {
        super(responseString, musicData);
    }

    public InputStream getMusicInputStream() {
        return musicData.getMusicItemStream();
    }

}
