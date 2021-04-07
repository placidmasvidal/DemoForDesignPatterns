package com.example.demo.creational.factorymethod;

import com.example.demo.creational.factorymethod.message.JSONMessage;
import com.example.demo.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
