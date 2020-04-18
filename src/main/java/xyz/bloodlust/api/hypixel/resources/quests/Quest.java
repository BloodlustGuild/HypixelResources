package xyz.bloodlust.api.hypixel.resources.quests;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import xyz.bloodlust.api.hypixel.resources.quests.objectives.QuestObjective;
import xyz.bloodlust.api.hypixel.resources.quests.requirements.QuestRequirement;
import xyz.bloodlust.api.hypixel.resources.quests.rewards.QuestReward;

import java.util.ArrayList;

public class Quest {
    @SerializedName("id")
    @Getter
    private String id;

    @SerializedName("name")
    @Getter
    private String name;

    @SerializedName("rewards")
    @Getter
    private ArrayList<QuestReward> rewards;

    @SerializedName("objectives")
    @Getter
    private ArrayList<QuestObjective> objectives;

    @SerializedName("requirements")
    @Getter
    private ArrayList<QuestRequirement> requirements;
}
