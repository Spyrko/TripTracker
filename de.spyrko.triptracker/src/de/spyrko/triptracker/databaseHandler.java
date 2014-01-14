package de.spyrko.triptracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHandler extends SQLiteOpenHelper
{
	private final static int DATABASE_VERSION = 1;
	
	public databaseHandler(Context context)
	{
		super(context, context.getString(R.string.databaseName), null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase myDB)
	{
		myDB.execSQL("CREATE TABLE IF NOT EXISTS "
				+ R.string.tripTable
				+ " (_id integer primary key autoincrement, name varchar(100), start varchar(100), end varchar(100), bemerkungen varchar(255))"
				+ ";");
		myDB.execSQL("CREATE TABLE IF NOT EXISTS "
				+ R.string.wayPointTable
				+ " (_id integer primary key autoincrement, name varchar(100), model varchar(100), bemerkungen varchar(255), kraftstoffart integer(3), tankinhalt integer(3))"
				+ ";");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{		
	}
}
