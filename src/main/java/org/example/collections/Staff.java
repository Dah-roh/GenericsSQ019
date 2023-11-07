package org.example.collections;


import lombok.Data;
import org.example.enums.Role;

@Data
public class Staff implements Comparable<Staff>{
    private String name;
    private Integer age;
    private Role role;

    @Override
    public int compareTo(Staff o) {
        return Integer.compare(o.getRole().ordinal(), this.getRole().ordinal());
    }
}
