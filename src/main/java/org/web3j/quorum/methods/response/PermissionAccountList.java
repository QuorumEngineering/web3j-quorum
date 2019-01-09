package org.web3j.quorum.methods.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Objects;

public class PermissionAccountList extends Response<List<PermissionAccountList.PermissionAccountInfo>> {


    public List<PermissionAccountList.PermissionAccountInfo> getPermissionAccountList() {
        return getResult();
    }

    public static class PermissionAccountInfo {

        private String access;
        private String address;

        public PermissionAccountInfo(@JsonProperty("Access") String Access, @JsonProperty("Address") String Address) {
            this.access = Access;
            this.address = Address;
        }

        public PermissionAccountInfo() {
        }


        public String getAccess() {
            return access;
        }


        public void setAccess(String access) {
            this.access = access;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PermissionAccountInfo that = (PermissionAccountInfo) o;
            return Objects.equals(access, that.access) &&
                    Objects.equals(address, that.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(access, address);
        }
    }


}
