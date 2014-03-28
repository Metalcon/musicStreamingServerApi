package de.metalcon.musicstreamingserver.api.responses;

import de.metalcon.api.responses.SuccessResponse;

public class MusicStreamingCreateResponse extends SuccessResponse {

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
    public MusicStreamingCreateResponse(
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
