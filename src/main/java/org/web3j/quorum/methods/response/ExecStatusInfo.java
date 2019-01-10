package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

public class ExecStatusInfo extends Response<ExecStatus> {

    public ExecStatus getExecStatus() {
        return getResult();
    }


}
