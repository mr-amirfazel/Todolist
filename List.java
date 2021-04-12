/**
 * @author fazel
 * @version 1.0
 */

import java.util.ArrayList;

public class List {
    private String title;
    private String day;
    private ArrayList<String> toDos;

    /**
     * constructor for List class
     * @param day
     */
    public List(String day) {
        this.day = day;
        toDos=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getToDos() {
        return toDos;
    }

    public void setToDos(ArrayList<String> toDos) {
        this.toDos = toDos;
    }
    public void printList(){
        System.out.println("TITLE :"+"\n"+getTitle()+"\n");
        int i=1;
        for (String note:toDos){
            System.out.println(i+")"+note);
            i++;
        }
    }
    public void checkMark(int index){
        String string=toDos.get(index-1)+"☑";
        toDos.remove(toDos.get(index-1));
        toDos.add(string);

    }
    public void alter(int ind,String newtodo){
        toDos.remove(toDos.get(ind-1));
        toDos.add(newtodo);

    }

}
