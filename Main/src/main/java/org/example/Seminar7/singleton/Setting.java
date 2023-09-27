package org.example.Seminar7.singleton;

public class Setting {

    private Setting(String parametr1, int parametr2, boolean parametr3) {
        this.parametr1 = parametr1;
        this.parametr2 = parametr2;
        this.parametr3 = parametr3;
    }

    private Setting() {
    }

    public static Setting getInstance() {
        if (instance == null) {
            instance = new Setting();
        //TODO: Получим  настройки, проинициализируем поля объекта
        }

        return instance;
    }

    public String getParametr1() {
        return parametr1;
    }

    public int getParametr2() {
        return parametr2;
    }

    public boolean isParametr3() {
        return parametr3;
    }

    private static Setting instance;
    public String parametr1;
    public int parametr2;
    public boolean parametr3;
}
