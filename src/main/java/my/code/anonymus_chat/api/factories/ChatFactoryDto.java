package my.code.anonymus_chat.api.factories;

import my.code.anonymus_chat.api.domains.Chat;
import my.code.anonymus_chat.api.domains.Participants;
import my.code.anonymus_chat.api.dto.ChatDto;
import my.code.anonymus_chat.api.dto.ParticipantDto;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class ChatFactoryDto {

    public ChatDto makeChatDto(Chat chat) {
        return ChatDto.builder()
                .id(chat.getId())
                .name(chat.getName())
                .createdAt(Instant.ofEpochMilli(chat.getCreatedAt()))
                .build();
    }
}
