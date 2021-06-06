package com.suresh.atm;

import org.apache.commons.chain.impl.ChainBase;

import com.suresh.atm.command.HundredDenominationDispenser;
import com.suresh.atm.command.TwoThousandDenominationDispenser;
import com.suresh.atm.filter.AuditFilter;

public class AtmWithdrawalChain extends ChainBase {

	public AtmWithdrawalChain() {
		super();
		addCommand(new TwoThousandDenominationDispenser());
		addCommand(new HundredDenominationDispenser());
		// addCommand(new FiftyDenominationDispenser());
		addCommand(new AuditFilter());
	}

}
