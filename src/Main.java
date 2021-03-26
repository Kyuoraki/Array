public class Main {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        String temp;
        for (int i = 0; i < colors.length / 2; i++) {
            temp = colors[colors.length - i - 1];
            colors[colors.length - i - 1] = colors[i];
            colors[i] = temp;
        }
        for (String sout : colors) {
            System.out.println(sout);
        }
        float[] temperature = new float[30];
        int countPatients = 30;
        float minTemp = 32;
        float maxTemp = 40;
        double minAliveTemp = 36.2;
        double maxAliveTemp = 36.9;
        double middleTemp = 0;
        int countAlivePatients = 0;
        System.out.println("\nКоличество пациентов: " + countPatients);
        System.out.print("Температуры пациентов: ");
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = (float) (minTemp + (maxTemp - minTemp) * Math.random());
            double result = Math.round(temperature[i] * 10.0) / 10.0;
            System.out.print(result + " ");
            middleTemp += temperature[i];
            if (temperature[i] >= minAliveTemp && temperature[i] <= maxAliveTemp) {
                countAlivePatients += 1;
            }
        }
        middleTemp = Math.round((middleTemp / temperature.length) * 100.0) / 100.0;
        System.out.println("\nСредняя температура: " + middleTemp);
        System.out.println("Количество здоровых: " + countAlivePatients);
    }
}
