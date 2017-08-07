package com.tao.example.kafka.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tao.example.kafka.entity.msg.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * Created by DELL on 2017/8/7.
 */
@Component
public class MsgProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    private Gson gson = new GsonBuilder().create();

    public void sendMessage(){
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(UUID.randomUUID().toString());
        m.setSendTime(new Date());
        kafkaTemplate.send("test1", gson.toJson(m));
    }

}
