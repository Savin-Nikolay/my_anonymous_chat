package my.code.anonymus_chat.api.domains;


import lombok.*;
import lombok.experimental.FieldDefaults;
import my.code.anonymus_chat.api.RandomIdGenerator;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chat implements Serializable {

    @Builder.Default
    String id = RandomIdGenerator.generate();

    String name;

    @Builder.Default
    Long createdAt = Instant.now().toEpochMilli();
}