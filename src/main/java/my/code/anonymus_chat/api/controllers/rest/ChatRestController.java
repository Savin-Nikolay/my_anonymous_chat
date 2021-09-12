package my.code.anonymus_chat.api.controllers.rest;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import my.code.anonymus_chat.api.dto.ChatDto;
import my.code.anonymus_chat.api.factories.ChatFactoryDto;
import my.code.anonymus_chat.api.services.ChatService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
public class ChatRestController {

    ChatService chatService;

    ChatFactoryDto chatDtoFactory;

    public static final String FETCH_CHATS = "/api/chats";

    @GetMapping(value = FETCH_CHATS, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ChatDto> fetchChats() {
        return chatService
                .getChats()
                .map(chatDtoFactory::makeChatDto)
                .collect(Collectors.toList());
    }
}
