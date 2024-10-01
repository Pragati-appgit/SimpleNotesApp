package com.ppdgit.simplenotesapp.di

import android.app.Application
import androidx.room.Room
import com.ppdgit.simplenotesapp.feature.data.data_repository.NoteRepositoryImpl
import com.ppdgit.simplenotesapp.feature.data.data_source.NoteDB
import com.ppdgit.simplenotesapp.feature.domain.domain_repository.NoteRepository
import com.ppdgit.simplenotesapp.feature.domain.use_case.AddNotes
import com.ppdgit.simplenotesapp.feature.domain.use_case.DeleteNote
import com.ppdgit.simplenotesapp.feature.domain.use_case.GetNote
import com.ppdgit.simplenotesapp.feature.domain.use_case.GetNotes
import com.ppdgit.simplenotesapp.feature.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNoteData(app: Application): NoteDB {
        return Room.databaseBuilder(
            app,
            NoteDB::class.java,
            NoteDB.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDB): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNotes(repository),
            getNote = GetNote(repository)
        )
    }
}