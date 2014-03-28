package de.metalcon.musicstreamingserver.api.requests.registration;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;

import de.metalcon.domain.Muid;

/**
 * 
 * @author rpickhardt
 * 
 */
public class CreateRequestData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 47885665781764036L;

    String serializedMuid;

    byte[] musicFile;

    String metaData;

    /**
     * 
     * @return
     */
    public String getSerializedMuid() {
        return serializedMuid;
    }

    /**
     * retrieves and input stream of the transfered music file
     * 
     * @return
     */
    public InputStream getMusicFileInputStream() {
        return new ByteArrayInputStream(musicFile);
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
     */
    public CreateRequestData(
            Muid muid,
            byte[] musicFile,
            String metaData) {
        serializedMuid = muid.toString();
        this.musicFile = musicFile;
        this.metaData = metaData;
    }
}
