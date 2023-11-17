package com.pastebin.common.dto;

import lombok.Data;

@Data
public class MessageResponse{
    private String msg;
    private MessageResponse(String msg){
        this.msg = msg;
    }

    public static MessageResponse withMessage(String message) {
        return new MessageResponse(message);
    }
}