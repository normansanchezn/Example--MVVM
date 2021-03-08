package com.example.mvvmexample.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmexample.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    @Singleton
    @Provides
    fun provideRoomInstance(@ApplicationContext context: Context): RoomDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "firebase-example"
    ).build()

}