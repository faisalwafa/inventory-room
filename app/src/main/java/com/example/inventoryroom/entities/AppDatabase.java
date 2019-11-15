package com.example.inventoryroom.entities;

import android.app.Application;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Barang.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
//    private static AppDatabase db;
//
//    public static AppDatabase getInstance(Context context) {
//        db = Room.databaseBuilder(context.getApplicationContext(),
//                AppDatabase.class, "barangdb").build();
//        return db;
//    }
}
