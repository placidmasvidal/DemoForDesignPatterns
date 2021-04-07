package com.example.demo.creational.factorymethod;

import com.example.demo.creational.factorymethod.message.Message;
import com.example.demo.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
