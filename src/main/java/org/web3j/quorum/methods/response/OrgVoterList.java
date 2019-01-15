package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class OrgVoterList extends Response<List<String>> {
    public List<String> getOrgVoterList() {
        return getResult();
    }
}
