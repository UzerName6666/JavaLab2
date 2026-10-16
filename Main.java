
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        InputManager iout = new InputManager();
        int inputmenu;
        int inputmenuAdd;
        do { 
            System.out.println("Выбурите задачу (0 для выхода):");
            System.out.println("1 - Время");
            System.out.println("2 - Домик");
            System.out.println("3 - Сотрудники");
            System.out.println("4 - Пистолет");
            System.out.print("Введите число в диапоне [0, 4]: ");  
            inputmenu = iout.inputInt();
            iout.clearConsole();
            switch (inputmenu){
                case 0:
                    break;
                case 1:
                    System.out.println("Выберите способ создания времени: ");
                    System.out.println("1 - Демо");
                    System.out.println("2 - Секунды");
                    System.out.println("3 - Минуты, секунды");
                    System.out.println("4 - Часы, минуты, секунды");  
                    int sec, min, hour;
                    do{
                        System.out.print("Введите число в диапоне [1, 4]: ");   
                        inputmenuAdd = iout.inputInt();
                    } while(inputmenuAdd < 1 || inputmenuAdd > 4);
                        switch (inputmenuAdd) {
                            case 1:
                                System.out.println(new Time(10).toString());
                                System.out.println(new Time(10000).toString());
                                System.out.println(new Time(100000).toString());
                                break;
                            case 2:
                                System.out.println("Введите секунды: ");
                                sec = iout.inputInt();
                                System.out.println(new Time(sec).toString());
                                break;
                            case 3:
                                System.out.println("Введите минуты: ");
                                min = iout.inputInt();
                                System.out.println("Введите секунды: ");
                                sec = iout.inputInt();
                                System.out.println(new Time(min, sec).toString());
                                break;
                            case 4:
                                System.out.println("Введите часы: ");
                                hour = iout.inputInt();
                                System.out.println("Введите минуты: ");
                                min = iout.inputInt();
                                System.out.println("Введите секунды: ");
                                sec = iout.inputInt();
                                System.out.println(new Time(hour, min, sec).toString());
                                break;
                        }
                    break;
                case 2:
                    System.out.println("Выберите способ создания времени: ");
                    System.out.println("1 - Демо 1");
                    System.out.println("2 - Демо 2");
                    System.out.println("3 - Ручное создание");
                    do{
                        System.out.print("Введите число в диапоне [1, 3]: ");   
                        inputmenuAdd = iout.inputInt();
                    } while(inputmenuAdd < 1 || inputmenuAdd > 3);
                    switch (inputmenuAdd) {
                        case 1:
                            System.out.println(new House(1).toString());
                            System.out.println(new House(5).toString());
                            System.out.println(new House(24).toString());
                            break;
                        case 2:
                            System.out.println(new House(2).toString());
                            System.out.println(new House(35).toString());
                            System.out.println(new House(91).toString());
                            break;
                        case 3:
                            System.out.print("Введите количество этажей: ");
                            int floor = iout.inputInt();
                            System.out.println(new House(floor).toString());
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Выберите способ создания времени: ");
                    System.out.println("1 - Демо 1");
                    System.out.println("2 - Демо 2");
                    System.out.println("3 - Ручной ввод");
                    do{
                        System.out.print("Введите число в диапоне [1, 3]: ");   
                        inputmenuAdd = iout.inputInt();
                    } while(inputmenuAdd < 1 || inputmenuAdd > 3);
                    if(inputmenuAdd == 1){
                        Worker worker1 = new Worker("Петрова");
                        Worker worker2 = new Worker("Козлова");
                        Worker worker3 = new Worker("Сидорова");
                        Department it = new Department("ИТ");
                        
                        it.addWorker(worker1);
                        it.setLeader(worker2);
                        it.addWorker(worker3);

                        System.out.println(worker1.toString());
                        System.out.println(worker2.toString());
                        System.out.println(worker3.toString());
                    }
                    else if(inputmenuAdd == 2){
                        Worker worker1 = new Worker("Петрова");
                        Worker worker2 = new Worker("Козлова");
                        Worker worker3 = new Worker("Сидорова");
                        Department it = new Department("ИТ");
                            
                        it.addWorker(worker1);
                        it.setLeader(worker2);
                        it.addWorker(worker3);

                        System.out.println(it.toString());
                    }
                    else{
                        Vector<Worker> workers = new Vector<Worker>();
                        Vector<Department> departments = new Vector<Department>();
                        do { 
                            System.out.println("Список действий: ");
                            System.out.println("0 - Возврат");
                            System.out.println("1 - Добавить сотрудника");
                            System.out.println("2 - Добавить отдел");
                            System.out.println("3 - Назначить сотрудника в отдел");
                            System.out.println("4 - Назначить начальника в отдел");
                            System.out.println("5 - Вывести информацию о сотруднике");
                            System.out.println("6 - Вывести информацию об отделе");
                            do{
                                System.out.print("Введите число в диапоне [0, 6]: ");   
                                inputmenuAdd = iout.inputInt();
                            } while(inputmenuAdd < 0 || inputmenuAdd > 6);
                            iout.clearConsole();
                            switch (inputmenuAdd) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.print("Введите имя сотрудника: ");
                                    String workerName = iout.inputStr();
                                    Worker newWorker = new Worker(workerName);
                                    workers.addLast(newWorker);
                                    break;
                                case 2:
                                    System.out.print("Введите имя отдела: ");
                                    String depName = iout.inputStr();
                                    Department newdep = new Department(depName);
                                    departments.addLast(newdep);
                                    break;
                                case 3:
                                    if(workers.isEmpty() || departments.isEmpty()){
                                        System.out.println("Отсутствуют данные");
                                        break;
                                    }
                                    int work1;
                                    do{
                                        System.out.print("Введите номер сотрудника [0, " + (workers.size() - 1) + "]: ");   
                                        work1 = iout.inputInt();
                                    } while(work1 < 0 || work1 > workers.size() - 1);
                                    int dep1;
                                    do{
                                        System.out.print("Введите номер отдела [0, " + (departments.size() - 1) + "]: ");   
                                        dep1 = iout.inputInt();
                                    } while(dep1 < 0 || dep1 > 6);

                                    departments.elementAt(dep1).addWorker(workers.elementAt(work1));
                                    break;
                                case 4:
                                    if(workers.isEmpty() || departments.isEmpty()){
                                        System.out.println("Отсутствуют данные");
                                        break;
                                    }
                                    int work2;
                                    do{
                                        System.out.print("Введите номер сотрудника [0, " + (workers.size() - 1) + "]: ");   
                                        work2 = iout.inputInt();
                                    } while(work2 < 0 || work2 > workers.size() - 1);
                                    int dep2;
                                    do{
                                        System.out.print("Введите номер отдела [0, " + (departments.size() - 1) + "]: ");   
                                        dep2 = iout.inputInt();
                                    } while(dep2 < 0 || dep2 > 6);

                                    departments.elementAt(dep2).setLeader(workers.elementAt(work2));
                                    break;
                                case 5:
                                    if(workers.isEmpty()){
                                        System.out.println("Отсутствуют данные");
                                        break;
                                    }
                                    int work3;
                                    do{
                                        System.out.print("Введите номер сотрудника [0, " + (workers.size() - 1) + "]: ");   
                                        work3 = iout.inputInt();
                                    } while(work3 < 0 || work3 > workers.size() - 1);

                                    System.out.println(workers.elementAt(work3));
                                    break;
                                case 6:
                                    if(departments.isEmpty()){
                                        System.out.println("Отсутствуют данные");
                                        break;
                                    }
                                    int dep3;
                                    do{
                                        System.out.print("Введите номер отдела [0, " + (departments.size() - 1) + "]: ");   
                                        dep3 = iout.inputInt();
                                    } while(dep3 < 0 || dep3 > 6);
                                    System.out.println(departments.elementAt(dep3));
                                    break;
                            }

                        } while (inputmenuAdd != 0);
                    }
                    break;
                case 4:
                    int repeat = 5;
                    int bullet = 3;
                    System.out.println("Выберите способ создания времени: ");
                    System.out.println("1 - Демо");
                    System.out.println("2 - Ручное создание");
                    do{
                        System.out.print("Введите число в диапоне [1, 2]: ");   
                        inputmenuAdd = iout.inputInt();
                    } while(inputmenuAdd < 0 || inputmenuAdd > 2);
                    if(inputmenuAdd == 2){
                        System.out.print("Введите количество пуль: ");
                        bullet = iout.inputInt();
                        System.out.print("Введите количество выстрелов: ");
                        repeat = iout.inputInt();
                    }
                    Gun pistol = new Gun(bullet);
                    for(int i = 0; i < repeat; i++){
                        System.out.println(pistol.Fire());
                    }
                    break;  
                default:
                    System.out.print("Введите число в диапоне [0, 4]: ");   
            }
        } while (inputmenu != 0);

    }
}
