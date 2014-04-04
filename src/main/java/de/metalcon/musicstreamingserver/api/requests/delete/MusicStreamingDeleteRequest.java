package de.metalcon.musicstreamingserver.api.requests.delete;

import de.metalcon.domain.Muid;
import de.metalcon.musicstreamingserver.api.requests.MusicStreamingRequest;

/**
 * request: Store a new mp3 file in the music streaming server
 * 
 * @author rpickhardt
 * 
 */
public class MusicStreamingDeleteRequest extends MusicStreamingRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8681544303758185318L;

    private String serializedMuid;

    /**
     * creates a data transfere object for a music file. there should be an
     * identifier a file as a byte array and a string of metadata be given
     * 
     * @param muid
     *            unique id for the file in the server
     * 
     **/
    public MusicStreamingDeleteRequest(
            Muid muid) {
        serializedMuid = muid.toString();
    }

    public String getSerializedMuid() {
        return serializedMuid;
    }
}
