package com.rodolforuiz.dailypulse.articles.di

import com.rodolforuiz.dailypulse.articles.data.ArticlesDataSource
import com.rodolforuiz.dailypulse.articles.data.ArticlesRepository
import com.rodolforuiz.dailypulse.articles.data.ArticlesService
import com.rodolforuiz.dailypulse.articles.domain.ArticlesUseCase
import com.rodolforuiz.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}