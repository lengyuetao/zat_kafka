package com.tao.example.kafka.dao;

import com.tao.example.kafka.entity.FileInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by DELL on 2017/7/27.
 */
public interface FileInfoDao extends MongoRepository<FileInfo,String>{

    @Query("{\"id\":?0}")
    FileInfo findById(String id);
}
