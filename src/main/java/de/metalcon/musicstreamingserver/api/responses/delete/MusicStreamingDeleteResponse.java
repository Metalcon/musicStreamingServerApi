package de.metalcon.musicstreamingserver.api.responses.delete;

import de.metalcon.musicstreamingserver.api.responses.MusicStreamingResponse;

public class MusicStreamingDeleteResponse extends MusicStreamingResponse {

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
    public MusicStreamingDeleteResponse(
            String responseString) {
        super();
        this.responseString = responseString;
    }

    /**
     * @return resolved MUID
     */
    public String getResponseString() {
        return responseString;
    }

}
