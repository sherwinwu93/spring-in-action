package com.wusd.di;

/**
 * 勇士
 */
public class BraveKnight implements Knight {
    private Quest quest;
//    private Minstrel minstrel;

    //只要是任务,都能做
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

//    public BraveKnight(Quest quest, Minstrel minstrel) {
//        this.quest = quest;
//        this.minstrel = minstrel;
//    }

    @Override
    public void embarkOnQuest() {
//        骑士不需要了解诗人
//        minstrel.singBeforeQuest();
        quest.embark();
//        minstrel.singAfterQuest();
    }
}
