package com.ppdgit.simplenotesapp.feature.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNotes,
    val getNote: GetNote
)