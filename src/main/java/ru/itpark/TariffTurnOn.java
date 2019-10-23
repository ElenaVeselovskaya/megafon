package ru.itpark;

public class TariffTurnOn extends BaseTariff {

    private int cashBack;
    private boolean megafonTV;
    private boolean unlimitedInternetForPopularService;
    private boolean alwaysInTouch;
    private boolean unlimitedInternetForPopularMessanger;
    private boolean flexibleSettingAndOptions;
    private boolean unlimitedMessages;

    public TariffTurnOn(String name, String tariffDescription, int price, int dayOfUse, int callLimit, int internetLimit,
                        int messageLimit, Boolean chooseTariff, String details, int cashBack, boolean megafonTV, boolean unlimitedInternetForPopularService,
                        boolean alwaysInTouch, boolean unlimitedInternetForPopularMessanger, boolean flexibleSettingAndOptions, boolean unlimitedMessages) {
        super(name, tariffDescription, price, dayOfUse, callLimit, internetLimit, messageLimit, chooseTariff, details);
        this.cashBack = cashBack;
        this.megafonTV = megafonTV;
        this.unlimitedInternetForPopularService = unlimitedInternetForPopularService;
        this.alwaysInTouch = alwaysInTouch;
        this.unlimitedInternetForPopularMessanger = unlimitedInternetForPopularMessanger;
        this.flexibleSettingAndOptions = flexibleSettingAndOptions;
        this.unlimitedMessages = unlimitedMessages;

    }

    public int getCashBack() {
        return cashBack;
    }

    public void setCashBack(int cashBack) {
        this.cashBack = cashBack;
    }

    public boolean isMegafonTV() {
        return megafonTV;
    }

    public void setMegafonTV(boolean megafonTV) {
        this.megafonTV = megafonTV;
    }

    public boolean isUnlimitedInternetForPopularService() {
        return unlimitedInternetForPopularService;
    }

    public void setUnlimitedInternetForPopularService(boolean unlimitedInternetForPopularService) {
        this.unlimitedInternetForPopularService = unlimitedInternetForPopularService;
    }

    public boolean isAlwaysInTouch() {
        return alwaysInTouch;
    }

    public void setAlwaysInTouch(boolean alwaysInTouch) {
        this.alwaysInTouch = alwaysInTouch;
    }

    public boolean isUnlimitedInternetForPopularMessanger() {
        return unlimitedInternetForPopularMessanger;
    }

    public void setUnlimitedInternetForPopularMessanger(boolean unlimitedInternetForPopularMessanger) {
        this.unlimitedInternetForPopularMessanger = unlimitedInternetForPopularMessanger;
    }

    public boolean isFlexibleSettingAndOptions() {
        return flexibleSettingAndOptions;
    }

    public void setFlexibleSettingAndOptions(boolean flexibleSettingAndOptions) {
        this.flexibleSettingAndOptions = flexibleSettingAndOptions;
    }

    public boolean isUnlimitedMessages() {
        return unlimitedMessages;
    }

    public void setUnlimitedMessages(boolean unlimitedMessages) {
        this.unlimitedMessages = unlimitedMessages;
    }
}
