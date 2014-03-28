package de.metalcon.musicstreamingserver.api.requests;

import de.metalcon.musicstreamingserver.api.requests.registration.CreateRequestData;

/**
 * request: Store a new mp3 file in the music streaming server
 * 
 * @author rpickhardt
 * 
 */
public class MusicStreamingCreateRequest extends MusicStreamingRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8681544303758185318L;

    private CreateRequestData createRequestData;

    /**
     * TODO: what happens if the id is already in the server? will the file be
     * overwritten?
     * 
     * @param createRequestData
     */
    public MusicStreamingCreateRequest(
            CreateRequestData createRequestData) {
        if (createRequestData == null) {
            throw new IllegalArgumentException("url data must not be null");
        }
        this.createRequestData = createRequestData;
    }

    /**
     * 
     * @return data transferobject of the create request containing an unique
     *         identifier, bytearray with the file and a json string of metadata
     */
    public CreateRequestData geCreateRequestData() {
        return createRequestData;
    }
}
