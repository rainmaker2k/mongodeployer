package me.kahwah.dao.models;

import me.kahwah.dd4t.contentmodel.impl.MultimediaImpl;

import java.io.InputStream;

/**
 * Created by rainmaker2k on 18/07/14.
 */
public class Binary extends MultimediaImpl {

    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
