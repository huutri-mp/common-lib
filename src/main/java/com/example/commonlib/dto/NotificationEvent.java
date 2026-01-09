package com.example.commonlib.dto;


import com.example.commonlib.Enum.MailTemplate;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationEvent {
    String channel;
    String recipient;
    MailTemplate template;
    Map<String, Object> data;
}
