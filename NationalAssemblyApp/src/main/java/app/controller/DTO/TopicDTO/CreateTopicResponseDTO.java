package app.controller.DTO.TopicDTO;

import app.common.TopicStatus;
import jakarta.validation.constraints.NotBlank;

import java.sql.Date;

public class CreateTopicResponseDTO {
    @NotBlank(message = "Identification number of a topic is required!")
    private Integer id;
    @NotBlank(message = "Title is required!")
    private String title;
    @NotBlank(message = "Description is required!")
    private String description;
    @NotBlank(message = "Event is required!")
    private String event;
    @NotBlank(message = "Status of a topic is required!")
    private TopicStatus topicStatus;
    @NotBlank(message = "Creation date is required!")
    private Date creationDate;

    public CreateTopicResponseDTO() {
    }

    public CreateTopicResponseDTO(Integer id, String title, String description, String event, TopicStatus topicStatus, Date creationDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.event = event;
        this.topicStatus = topicStatus;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
