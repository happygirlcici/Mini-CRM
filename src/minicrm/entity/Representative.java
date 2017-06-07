/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicrm.entity;

public class Representative {

    public Representative(int id, String nameFirst, String nameLast) {
        this.id = id;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    public int id;
    public String nameFirst, nameLast;

    @Override
    public String toString() {
        return String.format("%s %s", nameFirst, nameLast);
    }

}
