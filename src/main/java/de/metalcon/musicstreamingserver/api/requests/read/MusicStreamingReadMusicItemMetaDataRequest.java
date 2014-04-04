package de.metalcon.musicstreamingserver.api.requests.read;

import java.util.ArrayList;

import de.metalcon.domain.Muid;
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

public class MusicStreamingReadMusicItemMetaDataRequest extends
        MusicStreamingRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8681544303758185318L;

    private String[] serializedMuids;

    /**
     * 
     * @return the string serialization for the MUID of the music file
     */
    public String[] getSerializedMuid() {
        return serializedMuids;
    }

    /**
     * creates a reading request for music meta data for several files.
     * 
     * @param muids
     *            unique id for the files for which metadata is being requested
     **/
    public MusicStreamingReadMusicItemMetaDataRequest(
            ArrayList<Muid> muids) {
        serializedMuids = new String[muids.size()];
        int pos = -1;
        for (Muid muid : muids) {
            serializedMuids[++pos] = muid.toString();
        }
    }
}
