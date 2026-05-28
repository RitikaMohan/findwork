package org.example.findwork.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class JobPost {

    private String desc;
    private int exp;
    private String profile;
    private String[] techs;

    public JobPost() {
    }

    public int getExperience() {
        return exp;
    }

    public void setExperience(int experience) {
        this.exp = experience;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String description) {
        this.desc = description;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "description='" + desc + '\'' +
                ", experience=" + exp +
                ", profile='" + profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
