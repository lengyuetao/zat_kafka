package com.tao.example.kafka.service.impl;

import com.tao.example.kafka.dao.FileInfoDao;
import com.tao.example.kafka.entity.FileInfo;
import com.tao.example.kafka.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 2017/7/27.
 */
@Service
public class FileInfoServiceImpl implements FileInfoService {

    @Autowired
    private FileInfoDao fileInfoDao;

    @Override
    public void save(FileInfo fileInfo) {
        fileInfoDao.save(fileInfo);
    }

    @Override
    public FileInfo findById(String id) {
        return fileInfoDao.findById(id);
    }
}
