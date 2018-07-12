package org.columbia.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PokemonSkillsDto {

    int[] egg;
    int[] level_up;
    int[] tm;
    int[] transfer;
    int[] tutor;

    @JsonAlias("pre-evolution")
    int[] preevolution;

    public int[] getPreevolution() {
        return preevolution;
    }

    public void setPreevolution(int[] preevolution) {
        this.preevolution = preevolution;
    }

    public int[] getEgg() {
        return egg;
    }

    public void setEgg(int[] egg) {
        this.egg = egg;
    }

    public int[] getLevel_up() {
        return level_up;
    }

    public void setLevel_up(int[] level_up) {
        this.level_up = level_up;
    }

    public int[] getTm() {
        return tm;
    }

    public void setTm(int[] tm) {
        this.tm = tm;
    }

    public int[] getTransfer() {
        return transfer;
    }

    public void setTransfer(int[] transfer) {
        this.transfer = transfer;
    }

    public int[] getTutor() {
        return tutor;
    }

    public void setTutor(int[] tutor) {
        this.tutor = tutor;
    }

}
