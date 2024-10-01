package com.ppdgit.simplenotesapp.feature.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title : String,
    val content : String,
    val timestamp: Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
){
    companion object {
        val noteColors = listOf("#aceae9","#b3e5fc","#ffab91","#caacea","#fffaa0","#eaaccc")
    }
}

class InvalidNoteException(message: String): Exception(message)
