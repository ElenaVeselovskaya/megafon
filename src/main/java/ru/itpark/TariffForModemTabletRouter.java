package ru.itpark;

public class TariffForModemTabletRouter extends BaseTariff {

    public TariffForModemTabletRouter(String name, String tariffDescription, int price, int dayOfUse, int callLimit, int internetLimit, int messageLimit, Boolean chooseTariff, String details) {
        super(name, tariffDescription, price, dayOfUse, callLimit, internetLimit, messageLimit, chooseTariff, details);

    }
}
