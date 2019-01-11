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
    public Request<?, PermissionAccountList> quorumGetPermissionAccountList() {
        return new Request<>(
                "quorumAcctMgmt_permissionAccountList",
                Collections.emptyList(),
                web3jService,
                PermissionAccountList.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumSetAccountPermission(String address, String access, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_setAccountAccess",
                Arrays.asList(address, access, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, PermissionNodeList> quorumGetPermissionNodeList() {
        return new Request<>(
                "quorumNodeMgmt_permissionNodeList",
                Collections.emptyList(),
                web3jService,
                PermissionNodeList.class);
    }

    @Override
    public Request<?, PermissionVoterList> quorumGetPermissionVoterList() {
        return new Request<>(
                "quorumNodeMgmt_voterList",
                Collections.emptyList(),
                web3jService,
                PermissionVoterList.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumAddPermissionVoter(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_addVoter",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumRemovePermissionVoter(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_removeVoter",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumProposePermissionNode(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_proposeNode",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumApprovePermissionNode(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_approveNode",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumProposePermissionNodeDeactivation(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_proposeNodeDeactivation",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }

    @Override
    public Request<?, ExecStatusInfo> quorumApprovePermissionNodeDeactivation(String address, PrivateTransaction transaction) {
        return new Request<>(
                "quorumAcctMgmt_approveNodeDeactivation",
                Arrays.asList(address, transaction),
                web3jService,
                ExecStatusInfo.class);
    }
}
