//創造一個 Temperature類別。
public class Temperature {

//        定義攝氏溫度到華氏溫度的轉換公式
        double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        // 定義華氏溫度到攝氏溫度的轉換公式
        double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

    }