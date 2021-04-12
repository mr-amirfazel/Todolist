import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	List[] weekToDoList=new List[7];
	weekToDoList[0]=new List("Saturday");
	weekToDoList[1]=new List("Sunday");
	weekToDoList[2]=new List("Monday");
	weekToDoList[3]=new List("Tuesday");
	weekToDoList[4]=new List("Wednesday");
	weekToDoList[5]=new List("Thursday");
	weekToDoList[6]=new List("Friday");
	menu(weekToDoList);
    }
    public static void menu(List[] toDoList){
        System.out.println("welcome to weekly to do list. choose a day");
        System.out.println("1.Saturday");
        System.out.println("2.Sunday");
        System.out.println("3.Monday");
        System.out.println("4.Tuesday");
        System.out.println("5.Wednesday");
        System.out.println("6.Thursday");
        System.out.println("7.Friday");
        collector(toDoList);
    }
    public static void collector(List[] toDoList){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        switch (x){
            case 1:Saturday(toDoList);
            break;
            case 2:Sunday(toDoList);
            break;
            case 3:Monday(toDoList);
            break;
            case 4:tuesday(toDoList);
            break;
            case 5:wednesday(toDoList);
            break;
            case 6:thursday(toDoList);
            break;
            case 7:friday(toDoList);
            break;
        }
    }
    public static void Saturday(List[] toDoList){
        System.out.println("welcome to saturdays sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[0].setTitle(title);
        listMenu(toDoList,0);
    }
    public static void Sunday(List[] toDoList){
        System.out.println("welcome to Sunday sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[1].setTitle(title);
        listMenu(toDoList,1);
    }public static void Monday(List[] toDoList){
        System.out.println("welcome to Monday sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[2].setTitle(title);
        listMenu(toDoList,2);
    }public static void tuesday(List[] toDoList){
        System.out.println("welcome to tuesday sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[3].setTitle(title);
        listMenu(toDoList,3);
    }public static void wednesday(List[] toDoList){
        System.out.println("welcome to wednesday sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[4].setTitle(title);
        listMenu(toDoList,4);
    }public static void thursday(List[] toDoList){
        System.out.println("welcome to thursday sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[5].setTitle(title);
        listMenu(toDoList,5);
    }public static void friday(List[] toDoList){
        System.out.println("welcome to friday sheet");
        System.out.println("choose a title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[6].setTitle(title);
        listMenu(toDoList,6);
    }
    public static void listMenu(List[] toDoList,int day){
        System.out.println("choose what you wanna do to the list");
        System.out.println("1.add a to do statement");
        System.out.println("2.check a to do statement");
        System.out.println("3.alter a todo statement");
        System.out.println("4.remove a todo statement");
        System.out.println("5.show todo list");
        System.out.println("6.back to main menu");
        listCollector(toDoList,day);

    }
    public static void listCollector(List[] toDoList,int day){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        switch (x){
            case 1:addToList(toDoList,day);
            break;
            case 2:checkMark(toDoList,day);
            break;
            case 3:alter(toDoList,day);
            break;
            case 4:removeFromList(toDoList,day);
            break;
            case 5:showToDoList(toDoList,day);
            break;
            case 6:menu(toDoList);
            default:listMenu(toDoList,day);
        }
    }
    public static void addToList(List[] toDoList,int day){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a todo statement");
        String todo=scanner.nextLine();
        toDoList[day].getToDos().add(todo);
        System.out.println("todo statement successfully added");
        listMenu(toDoList,day);
    }
    public static void checkMark(List[] toDoList,int day){
        System.out.println("enter the index");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        scanner.nextLine();
        toDoList[day].checkMark(index);
        System.out.println("statement check marked successfully");
        listMenu(toDoList,day);
    }
    public static void alter(List[] toDoList,int day){
        System.out.println("enter the index");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter the new statement");
        String todo=scanner.nextLine();
        toDoList[day].alter(index,todo);
        System.out.println("statement altered successfully");
        listMenu(toDoList,day);
    }
    public static void removeFromList(List[] toDoList,int day){
        System.out.println("enter the index");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        scanner.nextLine();
        toDoList[day].getToDos().remove(index-1);
        System.out.println("statement removed successfully");
        listMenu(toDoList,day);
    }
    public static void showToDoList(List[] toDoList,int day){
        toDoList[day].printList();
        listMenu(toDoList,day);
    }
}
