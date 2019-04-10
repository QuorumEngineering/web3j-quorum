package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionRoleList extends Response<List<PermissionRoleList.PermissionRoleInfo>> {


    public List<PermissionRoleList.PermissionRoleInfo> getPermissionRoleList() {
        return getResult();
    }

    public static class PermissionRoleInfo {

        private boolean isVoter;
        private boolean active;
        private String orgId;
        private String roleId;
        private int access;


        public boolean isVoter() {
            return isVoter;
        }

        public void setIsVoter(boolean voter) {
            isVoter = voter;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
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

        public int getAccess() {
            return access;
        }

        public void setAccess(int access) {
            this.access = access;
        }

        public PermissionRoleInfo() {
        }

        public PermissionRoleInfo(boolean isVoter, boolean active, String orgId, String roleId, int access) {
            this.isVoter = isVoter;
            this.active = active;
            this.orgId = orgId;
            this.roleId = roleId;
            this.access = access;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PermissionRoleInfo that = (PermissionRoleInfo) o;
            return Objects.equals(orgId, that.orgId) &&
                    Objects.equals(roleId, that.roleId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(orgId, roleId);
        }
    }


}

