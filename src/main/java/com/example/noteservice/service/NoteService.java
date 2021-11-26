package com.example.noteservice.service;

import com.example.noteservice.entity.Note;

import java.util.List;

public interface NoteService {
  Note getById(Long noteId);
  Note addNote(Note noteToAdd);
  List<Note> getAll();
  void deleteById(Long noteId);
  void deleteAll();
  void modify(Long noteIdToModify, String contentToSet);
}
