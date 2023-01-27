package com.vstream.data

import androidx.paging.PagingConfig

object FeedRepository {
    private const val NETWORK_PAGE_SIZE = 20
    private val DEFAULT_PAGING_CONFIG = PagingConfig(
            pageSize = FeedRepository.NETWORK_PAGE_SIZE,
            enablePlaceholders = false
    )
}