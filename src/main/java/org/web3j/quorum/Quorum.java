package org.web3j.quorum;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.quorum.methods.request.PrivateTransaction;
import org.web3j.quorum.methods.response.*;

import java.util.List;

/**
 * JSON-RPC Request object building factory for Quorum.
 */
public interface Quorum extends Web3j {
    static Quorum build(Web3jService web3jService) {
        return new JsonRpc2_0Quorum(web3jService);
    }

    Request<?, EthSendTransaction> ethSendTransaction(PrivateTransaction transaction);

    Request<?, PrivatePayload> quorumGetPrivatePayload(String hexDigest);

    Request<?, PermissionOrgList> quorumPermissionGetOrgList();

    Request<?, PermissionNodeList> quorumPermissionGetNodeList();

    Request<?, PermissionRoleList> quorumPermissionGetRoleList();

    Request<?, PermissionAccountList> quorumPermissionGetAccountList();

    Request<?, ExecStatusInfo> quorumPermissionAddOrg(String orgId, String url, String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionApproveOrg(String orgId, String url, String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionAddSubOrg(String pOrgId, String orgId, String url, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionUpdateOrgStatus(String orgId, int action, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionApproveOrgStatus(String orgId, int action, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionAddNode(String orgId, String url, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionUpdateNodeStatus(String orgId, String url, int action, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionAssignAdminRole(String orgId, String address, String roleid, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionApproveAdminRole(String orgId, String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionAddNewRole(String orgId, String roleId, int access, boolean isVoter, boolean isAdmin, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionRemoveRole(String orgId, String roleId, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumPermissionAddAccountToOrg(String address, String orgId, String roleId, PrivateTransaction transaction);
    Request<?, ExecStatusInfo> quorumPermissionChangeAccountRole(String address, String orgId, String roleId, PrivateTransaction transaction);
    Request<?, ExecStatusInfo> quorumPermissionUpdateAccountStatus(String orgId, String address, int status, PrivateTransaction transaction);

    Request<?, OrgDetailsInfo> quorumPermissionGetOrgDetails(String orgId, PrivateTransaction transaction);


    Request<?, EthSendTransaction> ethSendRawTransaction(String signedTransactionData);

    Request<?, EthSendTransaction> ethSendRawPrivateTransaction(String signedTransactionData, List<String> privateFor);

}
