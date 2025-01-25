package lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputAndOutputStream {

    public static void main(String[] args) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("idea\\users.txt"))) {

            List<User> users = (List<User>) inputStream.readObject();
            System.out.println(users);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void ObjectOutputStream() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            users.add(new User(i * 40L,
                    "userName-> " + i,
                    "lastName-> " + i,
                    "firstName-> " + i));
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("users.txt"))) {
            outputStream.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class User implements Serializable {
    private Long chatId;
    private String userName;
    private String lastName;
    private String firstName;

    public User(Long chatId, String userName, String lastName, String firstName) {
        this.chatId = chatId;
        this.userName = userName;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "chatId=" + chatId +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

}
