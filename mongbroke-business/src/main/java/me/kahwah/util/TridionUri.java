package me.kahwah.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rainmaker2k on 21/06/14.
 */
public class TridionUri {

    private int itemId;
    private int publicationId;
    private int typeId;

    public TridionUri(String tcmUri) {
        Pattern pattern = Pattern.compile("tcm:(\\d+)-(\\d+)(?!-(\\d+))?");
        Matcher matcher = pattern.matcher(tcmUri);

        if (matcher.find()) {
            String publicationId = matcher.group(1);
            this.publicationId = Integer.parseInt(publicationId);

            String itemId = matcher.group(2);
            this.itemId = Integer.parseInt(itemId);

            if (matcher.group(3) != null) {
                String typeId = matcher.group(3);
                this.typeId = Integer.parseInt(typeId);
            }
        }
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(int publicationId) {
        this.publicationId = publicationId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
