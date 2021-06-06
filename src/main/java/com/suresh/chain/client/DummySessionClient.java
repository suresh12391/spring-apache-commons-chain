package com.suresh.chain.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.suresh.chain.domain.DummySession;

import java.util.concurrent.TimeUnit;

@Component
public class DummySessionClient {

	private static Logger logger = LogManager.getLogger(DummySessionClient.class);

	public DummySession getSession() throws InterruptedException {
		logger.info("Inside DummySessionClient");
		TimeUnit.SECONDS.sleep(1);
		DummySession session = new DummySession();
		session.setToken("admin123");
		return session;
	}
}
