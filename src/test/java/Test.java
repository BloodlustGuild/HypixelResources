import xyz.bloodlust.api.hypixel.resources.HypixelResources;
import xyz.bloodlust.api.hypixel.resources.quests.Quest;
import xyz.bloodlust.api.hypixel.resources.quests.rewards.QuestReward;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Quest> quests = HypixelResources.getQuests().get("quake");

        System.out.println("Quake Quests:");
        for (Quest quest : quests) {
            System.out.println("Name: " + quest.getName());
            System.out.println("Rewards:");
            for (QuestReward reward : quest.getRewards())
                System.out.println(reward.getType() + ": " + reward.getAmount());
        }
    }
}
