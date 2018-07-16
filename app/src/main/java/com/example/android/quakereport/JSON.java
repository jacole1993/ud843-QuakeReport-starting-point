package com.example.android.quakereport;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by James on 7/12/2018.
 */

public class JSON {


    static String practiceJSON = "" +
            "{" +
            "\"VideoGames\" :[" +
            "{" +
            "\"name\":\"Five Freddy\"" +
            "\"system\":\"PC\"" +
            "\"price\":\"10\"" +
            "\"ESRP\":\"T\"" +
            "\"genre\":\"Horror\"" +
            "}" +
            "]" +
            "}";

    public static void main(String[] args) {
        {
            try {
                JSONObject root = new JSONObject(practiceJSON);
                JSONArray gamesArray = root.getJSONArray("VideoGames");
                JSONObject firstGame = gamesArray.getJSONObject(0);
                String name = firstGame.getString("name");
                System.out.println(name);
            } catch (JSONException E) {
                System.out.println("JSON wasn't found");

            }


        }
    }
}












