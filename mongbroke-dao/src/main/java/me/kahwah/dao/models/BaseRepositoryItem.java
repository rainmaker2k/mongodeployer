package me.kahwah.dao.models;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public abstract class BaseRepositoryItem implements RepositoryItem {

    private long publicationId;
    private long itemId;
    private String title;

    public long getPublicationId() {
        return publicationId;
    }

    @Override
    public void setPublicationId(long publicationId) {
        this.publicationId = publicationId;
    }

    @Override
    public long getItemId() {
        return itemId;
    }

    @Override
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
