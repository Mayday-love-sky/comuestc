package uestc.pojo.Response;

public class loginResponse {
    //响应状态码
    private int status;

    //响应信息
    private String responseMessage;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
