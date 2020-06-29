package com.koroliuk;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.koroliuk.model.Rating;

@Entity
public class UserRating {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  
  public Long userId;
  
  @Enumerated(EnumType.ORDINAL)
  public Rating rating;
  
  public UserRating() {}

  public Long getId() {
    return id;
  }

  public Long getUserId() {
    return userId;
  }

  public Rating getRating() {
    return rating;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }
  
}
