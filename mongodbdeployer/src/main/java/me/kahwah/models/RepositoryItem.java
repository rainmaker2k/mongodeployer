package me.kahwah.models;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public abstract class RepositoryItem {

    private long publicationId;
    private long itemId;

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
}
