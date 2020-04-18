package xyz.bloodlust.api.hypixel.resources.quests.requirements;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class QuestRequirement {
    @SerializedName("type")
    @Getter
    private String type;
}
