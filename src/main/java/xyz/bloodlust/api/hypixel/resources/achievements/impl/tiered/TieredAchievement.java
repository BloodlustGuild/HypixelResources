package xyz.bloodlust.api.hypixel.resources.achievements.impl.tiered;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import xyz.bloodlust.api.hypixel.resources.achievements.impl.Achievement;
import xyz.bloodlust.api.hypixel.resources.achievements.impl.tiered.tiers.AchievementTier;

import java.util.ArrayList;

public class TieredAchievement extends Achievement {
    @SerializedName("tiers")
    @Getter
    private ArrayList<AchievementTier> tiers;
}
