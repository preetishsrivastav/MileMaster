package com.example.milemaster.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.milemaster.Constants
import com.example.milemaster.roomdb.RunningDatabase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@dagger.Module
@InstallIn(ApplicationComponent.class)
object Module {

    @Singleton
    @Provides
    fun getRunningDatabase( @ApplicationContext context: Context)
    = Room.databaseBuilder(context,RoomDatabase::class.java,Constants.RUNNING_DATABASE).build()

    @Singleton
    @Provides
    fun getDao(db:RunningDatabase)=db.getDao()


}