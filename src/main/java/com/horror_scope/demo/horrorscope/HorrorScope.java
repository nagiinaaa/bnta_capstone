package com.horror_scope.demo.horrorscope;

import java.util.Objects;

public class HorrorScope {

    private String zodiacSign;
    private String zodiacIcon;
    private String zodiacIconDark;
    private String zodiacImage;
    private String zodiacImageDark;
    private String personality;
    private String positiveMatch;
    private String negativeMatch;
    private String deathPrediction;
    private String description1;
    private String description2;
    private String description3;
    private String description4;

    public HorrorScope(String zodiacSign, String zodiacIcon, String zodiacIconDark, String zodiacImage, String zodiacImageDark, String personality, String positiveMatch, String negativeMatch, String deathPrediction, String description1, String description2, String description3, String description4) {
        this.zodiacSign = zodiacSign;
        this.zodiacIcon = zodiacIcon;
        this.zodiacIconDark = zodiacIconDark;
        this.zodiacImage = zodiacImage;
        this.zodiacImageDark = zodiacImageDark;
        this.personality = personality;
        this.positiveMatch = positiveMatch;
        this.negativeMatch = negativeMatch;
        this.deathPrediction = deathPrediction;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
        this.description4 = description4;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public String getZodiacIcon() {
        return zodiacIcon;
    }

    public void setZodiacIcon(String zodiacIcon) {
        this.zodiacIcon = zodiacIcon;
    }

    public String getZodiacIconDark() {
        return zodiacIconDark;
    }

    public void setZodiacIconDark(String zodiacIconDark) {
        this.zodiacIconDark = zodiacIconDark;
    }

    public String getZodiacImage() {
        return zodiacImage;
    }

    public void setZodiacImage(String zodiacImage) {
        this.zodiacImage = zodiacImage;
    }

    public String getZodiacImageDark() {
        return zodiacImageDark;
    }

    public void setZodiacImageDark(String zodiacImageDark) {
        this.zodiacImageDark = zodiacImageDark;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getPositiveMatch() {
        return positiveMatch;
    }

    public void setPositiveMatch(String positiveMatch) {
        this.positiveMatch = positiveMatch;
    }

    public String getNegativeMatch() {
        return negativeMatch;
    }

    public void setNegativeMatch(String negativeMatch) {
        this.negativeMatch = negativeMatch;
    }

    public String getDeathPrediction() {
        return deathPrediction;
    }

    public void setDeathPrediction(String deathPrediction) {
        this.deathPrediction = deathPrediction;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    @Override
    public String toString() {
        return "HorrorScope{" +
                "zodiacSign='" + zodiacSign + '\'' +
                ", zodiacIcon='" + zodiacIcon + '\'' +
                ", zodiacIconDark='" + zodiacIconDark + '\'' +
                ", zodiacImage='" + zodiacImage + '\'' +
                ", zodiacImageDark='" + zodiacImageDark + '\'' +
                ", personality='" + personality + '\'' +
                ", positiveMatch='" + positiveMatch + '\'' +
                ", negativeMatch='" + negativeMatch + '\'' +
                ", deathPrediction='" + deathPrediction + '\'' +
                ", description1='" + description1 + '\'' +
                ", description2='" + description2 + '\'' +
                ", description3='" + description3 + '\'' +
                ", description4='" + description4 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HorrorScope that = (HorrorScope) o;
        return Objects.equals(zodiacSign, that.zodiacSign) && Objects.equals(zodiacIcon, that.zodiacIcon) && Objects.equals(zodiacIconDark, that.zodiacIconDark) && Objects.equals(zodiacImage, that.zodiacImage) && Objects.equals(zodiacImageDark, that.zodiacImageDark) && Objects.equals(personality, that.personality) && Objects.equals(positiveMatch, that.positiveMatch) && Objects.equals(negativeMatch, that.negativeMatch) && Objects.equals(deathPrediction, that.deathPrediction) && Objects.equals(description1, that.description1) && Objects.equals(description2, that.description2) && Objects.equals(description3, that.description3) && Objects.equals(description4, that.description4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zodiacSign, zodiacIcon, zodiacIconDark, zodiacImage, zodiacImageDark, personality, positiveMatch, negativeMatch, deathPrediction, description1, description2, description3, description4);
    }
}