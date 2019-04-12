package org.web3j.quorum.methods.response;

import java.util.List;

public class OrgDetails {
    private List<PermissionRoleList.PermissionRoleInfo> roleList;
    private List<PermissionAccountList.PermissionAccountInfo> acctList;
    private List<PermissionNodeList.PermissionNodeInfo> nodeList;
    private List<String> subOrgList;
}
