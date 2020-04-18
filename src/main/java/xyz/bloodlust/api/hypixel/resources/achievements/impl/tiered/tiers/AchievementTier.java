package xyz.bloodlust.api.hypixel.resources.achievements.impl.tiered.tiers;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class AchievementTier {
    @SerializedName("tier")
    @Getter
    private int tier;

    @SerializedName("points")
    @Getter
    private int points;

    @SerializedName("amount")
    @Getter
    private int amount;
}
