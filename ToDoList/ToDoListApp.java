package Dsa;
    public class ToDoListApp {


        class Task {
            String Title;
            String Description;
            boolean completed;


            public Task(String Title, String Description) {
                this.Title = Title;
                this.Description = Description;
                this.completed = false;
            }


            String getTitle() {
                return Title;
            }


            String getDescription() {
                return Description;
            }


            boolean isCompleted() {
                return completed;
            }

            void markCompleted() {
                this.completed = true;
            }
        }


        static class Node {
            Task task;
            Node next;


            public Node(Task task) {
                this.task = task;
                this.next = null;
            }
        }


        static class ToDoList {
            private Node head;


            public void addToDo(Task task) {
                Node newNode = new Node(task);
                if (head == null) {
                    head = newNode;
                } else {
                    Node current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newNode;
                }
            }


            void markToDoAsCompleted(String title) {
                Node current = head;
                while (current != null) {
                    if (current.task.getTitle().equalsIgnoreCase(title)) {
                        current.task.markCompleted();
                        return;
                    }
                    current = current.next;
                }
                System.out.println("Task with title \"" + title + "\" not found.");
            }


            void viewToDoList() {
                Node current = head;
                while (current != null) {
                    Task task = current.task;
                    System.out.println("Title: " + task.getTitle());
                    System.out.println("Description: " + task.getDescription());
                    System.out.println("Completed: " + (task.isCompleted() ? "Yes" : "No"));
                    System.out.println();
                    current = current.next;
                }
            }
        }

        public static void main(String[] args) {
            ToDoList toDoList = new ToDoList();


            Task task1 = new ToDoListApp().new Task("Buy Groceries", "Buy milk, eggs, and bread from the supermarket.");
            Task task2 = new ToDoListApp().new Task("Finish Homework", "Complete math and science assignments.");
            Task task3 = new ToDoListApp().new Task("Call Mom", "Call mom to catch up and check in.");

            toDoList.addToDo(task1);
            toDoList.addToDo(task2);
            toDoList.addToDo(task3);


            System.out.println("To-Do List:");
            toDoList.viewToDoList();


            toDoList.markToDoAsCompleted("Finish Homework");


            System.out.println("To-Do List after marking 'Finish Homework' as completed:");
            toDoList.viewToDoList();
        }
    }
