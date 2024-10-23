package com.rodolforuiz.dailypulse.articles.presentation

import com.rodolforuiz.dailypulse.articles.domain.Article

class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null,
)