package com.suresh.chain.core.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.suresh.chain.client.DummyTwoClient;
import com.suresh.chain.core.DummyConstants;
import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.ChainResponse;
import com.suresh.chain.domain.DummySession;

public class ThirdCommand implements Command {

	private static Logger logger = LogManager.getLogger(ThirdCommand.class);

	private DummyTwoClient dummyTwoClient;

	public ThirdCommand(DummyTwoClient dummyTwoClient) {
		this.dummyTwoClient = dummyTwoClient;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean execute(Context context) throws Exception {
		logger.info("Third comando");
		DummySession session = (DummySession) context.get(DummyConstants.SESSION);
		ChainRequest request = (ChainRequest) context.get(DummyConstants.CHAIN_REQUEST);
		ChainResponse chainResponse = (ChainResponse) context.get(DummyConstants.CHAIN_RESPONSE);
		chainResponse.setOutputTwo(dummyTwoClient.getTwo(session, request));
		context.put(DummyConstants.CHAIN_RESPONSE, chainResponse);
		return false;
	}
}
