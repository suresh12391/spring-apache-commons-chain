package com.suresh.atm.filter;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;

public class AuditFilter implements Filter {

	@Override
	public boolean postprocess(Context context, Exception exception) {
		// send notification to bank and user
		return false;
	}

	@Override
	public boolean execute(Context context) throws Exception {
		return false;
	}

}
