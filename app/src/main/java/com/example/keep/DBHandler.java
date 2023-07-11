package com.example.keep;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "notesdb";

    private static final String TABLE_NAME = "notesTable";

    private static final String ID_COL = "id";
    private static final String TITLE_COL = "title";
    private static final String DESCRIPTION_COL = "description";




    public DBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " ( " +
                ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
