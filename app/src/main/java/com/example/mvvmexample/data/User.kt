package com.example.mvvmexample.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    @ColumnInfo(name = "name_user")
    val name: String,
    @ColumnInfo(name = "last_name_user")
    val lastName: String,
    @ColumnInfo(name = "age_user")
    val age: String,
    @ColumnInfo(name = "password_user")
    val password: String,
    @ColumnInfo(name = "phone_user")
    val phone: String
)