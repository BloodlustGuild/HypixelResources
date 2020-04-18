package xyz.bloodlust.api.hypixel.resources.achievements.impl;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class Achievement {
    @SerializedName("name")
    @Getter
    private String name = "";

    @SerializedName("description")
    @Getter
    private String description = "";
}
