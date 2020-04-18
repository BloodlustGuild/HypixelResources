package xyz.bloodlust.api.hypixel.resources.quests.rewards;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class QuestReward {
    @SerializedName("type")
    @Getter
    private String type;

    @SerializedName("amount")
    @Getter
    private int amount;
}
