package com.github.sirdeerhead.dailyspending.room

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CashFlowDatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        CashFlowDatabase::class.java,
        "cashFlow_database"
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: CashFlowDatabase) = database.cashFlowDao()
}