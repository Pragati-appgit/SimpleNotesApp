package com.ppdgit.simplenotesapp.feature.domain.use_case

import com.ppdgit.simplenotesapp.feature.domain.domain_repository.NoteRepository
import com.ppdgit.simplenotesapp.feature.domain.model.Note

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}