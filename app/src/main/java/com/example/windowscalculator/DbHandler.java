package com.example.windowscalculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DbHandler extends SQLiteOpenHelper {

    public DbHandler(@Nullable Context context) {
        super(context, "user.dp", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE user (id INTEGER PRIMARY KEY, nom TEXT, prenom TEXT, email TEXT, password TEXT, lastPassword TEXT);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean addUser()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        User u=new User(1,"Bourazza","Ahmed","Ahmed.lesnar2002@gmail.com","123","987");
        cv.put("id",u.id);
        cv.put("nom",u.nom);
        cv.put("prenom",u.prenom);
        cv.put("email",u.email);
        cv.put("password",u.password);
        cv.put("lastPassword",u.lastPassword);

        long insert = db.insert("user", null, cv);
        if (insert==-1)
            return false;
        else
            return true;
    }
    public ArrayList<Boolean> loginTest(User u) {
        boolean loginSuccessfully = false;
        boolean lastPassSuccessfully = false;
        SQLiteDatabase db = getWritableDatabase();

        String sql = "SELECT * FROM user WHERE email='" + u.email + "' AND password='" + u.password + "';";
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            loginSuccessfully = true;
        } else {
            loginSuccessfully = false;

            String sql2 = "SELECT * FROM user WHERE email='" + u.email + "' AND lastPassword='" + u.lastPassword + "';";
            Cursor cursor2 = db.rawQuery(sql2, null);
            if (cursor2.moveToFirst()) {
                lastPassSuccessfully = true;
            }
            cursor2.close();
        }
        cursor.close();

        ArrayList<Boolean> testers = new ArrayList<>();
        testers.add(loginSuccessfully);
        testers.add(lastPassSuccessfully);

        return testers;
    }

}
