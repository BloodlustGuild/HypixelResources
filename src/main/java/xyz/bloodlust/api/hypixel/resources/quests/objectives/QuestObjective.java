package xyz.bloodlust.api.hypixel.resources.quests.objectives;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class QuestObjective {
    @SerializedName("id")
    @Getter
    private String id;

    @SerializedName("type")
    @Getter
    private String type;

    /**
     * 0 if type is BooleanObjective.
     */
    @SerializedName("integer")
    @Getter
    private int integer = 0;
}
