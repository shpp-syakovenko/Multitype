package com.serega.multitype.domain.usecase

import com.serega.multitype.data.repository.CommentsRepository

class GetCommentsUseCase(private val commentsRepository: CommentsRepository) {

    suspend fun loadComments() = commentsRepository.loadComments()
}