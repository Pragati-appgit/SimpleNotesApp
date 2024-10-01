package com.ppdgit.simplenotesapp.feature.domain.use_case

import com.ppdgit.simplenotesapp.feature.domain.domain_repository.NoteRepository
import com.ppdgit.simplenotesapp.feature.domain.model.InvalidNoteException
import com.ppdgit.simplenotesapp.feature.domain.model.Note

class AddNotes(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Enter title for the note")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Enter the note content")
        }
        repository.insertNote(note)
    }
}