/**
 * @author fazel
 * @version 1.0
 */

import java.util.ArrayList;

public class List {
    private String title;
    private String day;
    private ArrayList<Todo> toDos;

    /**
     * constructor for List class
     * @param day
     */
    public List(String day) {
        this.day = day;
        toDos=new ArrayList<>();
        title=" ";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Todo> getToDos() {
        return toDos;
    }

    public void setToDos(ArrayList<Todo> toDos) {
        this.toDos = toDos;
    }
    public void printList(){
        System.out.println(day+"'s sheet");
        System.out.println("TITLE :"+"\n"+getTitle()+"\n");
        int i=1;
        for (Todo note:toDos){
            System.out.println(i+")"+note.getToDo());
            i++;
        }
    }
    public  void printUndone(){
        System.out.println(day+"'s Undone Tasks: ");
        int i=1;
        for (Todo note:toDos ){
            if(!note.isChecked){
                System.out.println(i+")"+note.getToDo());
                i++;
            }

        }
    }
    public  void printdone(){
        System.out.println(day+"'s done Tasks: ");
        int i=1;
        for (Todo note:toDos ){
            if(note.isChecked){
                System.out.println(i+")"+note.getToDo());
                i++;
            }

        }
    }
    public void checkMark(int index){
        if((index>=1)&&(index<= toDos.size())) {
            String string = toDos.get(index - 1).getToDo() + "  ☑  ";
            toDos.get(index - 1).setToDo(string);
            toDos.get(index - 1).setChecked();
            System.out.println("statement check marked successfully");
        }
        else
            System.out.println("the index doesnt exist");
      }
    public void alter(int ind,String newtodo){
        if((ind>=1)&&(ind<= toDos.size())) {
            if (toDos.get(ind - 1).isChecked)
                newtodo = newtodo + " ☑ ";
            toDos.get(ind - 1).setToDo(newtodo);
            System.out.println("statement altered successfully");
        }
        else
            System.out.println("the index doesnt exist");
    }
    public void remove(int index){
        if((index>=1)&&(index<= toDos.size())) {
           toDos.remove(index-1);
        }
        else
         System.out.println("statement removed successfully");
    }

}
