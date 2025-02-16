package com.ppdgit.simplenotesapp.feature.presentation.notes

import com.ppdgit.simplenotesapp.feature.domain.model.Note
import com.ppdgit.simplenotesapp.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}