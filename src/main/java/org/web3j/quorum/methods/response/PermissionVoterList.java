package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class PermissionVoterList extends Response<List<String>> {
    public List<String> getPermissionNodeList() {
        return getResult();
    }
}
