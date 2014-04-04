package de.metalcon.musicstreamingserver.api.requests.update;

import de.metalcon.domain.Muid;
import de.metalcon.musicstreamingserver.api.requests.MusicStreamingRequest;

/**
 * request: Store a new mp3 file in the music streaming server
 * 
 * @author rpickhardt
 * 
 */
public class MusicStreamingUpdateRequest extends MusicStreamingRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8681544303758185318L;

    String serializedMuid;

    String metaData;

    /**
     * 
     * @return
     */
    public String getSerializedMuid() {
        return serializedMuid;
    }

    /**
     * retrieves the metadata of the mp3 file that is transfered in this obejct
     * 
     * @return
     */
    public String getMetaData() {
        return metaData;
    }

    /**
     * creates a data transfere object for a music file. there should be an
     * identifier a file as a byte array and a string of metadata be given
     * 
     * @param muid
     *            unique id for the file in the server
     * @param musicFile
     *            bytearray containing the music file (e.g. mp3)
     * @param metaData
     *            String containing metadata to be stored in the server. The
     *            metadata should be given as a json string
     * **/
    public MusicStreamingUpdateRequest(
            Muid muid,
            String metaData) {
        serializedMuid = muid.toString();
        this.metaData = metaData;
    }
}
