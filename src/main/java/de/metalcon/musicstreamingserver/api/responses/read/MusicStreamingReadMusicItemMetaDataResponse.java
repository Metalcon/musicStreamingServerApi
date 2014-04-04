package de.metalcon.musicstreamingserver.api.responses.read;

import de.metalcon.musicstreamingserver.api.MusicData;
import de.metalcon.musicstreamingserver.api.responses.MusicStreamingResponse;

public class MusicStreamingReadMusicItemMetaDataResponse extends
        MusicStreamingResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -5950670164507940683L;

    protected MusicData musicData;

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
    public MusicStreamingReadMusicItemMetaDataResponse(
            String responseString,
            MusicData musicData) {
        super();
        this.responseString = responseString;
        this.musicData = musicData;
    }

    /**
     * @return resolved MUID
     */
    public String getResponseString() {
        return responseString;
    }

    public String getMetaData() {
        return musicData.getMetaData();
    }

}
