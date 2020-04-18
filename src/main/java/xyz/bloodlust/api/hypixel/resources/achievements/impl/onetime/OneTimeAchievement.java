package xyz.bloodlust.api.hypixel.resources.achievements.impl.onetime;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import xyz.bloodlust.api.hypixel.resources.achievements.impl.Achievement;

public class OneTimeAchievement extends Achievement {
    @SerializedName("points")
    @Getter
    private int points;
}
