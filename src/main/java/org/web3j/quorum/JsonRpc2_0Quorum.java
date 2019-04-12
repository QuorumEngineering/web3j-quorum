package org.web3j.quorum;

import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.quorum.methods.request.PrivateRawTransaction;
import org.web3j.quorum.methods.request.PrivateTransaction;
import org.web3j.quorum.methods.response.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Quorum JSON-RPC API implementation.
 */
public class JsonRpc2_0Quorum extends JsonRpc2_0Web3j implements Quorum {

    public JsonRpc2_0Quorum(Web3jService web3jService) {
        super(web3jService);
    }

    public JsonRpc2_0Quorum(
            Web3jService web3jService, long pollingInterval,
            ScheduledExecutorService scheduledExecutorService) {
        super(web3jService, pollingInterval, scheduledExecutorService);
    }

    @Override
    public Request<?, EthSendTransaction> ethSendRawPrivateTransaction(
            String signedTransactionData, List<String> privateFor) {
        PrivateRawTransaction transaction = new PrivateRawTransaction(privateFor);
        return new Request<>(
                "eth_sendRawPrivateTransaction",
                Arrays.asList(signedTransactionData, transaction),
                web3jService,
                EthSendTransaction.class);
    }

    @Override
    public Request<?, EthSendTransaction> ethSendRawTransaction(
            String signedTransactionData) {
        return new Request<>(
                "eth_sendRawTransaction",
                Collections.singletonList(signedTransactionData),
                web3jService,
                EthSendTransaction.class);
    }

    @Override
    public Request<?, EthSendTransaction> ethSendTransaction(
            PrivateTransaction transaction) {
        return new Request<>(
                "eth_sendTransaction",
                Collections.singletonList(transaction),
                web3jService,
                EthSendTransaction.class);
    }

    @Override
    public Request<?, PrivatePayload> quorumGetPrivatePayload(String hexDigest) {
        return new Request<>(
                "eth_getQuorumPayload",
                Collections.singletonList(hexDigest),
                web3jService,
                PrivatePayload.class);
    }

    @Override
    public Request<?, PermissionOrgList> quorumPermissionGetOrgList() {
        return new Request<>(
                "quorumPermission_orgList",
                Collections.emptyList(),
                web3jService,
                PermissionOrgList.class);
    }

    @Override
    public Request<?, PermissionNodeList> quorumPermissionGetNodeList() {
        return new Request<>(
                "quorumPermission_nodeList",
                Collections.emptyList(),
                web3jService,
                PermissionNodeList.class);
    }

    @Override
    public Request<?, PermissionAccountList> quorumPermissionGetAccountList() {
        return new Request<>(
                "quorumPermission_acctList",
                Collections.emptyList(),
                web3jService,
                PermissionAccountList.class);
    }

    @Override
    public Request<?, PermissionRoleList> quorumPermissionGetRoleList() {
        return new Request<>(
                "quorumPermission_roleList",
                Collections.emptyList(),
                web3jService,
                PermissionRoleList.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionAddOrg(String orgId, String url, String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_addOrg",
                Arrays.asList(orgId, url, address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionApproveOrg(String orgId, String url, String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_approveOrg",
                Arrays.asList(orgId, url, address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionAddSubOrg(String pOrgId, String orgId, String url, String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_addSubOrg",
                Arrays.asList(pOrgId, orgId, url, address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionUpdateOrgStatus(String orgId, int status, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_updateOrgStatus",
                Arrays.asList(orgId, status, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionApproveOrgStatus(String orgId, int status, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_approveOrgStatus",
                Arrays.asList(orgId, status, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionAddNode(String orgId, String url, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_addNode",
                Arrays.asList(orgId, url, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionUpdateNodeStatus(String orgId, String url, int status, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_updateNodeStatus",
                Arrays.asList(orgId, url, status, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionAssignOrgAdminAccount(String orgId, String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_assignOrgAdminAccount",
                Arrays.asList(orgId, address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionApproveOrgAdminAccount(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_approveOrgAdminAccount",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionAddNewRole(String orgId, String roleId, int access, boolean isVoter, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_addNewRole",
                Arrays.asList(orgId, roleId, access, isVoter, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionRemoveRole(String orgId, String roleId, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_removeRole",
                Arrays.asList(orgId, roleId, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumPermissionAssignAccountRole(String address, String orgId, String roleId, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_assignAccountRole",
                Arrays.asList(address, orgId, roleId, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, OrgDetailsInfo> quorumPermissionGetOrgDetails(String orgId, PrivateTransaction transaction) {
        return new Request<>(
                "quorumPermission_getOrgDetails",
                Arrays.asList(orgId, transaction),
                web3jService,
                OrgDetailsInfo.class);
    }


    @Override
    public Request<?, ExecStatusInfo> quorumAddMasterOrg(String morgId, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_addMasterOrg",
                Arrays.asList(morgId, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
    @Override
    public Request<?, ExecStatusInfo> quorumAddSubOrg(String sorgId, String morgId, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_addSubOrg",
                Arrays.asList(sorgId, morgId, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
    @Override
    public Request<?, ExecStatusInfo> quorumAddOrgVoter(String morgId, String voterAcct, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_addOrgVoter",
                Arrays.asList(morgId, voterAcct, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
    @Override
    public Request<?, ExecStatusInfo> quorumRemoveOrgVoter(String morgId, String voterAcct, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_removeOrgVoter",
                Arrays.asList(morgId, voterAcct, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
    @Override
    public Request<?, OrgVoterList> quorumGetOrgVoterList(String morgId) {
        return new Request<>(
                "quorumOrgMgmt_getOrgVoterList",
                Arrays.asList(morgId),
                web3jService,
                OrgVoterList.class);
    }

    @Override
    public Request<?, OrgKeyInfoList> quorumOrgKeyInfoList() {
        return new Request<>(
                "quorumOrgMgmt_orgKeyInfo",
                Arrays.asList(),
                web3jService,
                OrgKeyInfoList.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumAddOrgKey(String sorgId, String tmKey, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_addOrgKey",
                Arrays.asList(sorgId, tmKey, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
    @Override
    public Request<?, ExecStatusInfo> quorumRemoveOrgKey(String sorgId, String tmKey, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_removeOrgKey",
                Arrays.asList(sorgId, tmKey, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
    @Override
    public Request<?, ExecStatusInfo> quorumApprovePendingOp(String sorgId, PrivateTransaction transaction) {
        return new Request<>(
                "quorumOrgMgmt_approvePendingOp",
                Arrays.asList(sorgId, transaction),
                web3jService,
                ExecStatusInfo.class);
    }


}
