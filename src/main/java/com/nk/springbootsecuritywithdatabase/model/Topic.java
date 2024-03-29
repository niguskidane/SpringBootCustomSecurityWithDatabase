package com.nk.springbootsecuritywithdatabase.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "topics")
public class Topic implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue
    @Column(name = "topic_id")
    private int topicId;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "category", length = 100, nullable = false)
    private String category;

    public Topic() {
    }

    public Topic(int topicId,String title, String category) {
        this.topicId=topicId;
        this.title = title;
        this.category = category;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
} 