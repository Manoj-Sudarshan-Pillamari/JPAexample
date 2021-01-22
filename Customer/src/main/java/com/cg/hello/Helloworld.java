package com.cg.hello;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helloworld")

public class Helloworld {
	
	public Helloworld(int messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}
	@Id
	private int messageId;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
	
	
}
