package com.tao.example.kafka;

import com.tao.example.kafka.producer.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZatKafkaApplicationTests {
	@Autowired
	private MsgProducer msgProducer;
	@Test
	public void contextLoads() {
		try {
			while (true){
				msgProducer.sendMessage();
					Thread.sleep(500L);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
