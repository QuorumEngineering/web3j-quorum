package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class OrgKeyInfoList extends Response<List<OrgKeyInfoList.OrgKeyInfo>> {
    public List<OrgKeyInfo> getOrgKeyInfoList() {
        return getResult();
    }

    public static class OrgKeyInfo {
        public OrgKeyInfo(String masterOrgId, String subOrgId, List<String> subOrgKeyList) {
            this.masterOrgId = masterOrgId;
            this.subOrgId = subOrgId;
            this.subOrgKeyList = subOrgKeyList;
        }

        private String masterOrgId;
        private String subOrgId;
        private List<String> subOrgKeyList;




        public OrgKeyInfo() {
        }

        public String getMasterOrgId() {
            return masterOrgId;
        }

        public String getSubOrgId() {
            return subOrgId;
        }

        public List<String> getSubOrgKeyList() {
            return subOrgKeyList;
        }

        public void setMasterOrgId(String masterOrgId) {
            this.masterOrgId = masterOrgId;
        }

        public void setSubOrgId(String subOrgId) {
            this.subOrgId = subOrgId;
        }

        public void setSubOrgKeyList(List<String> subOrgKeyList) {
            this.subOrgKeyList = subOrgKeyList;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof OrgKeyInfo)) return false;
            OrgKeyInfo that = (OrgKeyInfo) o;
            return Objects.equals(getMasterOrgId(), that.getMasterOrgId()) &&
                    Objects.equals(getSubOrgId(), that.getSubOrgId());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getMasterOrgId(), getSubOrgId());
        }
    }
}
