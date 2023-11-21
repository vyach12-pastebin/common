package com.pastebin.transfercontract.dto;

import lombok.Builder;

@Builder
public record RegisterNotificationDTO(
        String to,
        String subject,
        String body
) {
}