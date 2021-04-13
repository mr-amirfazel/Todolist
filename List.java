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
    public void checkMark(int index){
        String string=toDos.get(index-1).getToDo()+"  ☑  ";
        toDos.get(index-1).setToDo(string);
        toDos.get(index-1).setChecked(true);
      }
    public void alter(int ind,String newtodo){
        toDos.get(ind-1).setToDo(newtodo);
    }

}
