package com.serega.multitype.data.repository.impl

import com.serega.multitype.data.repository.CommentsRepository
import com.serega.multitype.domain.entity.Comment

class CommentsRepositoryImpl : CommentsRepository {


    override suspend fun loadComments(): List<Comment> {
        return listOf(
            Comment(id = "1", body = "Comment 1"),
            Comment(id = "2", body = "Comment 2"),
            Comment(id = "3", body = "Comment 3"),
            Comment(id = "4", body = "Comment 4"),
            Comment(id = "5", body = "Comment 5"),
            Comment(id = "6", body = "Comment 6"),
            Comment(id = "7", body = "Comment 7"),
            Comment(id = "8", body = "Comment 8"),
            Comment(id = "9", body = "Comment 9"),
        )
    }
}