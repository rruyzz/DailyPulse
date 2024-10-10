package com.rodolforuiz.dailypulse.di

import app.cash.sqldelight.db.SqlDriver
import com.rodolforuiz.dailypulse.db.DatabaseDriverFactory
import org.koin.dsl.module
import rodolforuiz.dailypulse.db.DailyPulseDatabase

val databaseModule = module {

    single<SqlDriver> { DatabaseDriverFactory().createDriver() }

    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}