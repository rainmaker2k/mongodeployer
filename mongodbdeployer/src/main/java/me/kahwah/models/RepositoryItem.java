package me.kahwah.models;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public abstract class RepositoryItem {

    private long publicationId;
    private long itemId;
    private String title;

    public long getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(long publicationId) {
        this.publicationId = publicationId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
