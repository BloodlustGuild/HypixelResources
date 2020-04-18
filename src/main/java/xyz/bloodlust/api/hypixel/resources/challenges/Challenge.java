package xyz.bloodlust.api.hypixel.resources.challenges;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import xyz.bloodlust.api.hypixel.resources.quests.rewards.QuestReward;

import java.util.ArrayList;

public class Challenge {
    @SerializedName("id")
    @Getter
    private String id;

    @SerializedName("name")
    @Getter
    private String name;

    /**
     * Quest Rewards and Challenge Rewards are the same object.
     */
    @SerializedName("rewards")
    @Getter
    private ArrayList<QuestReward> rewards;
}
