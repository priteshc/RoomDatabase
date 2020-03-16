package com.example.roomapplicationdb.appdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomapplicationdb.Entity.Task;
import com.example.roomapplicationdb.dao.TaskDao;

@Database(entities = {Task.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract TaskDao taskDao();
}
