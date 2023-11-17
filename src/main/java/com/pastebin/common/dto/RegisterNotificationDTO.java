package com.pastebin.common.dto;

import lombok.Builder;

@Builder
public record RegisterNotificationDTO(
        String to,
        String subject,
        String body
) {
}