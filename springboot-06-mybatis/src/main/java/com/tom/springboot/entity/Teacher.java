package com.tom.springboot.entity;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * ClassName: Teacher
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 20:10
 */
@Component
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class Teacher {
    private Integer teaId;
    private String teaName;
    private Integer teaAge;
    private String teaAddress;

    public Teacher() {
    }

    public Teacher(Integer teaId, String teaName, Integer teaAge, String teaAddress) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.teaAge = teaAge;
        this.teaAddress = teaAddress;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", teaAge=" + teaAge +
                ", teaAddress='" + teaAddress + '\'' +
                '}';
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public String getTeaAddress() {
        return teaAddress;
    }

    public void setTeaAddress(String teaAddress) {
        this.teaAddress = teaAddress;
    }
}
