package com.example.mvvmexample.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmexample.data.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}