package com.example.noteservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Note")
@Data
@Table(name = "NOTES")
public class Note {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "NOTE_ID")
  private Long id;

  @Column(name = "CONTENT")
  private String content;

}
