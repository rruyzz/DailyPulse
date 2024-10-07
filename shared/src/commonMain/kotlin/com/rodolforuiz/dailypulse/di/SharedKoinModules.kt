package com.rodolforuiz.dailypulse.di

import com.rodolforuiz.dailypulse.articles.di.articlesModule


val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)