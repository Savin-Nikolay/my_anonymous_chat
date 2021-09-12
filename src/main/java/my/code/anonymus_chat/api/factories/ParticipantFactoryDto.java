package my.code.anonymus_chat.api.factories;


import my.code.anonymus_chat.api.domains.Participants;
import my.code.anonymus_chat.api.dto.ParticipantDto;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class ParticipantFactoryDto {

    public ParticipantDto makeParticipantDto(Participants participants) {
        return ParticipantDto.builder()
                .id(participants.getId())
                .enterAt(Instant.ofEpochMilli(participants.getEnterAt()))
                .build();
    }
}