package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionNodeList extends Response<List<PermissionNodeList.PermissionNodeInfo>> {
    public List<PermissionNodeInfo> getPermissionNodeList() {
        return getResult();
    }

    public static class PermissionNodeInfo {
        private String orgId;
        private String url;

        @Override
        public String toString() {
            return "PermissionNodeInfo{" +
                    "orgId='" + orgId + '\'' +
                    ", url='" + url + '\'' +
                    ", status=" + status +
                    '}';
        }

        private int status;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PermissionNodeInfo that = (PermissionNodeInfo) o;
            return Objects.equals(url, that.url);
        }

        @Override
        public int hashCode() {
            return Objects.hash(url);
        }

        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public PermissionNodeInfo(String orgId, String url, int status) {
            this.orgId = orgId;
            this.url = url;
            this.status = status;
        }

        public PermissionNodeInfo() {
        }


    }
}
