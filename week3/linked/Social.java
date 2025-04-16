import java.util.*;

class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; // Friend IDs of this user
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialNetwork {
    private UserNode head = null;

    // Add a new user
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newUser;
        }
    }

    // Find user by ID
    private UserNode findUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection
    public void addFriend(int userId1, int userId2) {
        UserNode u1 = findUser(userId1);
        UserNode u2 = findUser(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!u1.friendIds.contains(userId2)) u1.friendIds.add(userId2);
        if (!u2.friendIds.contains(userId1)) u2.friendIds.add(userId1);
        System.out.println("Friend connection added between " + userId1 + " and " + userId2);
    }

    // Remove friend connection
    public void removeFriend(int userId1, int userId2) {
        UserNode u1 = findUser(userId1);
        UserNode u2 = findUser(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        u1.friendIds.remove((Integer) userId2);
        u2.friendIds.remove((Integer) userId1);
        System.out.println("Friend connection removed between " + userId1 + " and " + userId2);
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUser(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println(user.name + "'s Friends:");
        for (int friendId : user.friendIds) {
            UserNode f = findUser(friendId);
            if (f != null)
                System.out.println("- " + f.name + " (ID: " + f.userId + ")");
        }
    }

    // Search by name or ID
    public void searchUser(String query) {
        UserNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (String.valueOf(temp.userId).equals(query) || temp.name.equalsIgnoreCase(query)) {
                System.out.println("Found: " + temp.name + " | ID: " + temp.userId + " | Age: " + temp.age);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("User not found.");
    }

    // Count friends of each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friend(s).");
            temp = temp.next;
        }
    }

    // Find mutual friends
    public void mutualFriends(int userId1, int userId2) {
        UserNode u1 = findUser(userId1);
        UserNode u2 = findUser(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> mutual = new HashSet<>(u1.friendIds);
        mutual.retainAll(u2.friendIds);

        if (mutual.isEmpty()) {
            System.out.println("No mutual friends between " + userId1 + " and " + userId2);
        } else {
            System.out.println("Mutual Friends:");
            for (int id : mutual) {
                UserNode user = findUser(id);
                if (user != null)
                    System.out.println("- " + user.name + " (ID: " + id + ")");
            }
        }
    }

    // Display all users
    public void displayAllUsers() {
        UserNode temp = head;
        System.out.println("All Users:");
        while (temp != null) {
            System.out.println(temp.name + " | ID: " + temp.userId + " | Age: " + temp.age);
            temp = temp.next;
        }
    }
}

public class Social {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        // Add users
        network.addUser(101, "Alice", 22);
        network.addUser(102, "Bob", 24);
        network.addUser(103, "Charlie", 21);
        network.addUser(104, "Diana", 25);

        // Add friend connections
        network.addFriend(101, 102);
        network.addFriend(101, 103);
        network.addFriend(102, 104);
        network.addFriend(103, 104);

        System.out.println();
        network.displayAllUsers();
        System.out.println();

        // Display friends of a user
        network.displayFriends(101);
        System.out.println();

        // Search user
        network.searchUser("Charlie");
        network.searchUser("105");

        System.out.println();
        // Count friends
        network.countFriends();

        System.out.println();
        // Find mutual friends
        network.mutualFriends(101, 104);

        System.out.println();
        // Remove friend
        network.removeFriend(101, 103);
        network.displayFriends(101);
    }
}
