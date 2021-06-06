package com.suresh.chain.core;

import org.apache.commons.chain.impl.ChainBase;
import org.springframework.stereotype.Component;

import com.suresh.chain.client.DummyOneClient;
import com.suresh.chain.client.DummySessionClient;
import com.suresh.chain.client.DummyTwoClient;
import com.suresh.chain.core.command.FirstCommand;
import com.suresh.chain.core.command.SecondCommand;
import com.suresh.chain.core.command.ThirdCommand;

@Component
public class DummyChain extends ChainBase {

	public DummyChain(DummySessionClient dummySessionClient, DummyOneClient dummyOneClient,
			DummyTwoClient dummyTwoClient) {
		super();
		addCommand(new FirstCommand(dummySessionClient));
		addCommand(new SecondCommand(dummyOneClient));
		addCommand(new ThirdCommand(dummyTwoClient));
		addCommand(new DummyFilter());
	}
}
