package com.tao.example.kafka.consumer;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tao.example.kafka.entity.msg.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by DELL on 2017/8/7.
 */
@Component
public class MsgConsumer {
    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "test1")
    public void processMessage(String content) {
        Message m = gson.fromJson(content, Message.class);
    }
}
