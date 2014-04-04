package de.metalcon.musicstreamingserver.api.requests.read;

import de.metalcon.domain.Muid;
import de.metalcon.musicstreamingserver.api.MusicItemVersion;
import de.metalcon.musicstreamingserver.api.requests.MusicStreamingRequest;

/**
 * 
 * 
 */

/**
 * read a music item and its meta data stored
 * 
 * this request is also able to request the music item in a certain quality
 * 
 * @author rpickhardt
 * 
 */

public class MusicStreamingReadMusicItemRequest extends MusicStreamingRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8681544303758185318L;

    private String serializedMuid;

    private MusicItemVersion version;

    /**
     * 
     * @return the requested quality of the music file
     */
    public MusicItemVersion getVersion() {
        return version;
    }

    /**
     * 
     * @return the string serialization for the MUID of the music file
     */
    public String getSerializedMuid() {
        return serializedMuid;
    }

    /**
     * creates a reading request for a music file. there should be an
     * identifier and a version flag specifiying the quality
     * 
     * TODO: think about refactoring the term version to Quality
     * 
     * @param muid
     *            unique id for the file in the server
     * @param version
     *            enum MusicItemVersion specifying the quality of the requested
     *            item
     **/
    public MusicStreamingReadMusicItemRequest(
            Muid muid,
            MusicItemVersion version) {
        serializedMuid = muid.toString();
        this.version = version;
    }
}
