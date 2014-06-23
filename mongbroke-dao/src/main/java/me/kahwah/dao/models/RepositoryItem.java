package me.kahwah.dao.models;

/**
 * Created by rainmaker2k on 19/06/14.
 */
public interface RepositoryItem {

    long getPublicationId();

    void setPublicationId(long publicationId);

    long getItemId();

    void setItemId(long itemId);

    String getTitle();

    void setTitle(String title);
}
