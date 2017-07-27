package com.tao.example.kafka.service;

import com.tao.example.kafka.entity.FileInfo;

/**
 * Created by DELL on 2017/7/27.
 */
public interface FileInfoService {

    void save(FileInfo fileInfo);

    FileInfo findById(String id);
}
