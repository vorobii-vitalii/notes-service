package com.example.noteservice.api;

import com.example.noteservice.entity.Note;
import com.example.noteservice.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/notes")
@RequiredArgsConstructor
public class NotesController {
  private final NoteService noteService;

  @GetMapping
  public List<Note> getAll() {
    return noteService.getAll();
  }

  @GetMapping(value = "/{id}")
  public Note getById(@PathVariable("id") Long id) {
    return noteService.getById(id);
  }

  @PostMapping
  public Note addNote(@RequestBody Note note) {
    return noteService.addNote(note);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void modify(@PathVariable("id") Long id, @RequestBody String newContent) {
    noteService.modify(id, newContent);
  }

  @DeleteMapping
  @ResponseStatus(HttpStatus.OK)
  public void deleteAll() {
    noteService.deleteAll();
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteById(@PathVariable("id") Long id) {
    noteService.deleteById(id);
  }

}
