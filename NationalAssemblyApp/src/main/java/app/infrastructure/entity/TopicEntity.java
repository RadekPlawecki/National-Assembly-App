package app.infrastructure.entity;

import app.common.TopicStatus;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "topics", schema = "app")
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;
    @Basic
    @Column(name = "title", unique = true)
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "event")
    private String event;
    @Basic
    @Column(name = "topic_status")
    private TopicStatus topicStatus;
    @Basic
    @Column(name = "creation_date")
    private Date creationDate;

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
