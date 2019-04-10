package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionOrgList extends Response<List<PermissionOrgList.PermissionOrgInfo>> {


    public List<PermissionOrgList.PermissionOrgInfo> getPermissionOrgList() {
        return getResult();
    }

    public static class PermissionOrgInfo {

        /*
        	OrgId          string
	FullOrgId      string
	ParentOrgId    string
	UltimateParent string
	Level          *big.Int
	SubOrgList     []string
	Status         OrgStatus
         */
        private String orgId;
        private String fullOrgId;
        private String parentOrgId;
        private String ultimateParent;
        private int level;
        private List<String> subOrgList;
        private int status;


        public PermissionOrgInfo() {
        }

        public PermissionOrgInfo(String orgId, String fullOrgId, String parentOrgId, String ultimateParent, int level, List<String> subOrgList, int status) {
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

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
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

