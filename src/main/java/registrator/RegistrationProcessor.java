package registrator;

public class RegistrationProcessor {
    public static void main(String[] args) {
        System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...");
        String userName = "";
        int Number = 0;
        PlayGuessTheNumberAHuman c = new PlayGuessTheNumberAHuman();
        boolean change = true;
        do {
            userName = UserRegistrator.regName();
        } while (!UserRegistrator.checkName(userName));

        int age = 0;

        do {
            age = UserRegistrator.regAge();

        } while (!UserRegistrator.checkAge(age));

        User user = new User(userName, age);
        System.out.println("------------------------------------------------");
        System.out.println("Успешная регистрация пользователя " + user.getName());
        System.out.println("Добрый день, " + user.getName());
        System.out.println("------------------------------------------------");
        user.showUserInfo();
        System.out.println("------------------------------------------------");
        System.out.println("Поиграем? Угадать число (1) или Загадать число(2)?");
        if(UserRegistrator.regChange() == 1){
            do {
               c.Show_random();
               c.setUser_number();


            }while (!c.compare());
        }






    }
}