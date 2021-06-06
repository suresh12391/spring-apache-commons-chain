package com.suresh.chain.core.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.suresh.chain.client.DummySessionClient;
import com.suresh.chain.core.DummyConstants;

public class FirstCommand implements Command {

	private static Logger logger = LogManager.getLogger(FirstCommand.class);

	private DummySessionClient dummySessionClient;

	public FirstCommand(DummySessionClient dummySessionClient) {
		this.dummySessionClient = dummySessionClient;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean execute(Context context) throws Exception {
		logger.info("Primary comando");
		context.put(DummyConstants.SESSION, dummySessionClient.getSession());
		return false;
	}
}
