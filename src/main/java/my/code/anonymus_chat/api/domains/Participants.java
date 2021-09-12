package my.code.anonymus_chat.api.domains;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Participants implements Serializable {

    @Builder.Default
    Long enterAt = Instant.now().toEpochMilli();

    String id;

    String sessionId;

    String chatId;
}