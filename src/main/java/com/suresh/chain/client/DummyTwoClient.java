package com.suresh.chain.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.DummySession;

import java.util.concurrent.TimeUnit;

@Component
public class DummyTwoClient {

	private static Logger logger = LogManager.getLogger(DummyTwoClient.class);

	public String getTwo(DummySession session, ChainRequest request) throws InterruptedException {
		logger.info("Inside DummyTwoClient: TWO");
		TimeUnit.SECONDS.sleep(3);
		return request.getInputTwo() + " / " + session.getToken();
	}
}
