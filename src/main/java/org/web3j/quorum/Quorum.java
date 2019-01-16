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

    Request<?, PermissionAccountList> quorumGetPermissionAccountList();

    Request<?, ExecStatusInfo> quorumSetAccountPermission(String address, String access, PrivateTransaction transaction);

    Request<?, PermissionNodeList> quorumGetPermissionNodeList();

    Request<?, PermissionVoterList> quorumGetPermissionVoterList();

    Request<?, ExecStatusInfo> quorumAddPermissionVoter(String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumRemovePermissionVoter(String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumProposePermissionNode(String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumApprovePermissionNode(String address, PrivateTransaction transaction);


    Request<?, ExecStatusInfo> quorumProposePermissionNodeDeactivation(String address, PrivateTransaction transaction);

    Request<?, ExecStatusInfo> quorumApprovePermissionNodeDeactivation(String address, PrivateTransaction transaction);
    Request<?, ExecStatusInfo> quorumAddMasterOrg(String morgId, PrivateTransaction transaction);
    Request<?, ExecStatusInfo> quorumAddSubOrg(String sorgId, String morgId, PrivateTransaction transaction);
    Request<?, ExecStatusInfo> quorumAddOrgVoter(String morgId, String voterAcct, PrivateTransaction transaction);
    Request<?, ExecStatusInfo> quorumDeleteOrgVoter(String morgId, String voterAcct, PrivateTransaction transaction);
    Request<?, OrgVoterList>   quorumGetOrgVoterList(String morgId);
    Request<?, OrgKeyInfoList> quorumOrgKeyInfoList();
    Request<?, ExecStatusInfo> quorumAddOrgKey(String sorgId, String tmKey, PrivateTransaction transaction );
    Request<?, ExecStatusInfo> quorumApprovePendingOp(String sorgId, PrivateTransaction transaction );
    Request<?, ExecStatusInfo> quorumDeleteOrgKey(String sorgId, String tmKey, PrivateTransaction transaction );



    Request<?, EthSendTransaction> ethSendRawTransaction(String signedTransactionData);

    Request<?, EthSendTransaction> ethSendRawPrivateTransaction(String signedTransactionData, List<String> privateFor);

}
