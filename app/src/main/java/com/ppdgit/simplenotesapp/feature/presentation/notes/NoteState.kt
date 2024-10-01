package com.ppdgit.simplenotesapp.feature.presentation.notes

import com.ppdgit.simplenotesapp.feature.domain.model.Note
import com.ppdgit.simplenotesapp.feature.domain.util.NoteOrder
import com.ppdgit.simplenotesapp.feature.domain.util.OrderType

data class NoteState(
    val note: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false,
)