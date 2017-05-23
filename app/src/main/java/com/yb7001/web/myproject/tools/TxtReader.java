package com.yb7001.web.myproject.tools;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TxtReader {

    /**
     * 通过一个InputStream获取内容
     *
     * @param inputStream
     * @return
     */
    public static StringBuffer getStringBuffer(InputStream inputStream) {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "utf-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");
        String line;
        try {
            while (reader.ready()) {
                sb.append(reader.readLine()+" ");
            }
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb;
    }

    /**
     * 通过txt文件的路径获取其内容
     *
     * @param filepath
     * @return
     */
    public static StringBuffer getStringBuffer(String filepath) {
        File file = new File(filepath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return getStringBuffer(fileInputStream);
    }
    public static String getPath(Context context, Uri uri) {

        if ("content".equalsIgnoreCase(uri.getScheme())) {

            String[] projection = { "_data" };

            Cursor cursor = null;

            try {

                cursor = context.getContentResolver().query(uri, projection,
                        null, null, null);

                int column_index = cursor.getColumnIndexOrThrow("_data");

                if (cursor.moveToFirst()) {

                    return cursor.getString(column_index);

                }

            } catch (Exception e) {

                return null;

            }

        }

        else if ("file".equalsIgnoreCase(uri.getScheme())) {

            return uri.getPath();

        }

        return null;

    }



}
