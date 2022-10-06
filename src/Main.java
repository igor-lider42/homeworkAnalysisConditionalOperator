public class Main {
    public static void main(String[] args) {
        // Разбор задания 1
        System.out.println("Разбор задания 1 ");
        int yearsOld = 17;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }
        if (yearsOld < 18) {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил," +
                    " и нужно немного подождать.!");
        }
        // Разбор задания 2
        System.out.println("Разбор задания 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу ");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек ходит в университет.");
        }
        if (yearsOld >= 24) {
            System.out.println("Человек ходит на работу.");
        }
        // Разбор задания 3
        System.out.println("Разбор задания 3");
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount; // стоячие места

        int seatsUsed = 23;
        int otherUsed = 17;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть ещё " + (seatsCount - seatsUsed) + " сидячих мест.");
        }
        if (seatsUsed==seatsCount){
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed==otherCount){
            System.out.println("Стоячих мест нет!");
        }
        if (otherUsed<otherCount){
            System.out.println("Есть ещё " + (otherCount - otherUsed) + " стоячих мест.");
        }





    }
}