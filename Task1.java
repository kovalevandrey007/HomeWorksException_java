public class Task1 {
    public static void main(String[] args) throws MyNullException, MyNumberFormatException {
        System.out.println(lastName());


    }

    public  lastName() throws MyNullException, MyNumberFormatException {
        String LastName = "sfdgds";
        String Name = "dsfdf";
        String SuriName = "12";
        try {
            if (!((LastName).isEmpty() || (Name).isEmpty() || (SuriName).isEmpty())) {
            } else throw new MyNullException();
            if ((LastName).matches("^[а-яА-ЯёЁa-zA-Z0-9]+$") || (Name).matches("^[а-яА-ЯёЁa-zA-Z0-9]+$") || (SuriName).matches("^[а-яА-ЯёЁa-zA-Z0-9]+$")) {

            } else throw new MyNumberFormatException();
        } catch (MyNullException e) {
            throw new MyNullException();
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException();
        }
    }
}





//            try {
//                SimpleDateFormat formater = new SimpleDateFormat("dd.mm.yyyy");
//                if (date == formater.format(date)) {
//                    System.out.println(date);
//                } else;
//            } catch (MyDataException e) {
//                throw new MyDataException();
//            }
//        }
//    }
//}


//        boolean isGood = true; // 1 обработчик
//        try {
//            if (!(LastName.isEmpty() || Name.isEmpty() || SuriName.isEmpty())) { // соответствие его длины и ширины на квадрат 4х4
//                System.out.println(LastName + ";" + Name + ";" + SuriName);
//                if (LastName.isEmpty() || Name.isEmpty() || SuriName.isEmpty()) isGood = false;
//            } else isGood = true;  // 2 обработчик
//        } catch (MyNullException e) {
//                 throw new MyNullException();
//        }
//        try {
//            Integer.parseInt(LastName);
//            isGood = false;
//        } catch (MyNumberFormatException e) {
//            throw new MyNumberFormatException();
//        }
//    }
//}



//                if (LastName != null) {
//                    System.out.println(LastName + " " + Name + " " + SuriName + " ");
//                } else  LastName = null ;
//            } catch (MyNullException e) {
//                throw new MyNullException("Вы ввели пустое значение!");
//            }
//    }
//}


//        try {
//            if (LastName.isEmpty() || Name.isEmpty() || SuriName.isEmpty()) ;
//        } catch (MyNullException e) {
//            throw new MyNullException("Вы ввели пустое значение!");
//        }
//        try {
//            if (LastName.equals("1234567890".split("")) || Name.equals("1234567890".split("")) || SuriName.equals("1234567890".split("")))
//                ;
//        } catch (NumberFormatException e) {
//            System.out.println("Вы ввели не тот формат числа!");
//        }
//        return LastName;
//    }

//    public static String DateHap(String Birthsday) {
//        SimpleDateFormat s = new SimpleDateFormat("dd.mm.yyyy");
//        try {
//            Date date = s.parse(Birthsday);
//        } catch (ParseException e) {
//            throw new RuntimeException("Вы ввели не верный формат!");
//        }
//        return Birthsday;
//    }
//
//    public static String Phone(Integer PhoneNumber) {
//        try {
//            if (PhoneNumber.describeConstable().isEmpty()) ;
//        } catch (NullPointerException e) {
//            throw new RuntimeException("Вы ввели пустое значение!");
//        }
//        return String.valueOf(PhoneNumber);
//    }
//
//    public static String Meil(String meil) {
//        try {
//            if (meil.isEmpty()) ;
//        } catch (NullPointerException e) {
//            throw new RuntimeException("Вы ввели пустое значение!");
//
//        }
//        return meil;
//    }
//

//    public static void main(String[] args) throws MyArrayIndexOutEx, MyNullException, NumberFormatException {
//
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Введите Фамилию: ");
//            String LastName = sc.nextLine();
//            System.out.println("Введите Имя: ");
//            String Name = sc.nextLine();
//            System.out.println("Введите Отчество: ");
//            String SuriName = sc.nextLine();
//            System.out.println("Введите дату своего рождения формата 'dd.mm.yyyy': ");
//            String Birthsday = sc.nextLine();
//            System.out.println("Введите номер своего телефона: ");
//            Integer PhoneNumber = sc.nextInt();
//            System.out.println("Введите ваш пол: ");
//            String meil = sc.nextLine();
//
//            ArrayList<String> fio = new ArrayList<>();
//            fio.add(LastName(LastName, Name, SuriName));
//            fio.add(DateHap(Birthsday));
//            fio.add(Phone(PhoneNumber));
//            fio.add(Meil(meil));
//            System.out.println(fio);
//        } catch (MyNumberFormatException e) {
//            throw new RuntimeException(e);
//        } catch (MyNullException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}




//            if (LastName.isEmpty() || Name.isEmpty() || SuriName.isEmpty()) {
//                throw new NullPointerException("Вы ввели пустое значение");
//            } else if (Name.equals("1" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" +"0")) {
//                throw new NumberFormatException("Это числа!!!");
//            } else {
//                fio.add(LastName + " ");
//                fio.add(Name + " ");
//                fio.add(SuriName + " ");
//                fio.add(Birthsday + " ");
//                System.out.println(fio);
//            }
//          String num = "1234567890";
//        String []nums = num.split(" ");
//            for (int i = 0; i < nums.length; i++) {
//
//            //              if (name.contains("1")) {
//
//        } catch (NullPointerException | NumberFormatException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//                if (fio == null || name.length() == 0) {
//                    scanner.nextLine();
 //               }
//
//        } catch (NumberFormatException e) {
//            throw new MyNumberFormatException("Вы ввели неверные данные или числа");
//        } catch (MyNullException e) {
//            throw new MyNullException("Нихрена нет!");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new MyArrayIndexOutEx("Неправельно введены данные!");
//        }










