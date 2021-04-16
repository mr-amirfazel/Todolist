import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     System.out.println("welcome to the todolist app.choose an option");
	List[] weekToDoList=new List[7];
	weekToDoList[0]=new List("Saturday");
	weekToDoList[1]=new List("Sunday");
	weekToDoList[2]=new List("Monday");
	weekToDoList[3]=new List("Tuesday");
	weekToDoList[4]=new List("Wednesday");
	weekToDoList[5]=new List("Thursday");
	weekToDoList[6]=new List("Friday");
	Menu(weekToDoList);
    }
    public static void Menu(List[] toDoList){

        System.out.println("1.Days");
        System.out.println("2.show List");
        System.out.println("3.show my Undone Tasks");
        System.out.println("4.what Have I done so far?");
        System.out.println("5.Exit");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        String nokhodi = scanner.nextLine();
        switch (x){
            case 1:menu(toDoList);
                break;
            case 2:printWholeList(toDoList);
                break;
            case 3:printUndoneTasks(toDoList);
            break;
            case 4:doneTasks(toDoList);
            break;
            case 5:Exit();
                break;
            default:break;
        }
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
        System.out.println("8.Main menu");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        String nokhodi= scanner.nextLine();
        switch (x){
            case 1:listMenu(toDoList,0);
                break;
            case 2:listMenu(toDoList,1);
                break;
            case 3:listMenu(toDoList,2);
                break;
            case 4:listMenu(toDoList,3);
                break;
            case 5:listMenu(toDoList,4);
                break;
            case 6:listMenu(toDoList,5);
                break;
            case 7:listMenu(toDoList,6);
                break;
            case 8:Menu(toDoList);
                break;
        }
    }
    public static void listMenu(List[] toDoList,int day){
        System.out.println("choose what you wanna do to the list");
        System.out.println("1.add a to do statement");
        System.out.println("2.check a to do statement");
        System.out.println("3.alter a todo statement");
        System.out.println("4.remove a todo statement");
        System.out.println("5.show todo list");
        System.out.println("6.choose Title");
        System.out.println("7.show undone Tasks");
        System.out.println("8.back to main menu");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
       String nokhodi= scanner.nextLine();
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
            case 6:setTitle(toDoList,day);
                break;
            case 7:printUndoneTasks(toDoList,day);
            break;
            case 8:Menu(toDoList);
            break;
            default:listMenu(toDoList,day);
        }

    }
    public static void addToList(List[] toDoList,int day){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a todo statement");
        System.out.println("enter finish to stop adding");
        String todo=scanner.nextLine();
        while(!todo.equals("finish")){
            toDoList[day].getToDos().add(new Todo(todo));
            System.out.println("-----todo statement successfully added-----");
            todo=scanner.nextLine();
        }

        listMenu(toDoList,day);
    }
    public static void checkMark(List[] toDoList,int day){
        System.out.println("enter the index");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        scanner.nextLine();
        toDoList[day].checkMark(index);
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
        listMenu(toDoList,day);
    }
    public static void removeFromList(List[] toDoList,int day){
        System.out.println("enter the index");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        scanner.nextLine();
        toDoList[day].remove(index);
        listMenu(toDoList,day);
    }
    public static void showToDoList(List[] toDoList,int day){
        toDoList[day].printList();
        listMenu(toDoList,day);
    }
    public static void setTitle(List[] toDoList,int day){
        System.out.println("enter your title");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        toDoList[day].setTitle(title);
        listMenu(toDoList,day);
    }
    public static void printWholeList(List[] toDoList){
        for (int i=0;i<toDoList.length;i++){
            toDoList[i].printList();
        }
        Menu(toDoList);
    }
    public static void printUndoneTasks(List[] toDoList,int day){
        toDoList[day].printUndone();
        listMenu(toDoList,day);
    }
    public static void printUndoneTasks(List[] toDoList){
       for(int i=0;i<7;i++){
           boolean hasUndoneTask=false;
            for(int j=0;j<toDoList[i].getToDos().size();j++){
                if(!toDoList[i].getToDos().get(j).isChecked){
                    hasUndoneTask=true;
                    break;
                }
            }
            if(hasUndoneTask)
           toDoList[i].printUndone();
       }
        Menu(toDoList);
    }
    public static void doneTasks(List[] toDoList){
        for (int i=0;i<toDoList.length;i++){
            toDoList[i].printdone();
        }
        Menu(toDoList);
    }
    public  static void Exit(){
        System.out.println("exited successfully");
       // System.exit(1);
    }
}
