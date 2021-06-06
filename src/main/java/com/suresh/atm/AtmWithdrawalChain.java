package com.suresh.chain.atm;

import org.apache.commons.chain.impl.ChainBase;

import com.suresh.chain.atm.command.HundredDenominationDispenser;
import com.suresh.chain.atm.command.TwoThousandDenominationDispenser;
import com.suresh.chain.atm.filter.AuditFilter;

public class AtmWithdrawalChain extends ChainBase {

	public AtmWithdrawalChain() {
		super();
		addCommand(new TwoThousandDenominationDispenser());
		addCommand(new HundredDenominationDispenser());
		// addCommand(new FiftyDenominationDispenser());
		addCommand(new AuditFilter());
	}

}
