package de.metalcon.musicstreamingserver.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

/**
 * music data wrapper holding the music item stream and the meta data stored
 * 
 * @author sebschlicht
 * 
 */
public class MusicData {

    /**
     * stream of the music item
     */
    private byte[] musicItem;

    /**
     * meta data stored for the music item
     */
    private final String metaData;

    /**
     * create a new music data wrapper
     * 
     * @param musicItemStream
     *            stream of the music item
     * @param metaData
     *            meta data stored for the music item
     */
    public MusicData(
            final InputStream musicItemStream,
            final String metaData) {
        try {
            musicItem = IOUtils.toByteArray(musicItemStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            musicItem = null;
        }
        this.metaData = metaData;
    }

    /**
     * @return stream of the music item
     */
    public InputStream getMusicItemStream() {
        return new ByteArrayInputStream(musicItem);
    }

    /**
     * @return meta data stored for the music item
     */
    public String getMetaData() {
        return metaData;
    }

}
