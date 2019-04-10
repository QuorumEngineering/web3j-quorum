package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionOrgList extends Response<List<PermissionOrgList.PermissionOrgInfo>> {


    public List<PermissionOrgList.PermissionOrgInfo> getPermissionOrgList() {
        return getResult();
    }

    public static class PermissionOrgInfo {

        private String fullOrgId;
        private String orgId;
        private String parentOrgId;
        private Integer level;
        private Integer status;
        private List<String> subOrgList;
        private String ultimateParent;


        public PermissionOrgInfo() {
        }

        public PermissionOrgInfo(String fullOrgId, String orgId, String parentOrgId, Integer level, Integer status, List<String> subOrgList, String ultimateParent) {
            this.fullOrgId = fullOrgId;
            this.orgId = orgId;
            this.parentOrgId = parentOrgId;
            this.level = level;
            this.status = status;
            this.subOrgList = subOrgList;
            this.ultimateParent = ultimateParent;
        }


        public String getFullOrgId() {
            return fullOrgId;
        }

        public void setFullOrgId(String fullOrgId) {
            this.fullOrgId = fullOrgId;
        }

        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        public String getParentOrgId() {
            return parentOrgId;
        }

        public void setParentOrgId(String parentOrgId) {
            this.parentOrgId = parentOrgId;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public List<String> getSubOrgList() {
            return subOrgList;
        }

        public void setSubOrgList(List<String> subOrgList) {
            this.subOrgList = subOrgList;
        }

        public String getUltimateParent() {
            return ultimateParent;
        }

        public void setUltimateParent(String ultimateParent) {
            this.ultimateParent = ultimateParent;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PermissionOrgInfo that = (PermissionOrgInfo) o;
            return Objects.equals(fullOrgId, that.fullOrgId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(fullOrgId);
        }
    }


}

