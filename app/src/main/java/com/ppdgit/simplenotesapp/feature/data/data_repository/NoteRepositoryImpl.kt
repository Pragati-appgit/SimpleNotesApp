package com.ppdgit.simplenotesapp.feature.data.data_repository

import com.ppdgit.simplenotesapp.feature.data.data_source.NoteDao
import com.ppdgit.simplenotesapp.feature.domain.domain_repository.NoteRepository
import com.ppdgit.simplenotesapp.feature.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}