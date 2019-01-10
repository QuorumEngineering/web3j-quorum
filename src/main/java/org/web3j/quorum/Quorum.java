package org.web3j.quorum;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.quorum.methods.request.PrivateTransaction;
import org.web3j.quorum.methods.response.ExecStatusInfo;
import org.web3j.quorum.methods.response.PermissionAccountList;
import org.web3j.quorum.methods.response.PermissionNodeList;
import org.web3j.quorum.methods.response.PrivatePayload;

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

    Request<?, EthSendTransaction> ethSendRawTransaction(String signedTransactionData);

    Request<?, EthSendTransaction> ethSendRawPrivateTransaction(String signedTransactionData, List<String> privateFor);

}
