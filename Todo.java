public class Todo {
    private String toDo;
    boolean isChecked;

    public Todo(String toDo) {
        this.toDo = toDo;
        isChecked=false;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
