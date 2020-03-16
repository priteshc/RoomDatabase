package com.example.roomapplicationdb.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomapplicationdb.Entity.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task where task= :name")
    List<Task> getAll(String name);

    @Insert
    void insert(Task task);

    @Delete
    void delete(Task task);

    @Update
    void update(Task task);
}
