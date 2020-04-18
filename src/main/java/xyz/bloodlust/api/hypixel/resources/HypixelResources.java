package xyz.bloodlust.api.hypixel.resources;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import xyz.bloodlust.api.hypixel.resources.achievements.Achievements;
import xyz.bloodlust.api.hypixel.resources.challenges.Challenge;
import xyz.bloodlust.api.hypixel.resources.quests.Quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;

public class HypixelResources {
    private static final String BASE_URL = "https://api.hypixel.net/resources/";
    private static Gson gson = new Gson();

    public static HashMap<String, Achievements> getAchievements() throws IOException {
        return gson.fromJson(getJson("achievements"), new TypeToken<HashMap<String, Achievements>>(){}.getType());
    }

    public static HashMap<String, ArrayList<Quest>> getQuests() throws IOException {
        return gson.fromJson(getJson("quests"), new TypeToken<HashMap<String, ArrayList<Quest>>>(){}.getType());
    }

    public static HashMap<String, ArrayList<Challenge>> getChallenges() throws IOException {
        return gson.fromJson(getJson("challenges"), new TypeToken<HashMap<String, ArrayList<Quest>>>(){}.getType());
    }

    private static JsonObject getJson(String endpoint) throws IOException {
        String url = BASE_URL + endpoint;
        JsonObject object = readJsonUrl(url).getAsJsonObject().getAsJsonObject(endpoint);
        if (object.has("success")) if (!object.get("success").getAsBoolean()) throw new IOException();
        return object;
    }

    private static JsonElement readJsonUrl(String url) throws IOException {
        return new JsonParser().parse(getPage(url));
    }

    private static String getPage(String url) throws IOException {
        URL url1 = new URL(url);
        URLConnection connection = url1.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
        connection.connect();
        BufferedReader serverResponse = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = serverResponse.readLine();
        serverResponse.close();
        return response;
    }
}
