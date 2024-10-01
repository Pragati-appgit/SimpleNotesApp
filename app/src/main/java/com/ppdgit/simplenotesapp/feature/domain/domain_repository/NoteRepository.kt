package com.ppdgit.simplenotesapp.feature.domain.domain_repository

import com.ppdgit.simplenotesapp.feature.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}
