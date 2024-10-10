package com.rodolforuiz.dailypulse.articles.di

import com.rodolforuiz.dailypulse.articles.ArticlesDataSource
import com.rodolforuiz.dailypulse.articles.ArticlesRepository
import com.rodolforuiz.dailypulse.articles.ArticlesService
import com.rodolforuiz.dailypulse.articles.ArticlesUseCase
import com.rodolforuiz.dailypulse.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}