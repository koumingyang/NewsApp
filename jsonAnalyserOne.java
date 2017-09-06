package com.example.kmy.tmp;

import org.json.JSONArray;
import org.json.*;

import java.util.*;

/**
 * Created by kmy on 2017/9/6.
 */

public class jsonAnalyserOne {
    News tmp;
    jsonAnalyserOne (String jsonString) {
        try {
            JSONObject list = new JSONObject(jsonString.toString());
            tmp = new News();
            tmp.newsClassTag = list.getString("newsClassTag");
            tmp.news_ID = list.getString("news_ID");
            tmp.news_Source = list.getString("news_Source");
            tmp.news_Title = list.getString("news_Title");
            tmp.news_Time = list.getString("news_Time");
            tmp.news_URL = list.getString("news_URL");
            tmp.news_Author = list.getString("news_Author");
            tmp.lang_Type = list.getString("lang_Type");
            tmp.news_Pictures = list.getString("news_Pictures");
            tmp.news_Video = list.getString("news_Video");
            tmp.news_Intro = list.getString("news_Intro");
            tmp.inborn_KeyWords = list.getString("inborn_KeyWords");
            tmp.news_Content = list.getString("news_Content");
            tmp.crawl_Source = list.getString("crawl_Source");
            tmp.news_Journal = list.getString("news_Journal");
            tmp.crawl_Time = list.getString("crawl_Time");
            tmp.repeat_ID = list.getString("repeat_ID");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
