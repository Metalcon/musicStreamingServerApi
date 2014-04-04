package de.metalcon.musicstreamingserver.api.responses.read;

import java.util.ArrayList;
import java.util.Arrays;

import de.metalcon.musicstreamingserver.api.responses.MusicStreamingResponse;

public class MusicStreamingReadMusicItemMetaDataResponse extends
        MusicStreamingResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -5950670164507940683L;

    protected String[] metaDataList;

    /**
     * Status message
     */
    protected String responseString;

    public MusicStreamingReadMusicItemMetaDataResponse(
            String responseString,
            String[] musicMetaDatalist) {
        super();
        this.responseString = responseString;
        metaDataList = musicMetaDatalist;
    }

    /**
     * @return resolved MUID
     */
    public String getResponseString() {
        return responseString;
    }

    public ArrayList<String> getMetaDataList() {
        return new ArrayList<String>(Arrays.asList(metaDataList));
    }
}
