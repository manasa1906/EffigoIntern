package com.LearningPortal.example.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class FavouriteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user; 

    @OneToOne
    @JoinColumn(name = "courseId")
    private CourseEntity course;

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }

    public Long getFav_id() {
        return favId;
    }

    public void setFav_id(Long fav_id) {
        this.favId = fav_id;
    }

    public Long getFavId() {
        return favId;
    }

    public void setFavId(Long favId) {
        this.favId = favId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

}