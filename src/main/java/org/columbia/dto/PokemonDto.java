package org.columbia.dto;

import org.springframework.http.codec.json.Jackson2JsonDecoder;

public class PokemonDto {

    PokemonStatsDto base;
    PokemonSkillsDto skills;

    String cname;
    String ename;

    String flatName;

    String id;
    String jname;

    String[] type;

    PokemonModelDto[] model;

    public PokemonModelDto[] getModel() {
        return model;
    }

    public void setModel(PokemonModelDto[] model) {
        this.model = model;
    }

    public String getFlatName() {
        return flatName;
    }

    public void setFlatName(String flatName) {
        this.flatName = flatName;
    }

    public PokemonStatsDto getBase() {
        return base;
    }

    public void setBase(PokemonStatsDto base) {
        this.base = base;
    }

    public PokemonSkillsDto getSkills() {
        return skills;
    }

    public void setSkills(PokemonSkillsDto skills) {
        this.skills = skills;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

}
