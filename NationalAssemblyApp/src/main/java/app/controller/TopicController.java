package app.controller;

import app.controller.DTO.TopicDTO.CreateTopicDTO;
import app.controller.DTO.TopicDTO.CreateTopicResponseDTO;
import app.service.TopicService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topic")
@Tag(name = "Topic")
@CrossOrigin
public class TopicController {
    private final TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public ResponseEntity<CreateTopicResponseDTO> addTopic(@RequestBody CreateTopicDTO createTopicDTO) {
        var newTopic = topicService.addTopic(createTopicDTO);
        return new ResponseEntity<>(newTopic, HttpStatus.CREATED);
    }
}
