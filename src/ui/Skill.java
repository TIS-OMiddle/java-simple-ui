package ui;

/**
 * 技能属性
 */
public class Skill {
    private String skillName;//技能名
    private int skillLength;//技能长度
    private String key;//按键
    private int delay;//延迟
    private int cd;//cd
    private int priority;//优先级

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillLength() {
        return skillLength;
    }

    public void setSkillLength(int skillLength) {
        this.skillLength = skillLength;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
