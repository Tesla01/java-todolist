public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    // Menampilkan Todolist
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar java dasar";
        model[1] = "Studi kasus java dasar";
        showTodoList();
    }

    // Menambah Todo ke List
    public static void addTodoList() {
    }

    // Menghapus Todo dari List
    public static void removeTodoList() {
    }

    // Menampilkan view Todolist
    public static void viewTodoList() {
    }

    // Menampilkan view menambahkan Todolist
    public static void viewAddTodoList() {
    }

    // Menampilkan view menghapus Todolist
    public static void viewRemoveTodoList() {
    }
}
