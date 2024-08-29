package app.service;

import app.controller.DTO.TopicDTO.CreateTopicDTO;
import app.controller.DTO.TopicDTO.CreateTopicResponseDTO;
import app.infrastructure.entity.TopicEntity;
import app.infrastructure.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.time.LocalDate;

@Service
public class TopicService {
    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public CreateTopicResponseDTO addTopic(CreateTopicDTO createTopicDTO) {
        var topicEntity = new TopicEntity();
        topicEntity.setTitle(createTopicDTO.getTitle());
        topicEntity.setDescription(createTopicDTO.getDescription());
        topicEntity.setEvent(createTopicDTO.getEvent());
        topicEntity.setTopicStatus(createTopicDTO.getTopicStatus());
        LocalDate localDate = LocalDate.now();
        topicEntity.setCreationDate(Date.valueOf(localDate));
        var newTopic = topicRepository.save(topicEntity);
        return new CreateTopicResponseDTO(newTopic.getId(), newTopic.getTitle(), newTopic.getDescription(),
                newTopic.getEvent(), newTopic.getTopicStatus(), newTopic.getCreationDate());
    }
}
