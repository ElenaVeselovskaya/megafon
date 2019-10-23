package ru.itpark;

public class BaseTariff {

    private String name;
    private String tariffDescription;
    private int price;
    private int dayOfUse;
    private int callLimit;
    private int internetLimit;
    private int messageLimit;
    private Boolean chooseTariff;
    private String details;

    public BaseTariff(String name, String tariffDescription, int price, int dayOfUse, int callLimit, int internetLimit, int messageLimit, Boolean chooseTariff, String details) {
        this.name = name;
        this.tariffDescription = tariffDescription;
        this.price = price;
        this.dayOfUse = dayOfUse;
        this.callLimit = callLimit;
        this.internetLimit = internetLimit;
        this.messageLimit = messageLimit;
        this.chooseTariff = chooseTariff;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTariffDescription() {
        return tariffDescription;
    }

    public void setTariffDescription(String tariffDescription) {
        this.tariffDescription = tariffDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDayOfUse() {
        return dayOfUse;
    }

    public void setDayOfUse(int dayOfUse) {
        this.dayOfUse = dayOfUse;
    }

    public int getCallLimit() {
        return callLimit;
    }

    public void setCallLimit(int callLimit) {
        this.callLimit = callLimit;
    }

    public int getInternetLimit() {
        return internetLimit;
    }

    public void setInternetLimit(int internetLimit) {
        this.internetLimit = internetLimit;
    }

    public int getMessageLimit() {
        return messageLimit;
    }

    public void setMessageLimit(int messageLimit) {
        this.messageLimit = messageLimit;
    }

    public Boolean getChooseTariff() {
        return chooseTariff;
    }

    public void setChooseTariff(Boolean chooseTariff) {
        this.chooseTariff = chooseTariff;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
