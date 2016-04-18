package com.example.snipeswipe.pitchit2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 3;

    // Database Name
    private static final String DATABASE_NAME = "users";

    // Contacts table name
    private static final String TABLE_CONTACTS = "users_profiles";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_AGE = "age";
    private static final String KEY_GENDER = "gender";
    private static final String KEY_HEIGHT = "height";
    private static final String KEY_WEIGHT = "weight";
    private static final String KEY_SPORT = "sport";
    private static final String KEY_EDUCATION = "education";
    private static final String KEY_LEAGUES = "leagues";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONENUMBER = "phoneNumber";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_AGE + " TEXT,"
                + KEY_GENDER + " TEXT," + KEY_HEIGHT + " TEXT," + KEY_WEIGHT + " TEXT,"+ KEY_SPORT + " TEXT,"
                + KEY_EDUCATION + " TEXT,"+ KEY_LEAGUES + " TEXT,"+KEY_EMAIL + " TEXT,"+KEY_PHONENUMBER + " TEXT"
                + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);
    }

    public void addContact(Users contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName());
        values.put(KEY_AGE, contact.getAge());
        values.put(KEY_GENDER, contact.getGender());
        values.put(KEY_HEIGHT, contact.getHeight());
        values.put(KEY_WEIGHT, contact.getWeight());
        values.put(KEY_SPORT, contact.getSport());
        values.put(KEY_EDUCATION, contact.getEducation());
        values.put(KEY_LEAGUES, contact.getLeagues());
        values.put(KEY_EMAIL, contact.getEmail());
        values.put(KEY_PHONENUMBER, contact.getPhoneNumber());
        // Contact Name
        // values.put(KEY_PH_NO, contact.getPhoneNumber()); // Contact Phone Number

        // Inserting Row
        db.insert(TABLE_CONTACTS, null, values);
        db.close(); // Closing database connection
    }

    public Users getContact(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_ID,
                        KEY_NAME, KEY_AGE, KEY_GENDER, KEY_HEIGHT, KEY_WEIGHT, KEY_SPORT, KEY_EDUCATION, KEY_LEAGUES, KEY_EMAIL,KEY_PHONENUMBER}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Users user = new Users(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),
                cursor.getString(6), cursor.getString(7), cursor.getString(8), cursor.getString(9), cursor.getString(10) );
        // return contact
        return user;
    }

    public void delete(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("delete "+TABLE_CONTACTS);
    }

    public List<Users> getAllUsers() {
        List<Users> userList = new ArrayList<Users>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Users user = new Users();
                user.setID(Integer.parseInt(cursor.getString(0)));
                user.setName(cursor.getString(1));
                user.setAge(cursor.getString(2));
                user.setGender(cursor.getString(3));
                user.setHeight(cursor.getString(4));
                user.setWeight(cursor.getString(5));
                user.setSport(cursor.getString(6));
                user.setEducation(cursor.getString(7));
                user.setLeagues(cursor.getString(8));
                user.setEmail(cursor.getString(9));
                user.setPhoneNumber(cursor.getString(10));

                userList.add(user);
            } while (cursor.moveToNext());
        }

        // return contact list
        return userList;
    }

}