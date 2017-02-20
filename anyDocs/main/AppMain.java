package pckgzz.main;


import mvc.model.TempUser;
import pckgzz.logic.wellcome.WellCome;


//   Начало прораммы.  WellCome.wellCome() запускает процесс авторизации или регистрации ...

          ////    не будет этого файла в веб приложении

public class AppMain {

    public static void main(String[] args) {
        TempUser tempUser = new TempUser();
        try {
            // при запуске программы вываливаемся в меню где предложено авторизоваться или зарегистрироваться
            WellCome.wellCome(tempUser);

        } catch (Exception e){

            System.out.println("Исключение при регистрации  ");

            e.printStackTrace();
        }


    }
}
