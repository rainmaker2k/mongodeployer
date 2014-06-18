package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by rainmaker2k on 17-06-14.
 */
@Root(name = "Publication")
public class Publication {

    @Attribute(name = "Id")
    private String id;

    @Attribute(name = "Title")
    private String title;

    @Attribute(name = "Key")
    private String key;

    @Attribute(name = "PublicationPath")
    private String publicationPath;

    @Attribute(name = "PublicationUrl")
    private String publicationUrl;

    @Attribute(name = "MultimediaPath")
    private String multimediaPath;

    @Attribute(name = "MultimediaUrl")
    private String multimediaUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPublicationPath() {
        return publicationPath;
    }

    public void setPublicationPath(String publicationPath) {
        this.publicationPath = publicationPath;
    }

    public String getPublicationUrl() {
        return publicationUrl;
    }

    public void setPublicationUrl(String publicationUrl) {
        this.publicationUrl = publicationUrl;
    }

    public String getMultimediaPath() {
        return multimediaPath;
    }

    public void setMultimediaPath(String multimediaPath) {
        this.multimediaPath = multimediaPath;
    }

    public String getMultimediaUrl() {
        return multimediaUrl;
    }

    public void setMultimediaUrl(String multimediaUrl) {
        this.multimediaUrl = multimediaUrl;
    }
}
