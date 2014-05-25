package me.kahwah.dao;

import me.kahwah.models.Page;

import java.util.List;

/**
 * Created by rainmaker2k on 24/05/14.
 */
public interface PageDAO {

    public Page findOneByQuery(String query);

    public List<Page> findByQuery();

    public Page findByUrl(String url);
}
