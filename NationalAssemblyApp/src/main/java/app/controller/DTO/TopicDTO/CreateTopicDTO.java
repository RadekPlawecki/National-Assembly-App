package app.controller.DTO.TopicDTO;

import app.common.TopicStatus;
import jakarta.validation.constraints.NotBlank;

public class CreateTopicDTO {
    @NotBlank(message = "Title is required!")
    private String title;
    @NotBlank(message = "Description is required!")
    private String description;
    @NotBlank(message = "Event is required!")
    private String event;
    @NotBlank(message = "Status of a topic is required!")
    private TopicStatus topicStatus;

    public CreateTopicDTO() {
    }

    public CreateTopicDTO(String title, String description, String event, String speaker, TopicStatus topicStatus) {
        this.title = title;
        this.description = description;
        this.event = event;
        this.topicStatus = topicStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public TopicStatus getTopicStatus() {
        return topicStatus;
    }

    public void setTopicStatus(TopicStatus topicStatus) {
        this.topicStatus = topicStatus;
    }
}
