package com.suresh.chain.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.DummySession;

import java.util.concurrent.TimeUnit;

@Component
public class DummyOneClient {

	private static Logger logger = LogManager.getLogger(DummyOneClient.class);

	public String getOne(DummySession session, ChainRequest request) throws InterruptedException {
		logger.info("Inside DummyOneClient: ONE");
		TimeUnit.SECONDS.sleep(2);
		return request.getInputOne() + " / " + session.getToken();
	}
}
