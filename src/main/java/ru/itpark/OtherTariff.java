package ru.itpark;

public class OtherTariff extends BaseTariff {
    private boolean perMinuteBilling;
    private boolean perSecondBilling;
    private boolean unlimitedCallWithinNetwork;

    public OtherTariff(String name, String tariffDescription, int price, int dayOfUse, int callLimit, int internetLimit,
                       int messageLimit, Boolean chooseTariff, String details, boolean perMinuteBilling, boolean perSecondBilling, boolean unlimitedCallWithinNetwork) {
        super(name, tariffDescription, price, dayOfUse, callLimit, internetLimit, messageLimit, chooseTariff, details);
        this.perMinuteBilling = perMinuteBilling;
        this.perSecondBilling = perSecondBilling;
        this.unlimitedCallWithinNetwork = unlimitedCallWithinNetwork;
    }

    public boolean isPerMinuteBilling() {
        return perMinuteBilling;
    }

    public void setPerMinuteBilling(boolean perMinuteBilling) {
        this.perMinuteBilling = perMinuteBilling;
    }

    public boolean isPerSecondBilling() {
        return perSecondBilling;
    }

    public void setPerSecondBilling(boolean perSecondBilling) {
        this.perSecondBilling = perSecondBilling;
    }

    public boolean isUnlimitedCallWithinNetwork() {
        return unlimitedCallWithinNetwork;
    }

    public void setUnlimitedCallWithinNetwork(boolean unlimitedCallWithinNetwork) {
        this.unlimitedCallWithinNetwork = unlimitedCallWithinNetwork;
    }
}
