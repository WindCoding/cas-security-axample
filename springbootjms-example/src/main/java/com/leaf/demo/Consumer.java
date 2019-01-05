package com.leaf.demo;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination="Java_MQ")
	public void readMessage(String text){
		System.out.println("接收到消息:"+text);
	}
	
	@JmsListener(destination="Leaf_MQ")
	public void readMapMessage(Map map){
		System.out.println(map);		
	}
	
}
