package com.suresh.chain.core;

import org.apache.commons.chain.impl.ContextBase;

import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.ChainResponse;
import com.suresh.chain.domain.DummySession;

@SuppressWarnings("serial")
public class DummyContext extends ContextBase {

	DummySession session;

	ChainRequest chainRequest;

	ChainResponse chainResponse;

	public ChainRequest getChainRequest() {
		return chainRequest;
	}

	public void setChainRequest(ChainRequest chainRequest) {
		this.chainRequest = chainRequest;
	}

	public ChainResponse getChainResponse() {
		return chainResponse;
	}

	public void setChainResponse(ChainResponse chainResponse) {
		this.chainResponse = chainResponse;
	}

	public DummySession getSession() {
		return session;
	}

	public void setSession(DummySession session) {
		this.session = session;
	}
}
