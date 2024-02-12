package com.chat.integration.dto;

public class Choice {
	
	public Choice() {
	}
	public Choice(int index, Message message) {
		super();
		this.index = index;
		this.message = message;
	}
	private int index;
    public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	private Message message;
    
}
