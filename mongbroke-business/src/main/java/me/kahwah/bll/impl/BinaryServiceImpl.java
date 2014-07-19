package me.kahwah.bll.impl;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import me.kahwah.bll.BinaryService;
import me.kahwah.dao.BinaryDAO;
import me.kahwah.dao.models.Binary;

/**
 * Created by rainmaker2k on 18/07/14.
 */
public class BinaryServiceImpl implements BinaryService {
    private BinaryDAO binaryDAO;
    private DB db;

    @Override
    public void save(Binary binary) {
        binaryDAO.save(binary);

        GridFS gridFS = new GridFS(db);

        GridFSInputFile file = gridFS.createFile(binary.getInputStream());
        file.setFilename(binary.getFileName());
        file.save();
    }

    public BinaryDAO getBinaryDAO() {
        return binaryDAO;
    }

    public void setBinaryDAO(BinaryDAO binaryDAO) {
        this.binaryDAO = binaryDAO;
    }

}
