package com.suresh.chain.service;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.chain.core.DummyChainCatalog;
import com.suresh.chain.core.DummyConstants;
import com.suresh.chain.core.DummyContext;
import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.ChainResponse;

@Service
public class ChainService {

	@Autowired
	private DummyChainCatalog catalog;

	private static Logger logger = LogManager.getLogger(ChainService.class);

	@SuppressWarnings("unchecked")
	public ChainResponse getChainResponse(ChainRequest request) {

		logger.info("Initiate the apache commons chain behaviour flow...");

		Context context = new DummyContext();
		context.put(DummyConstants.CHAIN_REQUEST, request);

		// Catalog catalog = new DummyChainCatalog();
		Command dummyChain = catalog.getCommand(DummyConstants.DUMMY_CHAIN);

		try {
			dummyChain.execute(context);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChainResponse response = (ChainResponse) context.get(DummyConstants.CHAIN_RESPONSE);
		logger.info("Finished the command process. Result: " + response.toString());

		return response;
	}
}
