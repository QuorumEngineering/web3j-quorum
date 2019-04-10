package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class PermissionRoleList extends Response<List<PermissionRoleList.PermissionRoleInfo>> {


    public List<PermissionRoleList.PermissionRoleInfo> getPermissionRoleList() {
        return getResult();
    }

    public static class PermissionRoleInfo {

        private String acctId;
        private boolean isVoter;
        private boolean active;
        private String orgId;
        private String roleId;
        private int access;


    }


}

