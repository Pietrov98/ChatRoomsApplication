package com.Pietrov98.chatwebapp.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    @Column(name="roomname")
    private String roomName;
    private String password;
    @Column(name="currentusersnumber")
    private Integer currentUsersNumber;
    @Column(name="maxusersnumber")
    private Integer maxUsersNumber;

    /**
     * hibernate needs it
     */
    public Room(){}

    public Room(Integer id, String roomName, String password, Integer qty, Integer currentUsersNumber, Integer maxUsersNumber){
        this.id = id;
        this.roomName = roomName;
        this.password = password;
        this.currentUsersNumber = currentUsersNumber;
        this.maxUsersNumber = maxUsersNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCurrentUsersNumber() {
        return currentUsersNumber;
    }

    public void setCurrentUsersNumber(Integer currentUsersNumber) {
        this.currentUsersNumber = currentUsersNumber;
    }

    public Integer getMaxUsersNumber() {
        return maxUsersNumber;
    }

    public void setMaxUsersNumber(Integer maxUsersNumber) {
        this.maxUsersNumber = maxUsersNumber;
    }
}
