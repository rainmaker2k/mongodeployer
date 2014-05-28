package me.kahwah.models;

import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public class Page extends RepositoryItem {
    private Map<String, Object> metadataFields;

    private List<ObjectId> componentPresentations;
}
