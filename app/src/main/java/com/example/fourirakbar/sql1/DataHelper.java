package com.example.fourirakbar.sql1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by fourirakbar on 10/1/2017.
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatadiri.db"; //databasen name
    private static final int DATABASE_VERISON = 1; //database version

    //buat constructor (Harus sama dengan nama class)
    public DataHelper (Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERISON); //panggil database name & database version
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);"; //buat nyimpen data-datanya
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql); //execute db
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        
    }

}
