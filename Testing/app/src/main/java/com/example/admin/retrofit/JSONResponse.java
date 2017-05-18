package com.example.admin.retrofit;

import com.google.gson.JsonElement;

/**
 * Created by admin on 30-09-2016.
 */

public class JSONResponse {

    private int Status;
    private String Message;
    private JsonElement ResponsePacket;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public JsonElement getResponsePacket() {
        return ResponsePacket;
    }

    public void setResponsePacket(JsonElement responsePacket) {
        ResponsePacket = responsePacket;
    }
}
