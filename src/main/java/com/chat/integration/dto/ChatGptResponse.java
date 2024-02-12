package com.chat.integration.dto;

import java.util.List;

public class ChatGptResponse {
	public ChatGptResponse() {
	}

    public ChatGptResponse(List<Choice> choices) {
		super();
		this.choices = choices;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	private List<Choice> choices;


}
