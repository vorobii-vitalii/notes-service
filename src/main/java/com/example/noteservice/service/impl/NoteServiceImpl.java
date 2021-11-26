package com.example.noteservice.service.impl;

import com.example.noteservice.dao.NotesRepository;
import com.example.noteservice.entity.Note;
import com.example.noteservice.exception.NotFoundException;
import com.example.noteservice.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
  private final NotesRepository notesRepository;

  @Override
  public Note getById(Long noteId) {
    return notesRepository.findById(noteId).orElseThrow(NotFoundException::new);
  }

  @Override
  public Note addNote(Note noteToAdd) {
    return notesRepository.save(noteToAdd);
  }

  @Override
  public List<Note> getAll() {
    return notesRepository.findAll();
  }

  @Override
  public void deleteById(Long noteId) {
    notesRepository.deleteById(noteId);
  }

  @Override
  public void deleteAll() {
    notesRepository.deleteAll();
  }

  @Override
  @Transactional
  public void modify(Long noteIdToModify, String contentToSet) {
    notesRepository.findById(noteIdToModify)
      .ifPresentOrElse(
        note -> note.setContent(contentToSet),
        () -> {
          throw new NotFoundException();
        });
  }

}
