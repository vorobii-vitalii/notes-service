package com.example.noteservice.dao;

import com.example.noteservice.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note, Long> {
}
