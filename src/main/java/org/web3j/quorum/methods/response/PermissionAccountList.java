package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionAccountList extends Response<List<PermissionAccountList.PermissionAccountInfo>> {


    public List<PermissionAccountList.PermissionAccountInfo> getPermissionAccountList() {
        return getResult();
    }

    public static class PermissionAccountInfo {

        private String acctId;
        private boolean isOrgAdmin;
        private String orgId;
        private String roleId;
        private int status;

        public PermissionAccountInfo(String acctId, boolean isOrgAdmin, String orgId, String roleId, int status) {
            this.acctId = acctId;
            this.isOrgAdmin = isOrgAdmin;
            this.orgId = orgId;
            this.roleId = roleId;
            this.status = status;
        }


        public PermissionAccountInfo() {
        }

        public String getAcctId() {
            return acctId;
        }

        public void setAcctId(String acctId) {
            this.acctId = acctId;
        }

        public boolean isOrgAdmin() {
            return isOrgAdmin;
        }

        public void setIsOrgAdmin(boolean orgAdmin) {
            isOrgAdmin = orgAdmin;
        }

        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        public String getRoleId() {
            return roleId;
        }

        public void setRoleId(String roleId) {
            this.roleId = roleId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PermissionAccountInfo that = (PermissionAccountInfo) o;
            return Objects.equals(acctId, that.acctId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(acctId);
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }


}
