package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

public class OrgDetailsInfo extends Response<OrgDetails> {

    public OrgDetails getOrgDetails() {
        return getResult();
    }


}
