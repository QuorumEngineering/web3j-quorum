package org.web3j.quorum.methods.response;

public class ExecStatus {
    private boolean status;
    private String msg;

    public ExecStatus() {
    }


    @Override
    public String toString() {
        return "ExecStatus{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ExecStatus(boolean status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
