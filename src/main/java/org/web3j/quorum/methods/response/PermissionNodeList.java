package org.web3j.quorum.methods.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionNodeList extends Response<List<PermissionNodeList.PermissionNodeInfo>> {
    public List<PermissionNodeInfo> getPermissionNodeList() {
        return getResult();
    }

    public static class PermissionNodeInfo {
        private String enodeId;
        private String status;

        public PermissionNodeInfo(@JsonProperty("EnodeId") String enodeId, @JsonProperty("Status") String status) {
            this.enodeId = enodeId;
            this.status = status;
        }

        public PermissionNodeInfo() {
        }

        public String getEnodeId() {
            return enodeId;
        }

        public void setEnodeId(String enodeId) {
            this.enodeId = enodeId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PermissionNodeInfo that = (PermissionNodeInfo) o;
            return Objects.equals(enodeId, that.enodeId) &&
                    Objects.equals(status, that.status);
        }

        @Override
        public int hashCode() {
            return Objects.hash(enodeId, status);
        }
    }
}
