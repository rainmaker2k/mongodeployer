package me.kahwah.dao;

import me.kahwah.models.Component;

import java.util.List;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public interface ComponentDAO {

    public Component findOneByQuery(String query);

    public List<Component> findByQuery(String query);

}
