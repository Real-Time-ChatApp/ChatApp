package com.marconi.chatapp.presentation.chat

import com.marconi.chatapp.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)