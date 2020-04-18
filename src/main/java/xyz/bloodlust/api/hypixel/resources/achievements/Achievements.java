package xyz.bloodlust.api.hypixel.resources.achievements;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import xyz.bloodlust.api.hypixel.resources.achievements.impl.onetime.OneTimeAchievement;
import xyz.bloodlust.api.hypixel.resources.achievements.impl.tiered.TieredAchievement;

import java.util.HashMap;

public class Achievements {
    @SerializedName("one_time")
    @Getter
    private HashMap<String, OneTimeAchievement> oneTime;

    @SerializedName("tiered")
    @Getter
    private HashMap<String, TieredAchievement> tiered;

    @SerializedName("total_points")
    @Getter
    private int totalPoints;

    @SerializedName("total_legacy_points")
    @Getter
    private int totalLegacyPoints;
}
