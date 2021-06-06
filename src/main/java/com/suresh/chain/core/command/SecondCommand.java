package com.suresh.chain.core.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.suresh.chain.client.DummyOneClient;
import com.suresh.chain.core.DummyConstants;
import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.ChainResponse;
import com.suresh.chain.domain.DummySession;

public class SecondCommand implements Command {

	private static Logger logger = LogManager.getLogger(SecondCommand.class);

	private DummyOneClient dummyOneClient;

	public SecondCommand(DummyOneClient dummyOneClient) {
		this.dummyOneClient = dummyOneClient;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean execute(Context context) throws Exception {
		logger.info("Secondary comando");
		DummySession session = (DummySession) context.get(DummyConstants.SESSION);
		ChainRequest request = (ChainRequest) context.get(DummyConstants.CHAIN_REQUEST);
		ChainResponse chainResponse = new ChainResponse();
		chainResponse.setOutputOne(dummyOneClient.getOne(session, request));
		context.put(DummyConstants.CHAIN_RESPONSE, chainResponse);
		return false;
	}
}
